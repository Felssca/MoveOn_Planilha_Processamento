/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processo;

import IO.CarregarArquivo;
import beans.Alunos;
import java.io.IOException;
import java.util.List;
import negocio.AlgoClassificacao;
import util.Legendas;
import util.Validacoes;

/**
 *
 * @author FelipeSSCA
 */
public class IniciarProcesso {

    private List<Alunos> listaAlunos = null;

    public List<Alunos> getListaAluns() {
        return listaAlunos;
    }

    public void iniciarProcessoLeituraXls(String filePath) throws IOException, Exception {

        CarregarArquivo carregarArquivo = new CarregarArquivo();
        carregarArquivo.carregarArquivos(filePath);
        AlgoClassificacao algoClassificacao = new AlgoClassificacao();
        listaAlunos = carregarArquivo.getListaAlunos();
        Validacoes validacoes = new Validacoes();

        int idade = 0;
        int total = listaAlunos.size();
        int totalLidos = 0;

        double altura = 0;
        double peso = 0;
        double cintura = 0;
        double arremeco = 0;
        double flexibilidade = 0;

        for (Alunos listaAluno : listaAlunos) {
            totalLidos++;

            if (validacoes.isMatricula(listaAluno.getMatricula())) {

                idade = validacoes.calcularIdadeAtual(listaAluno.getDtNascimento(), listaAluno.getDtAvaliacao());
                altura = validacoes.transformarCampoDouble(listaAluno.getALTURA());
                peso = validacoes.transformarCampoDouble(listaAluno.getPESO());
                cintura = validacoes.transformarCampoDouble(listaAluno.getCINTURA());
                flexibilidade = validacoes.transformarCampoDouble(listaAluno.getFLEXIBILIDADE());
                arremeco = validacoes.transformarCampoDouble(listaAluno.getMEDICINIBALL());

                listaAluno.setIdade(Integer.toString(idade));

                //classificacao por tabela: 
                String genero = listaAluno.getGenero();
                String classificacaoMedBoll;
                String classeificacaoMedBallSaude;

                classificacaoMedBoll = algoClassificacao.tabelaMedBall(idade, genero, arremeco);
                classeificacaoMedBallSaude = algoClassificacao.tabelaMedballSaude(idade, genero, arremeco);
                listaAluno.setCLASSIFICACAO_MEDICINIBALL(classificacaoMedBoll);
                listaAluno.setResultadoMedBallvsSaude(classeificacaoMedBallSaude);

                listaAluno.setCLASSIFICACAO_FLEXIBILIDADE(algoClassificacao.tabelaFlexibilidade(idade, genero, flexibilidade));
                listaAluno.setResultadoFlexbilidadeVsEsporte(algoClassificacao.tabelaFlexibilidadeEsporte(idade, genero, flexibilidade));

                String imcResult = null;

                double imc = algoClassificacao.calculoIMC(peso, altura);
                imcResult = algoClassificacao.tabelaIMC(idade, genero, imc);
                listaAluno.setIMC(Double.toString(imc));
                listaAluno.setClassificacao_IMC_POEST(imcResult);

                //---------------------------
                listaAluno.setClassificacao_RCE(algoClassificacao.classificacaoRCE(cintura, altura));
                listaAluno.setValor_Classificacao_RCE(Double.toString(algoClassificacao.getResultadoClassificacaoRCE()));

                double abdomem = validacoes.transformarCampoDouble(listaAluno.getABDOMINAL());
                String classAbdominal = algoClassificacao.classificacaoAbdominal(idade, genero, abdomem);
                listaAluno.setCLASSIFICACAO_ABDOMINAL(classAbdominal);
                listaAluno.setResultadoAbdominalVsEsporte(algoClassificacao.tabelaAbdominalEsporte1M(idade, genero, abdomem));

                //---------------------------
                double velocidade = validacoes.transformarCampoDouble(listaAluno.getVELOCIDADE());
                String classVelocidade = algoClassificacao.tabelaCorridaResistencia20Min(idade, genero, velocidade);
                listaAluno.setCLASSIFICACAO_VELOCIDADE(classVelocidade);
                String velocidadeVsSaude = algoClassificacao.tabelaCorridaResistencia20MinSaude(idade, genero, arremeco);
                listaAluno.setResultadoVelocidadeVsSaude(velocidadeVsSaude);

                //---------------------------
                double salto = validacoes.transformarCampoDouble(listaAluno.getSALTO());
                String classSalto = algoClassificacao.tabelaSalto(idade, genero, salto);
                listaAluno.setCLASSIFICACAO_SALTO(classSalto);

                //--------------------------- 
                double agilidade = validacoes.transformarCampoDouble(listaAluno.getAGILIDADE());
                String classAgilidade = algoClassificacao.tabelaAgilidade(idade, genero, agilidade);
                listaAluno.setCLASSIFICACAO_AGILIDADE(classAgilidade);

                //--------------------------- 
                double corrida = validacoes.transformarCampoDouble(listaAluno.getCORRIDA_6_MIN());
                String classCorrida = algoClassificacao.tabelaCorridaResistencia6Min(idade, genero, corrida);
                listaAluno.setCLASSIFICACAO_6MIN(classCorrida);
                String classCorridaSaude = algoClassificacao.tabelaCorridaResistencia6MinSaude(idade, genero, corrida);
                listaAluno.setCLASSIFICACAO_6MIN_SAUDE(classCorridaSaude);

                //---------------------------
                double vo2Max = validacoes.transformarCampoDouble(listaAluno.getVO2_MAX());
                String classVo2max = algoClassificacao.classificacaoVo2(idade, genero, vo2Max);
                listaAluno.setCLASSFICACAO_VO2_MAX(classVo2max);
                //--------------------------

                System.out.println("-------------------------(" + listaAluno.getNumeroOrdem() + ")----------------------------");
                System.out.println("Name : " + listaAluno.getNome());
                System.out.println("Mat : " + listaAluno.getMatricula());
                System.out.println("Número : " + listaAluno.getNumeroOrdem());
                System.out.println("Nascimento : " + listaAluno.getDtNascimento());
                System.out.println("Idade : " + listaAluno.getIdade());
                System.out.println("Gênero : " + listaAluno.getGenero());
                System.out.println("Peso : " + listaAluno.getPESO() + "KG");
                System.out.println("Altura : " + listaAluno.getALTURA() + "CM");
                System.out.println("Cintura : " + listaAluno.getCINTURA() + "CM");

                System.out.println("Flexibilidade : " + listaAluno.getFLEXIBILIDADE() + "CM");
                System.out.println("Classificacao Flexibilidade : " + listaAluno.getCLASSIFICACAO_FLEXIBILIDADE());

                System.out.println("IMC : " + validacoes.truncateValorDoubleString(listaAluno.getIMC()));
                System.out.println("Classificacao IMC : " + listaAluno.getClassificacao_IMC_POEST());

                System.out.println("RCE :" + validacoes.truncateValorDoubleString(listaAluno.getValor_Classificacao_RCE()));
                System.out.println("Classificacao RCE :" + listaAluno.getClassificacao_RCE());

                System.out.println("Abdomem : " + listaAluno.getABDOMINAL());
                System.out.println("Classificacao Abdomem : " + listaAluno.getCLASSIFICACAO_ABDOMINAL());

                System.out.println("Salto : " + listaAluno.getSALTO());
                System.out.println("Classificacao Salto : " + listaAluno.getCLASSIFICACAO_SALTO());

                System.out.println("MedBall : " + listaAluno.getMEDICINIBALL());
                System.out.println("Classificacao MedBall : " + listaAluno.getCLASSIFICACAO_MEDICINIBALL());

                System.out.println("Velocidade : " + listaAluno.getVELOCIDADE());
                System.out.println("Classificacao Velocidade  : " + listaAluno.getCLASSIFICACAO_VELOCIDADE());

                System.out.println("Agilidade : " + listaAluno.getAGILIDADE());
                System.out.println("Classificacao Agilidade : " + listaAluno.getCLASSIFICACAO_AGILIDADE());

                System.out.println("Corrida ¨6 Min : " + listaAluno.getCORRIDA_6_MIN());
                System.out.println("Classificacao 6 Min : " + listaAluno.getCLASSIFICACAO_6MIN());

                System.out.println("VO2 MAX : " + listaAluno.getVO2_MAX());
                System.out.println("Classificacao 6 Min : " + listaAluno.getCLASSFICACAO_VO2_MAX());

                System.out.println("Próximo-Aluno----------->>");

            }

            if (total == totalLidos) {
                return;
            }

        }
    }
}

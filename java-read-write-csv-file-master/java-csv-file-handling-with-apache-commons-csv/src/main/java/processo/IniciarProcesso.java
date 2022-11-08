/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processo;

import IO.CarregarArquivo;
import beans.Alunos;
import java.io.IOException;
import java.util.ArrayList;
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

                idade = validacoes.calcularIdadeAtual(listaAluno.getDtNascimento());
                altura = validacoes.transformarCampoDouble(listaAluno.getALTURA());
                peso = validacoes.transformarCampoDouble(listaAluno.getPESO());
                cintura = validacoes.transformarCampoDouble(listaAluno.getCINTURA());
                flexibilidade = validacoes.transformarCampoDouble(listaAluno.getFLEXIBILIDADE());
                arremeco = validacoes.transformarCampoDouble(listaAluno.getMEDICINIBALL());

                //classificacao por tabela: 
                String genero = listaAluno.getGenero();
                String classificacaoMedBoll = null;

                classificacaoMedBoll = algoClassificacao.tabelaMedBall(idade, genero, arremeco);
                listaAluno.setCLASSIFICACAO_MEDICINIBALL(classificacaoMedBoll);
                listaAluno.setCLASSIFICACAO_FLEXIBILIDADE(algoClassificacao.tabelaFlexibilidade(idade, genero, flexibilidade));

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

                //---------------------------
                double velocidade = validacoes.transformarCampoDouble(listaAluno.getVELOCIDADE());
                String classVelocidade = algoClassificacao.tabelaCorridaResistencia20Min(idade, genero, velocidade);
                listaAluno.setCLASSIFICACAO_VELOCIDADE(classVelocidade);

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

                Legendas legendas = new Legendas();

                System.out.println("-------------------------(" + listaAluno.getNumeroOrdem() + ")----------------------------");
                System.out.println("Name : " + listaAluno.getNome());
                System.out.println("Mat : " + listaAluno.getMatricula());
                System.out.println("Numero : " + listaAluno.getNumeroOrdem());
                System.out.println("Nascimento : " + listaAluno.getDtNascimento());
                System.out.println("Idade : " + listaAluno.getIdade());
                System.out.println("Genero : " + legendas.converteLegendas(listaAluno.getGenero(), 5));
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

            }

            if (total == totalLidos) {

                return;
                //exportar tabelas duplas comp

                //Exportar uma tabela
                //ExportaTabelaExl exportaTabelaExl = new ExportaTabelaExl();
                //exportaTabelaExl.exportarExel(listaAlunos);
            }

        }
    }
}

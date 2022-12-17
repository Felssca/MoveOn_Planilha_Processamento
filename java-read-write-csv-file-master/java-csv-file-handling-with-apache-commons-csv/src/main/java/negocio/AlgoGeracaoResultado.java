/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import beans.Alunos;
import beans.Constantes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author FelipeSSCA
 */
public class AlgoGeracaoResultado {

    private List<Alunos> alunosNaoProcessados;

    public List<Alunos> processarResultadosTabelasTres(List<Alunos> listaAlunosSem1, List<Alunos> listaAlunosSem2) {

        List<Alunos> listaAlunosResult = new ArrayList<>();
        alunosNaoProcessados = new ArrayList();
        Alunos alunoResultado;

        AlgoComparacaoSemestres algoComparacaoSemestres = new AlgoComparacaoSemestres();

        for (Alunos alunoSem1 : listaAlunosSem1) {
            Alunos alunoSem2 = acharAlunoSemestreDois(alunoSem1.getMatricula(), listaAlunosSem2);

            if (alunoSem2 != null) {

                alunoResultado = new Alunos();
                alunoResultado.setMatricula(alunoSem1.getMatricula());
                alunoResultado.setNome(alunoSem1.getNome());

                //PESO COMP
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getPESO(), alunoSem2.getPESO(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_PESO);

                alunoResultado.setPESO(alunoSem1.getPESO());
                alunoResultado.setPESO_COMP_2(alunoSem2.getPESO());
                alunoResultado.setResultadoPeso(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemPeso(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresPeso(algoComparacaoSemestres.getIndicador());

                //ALTURA        
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getALTURA(),
                        alunoSem2.getALTURA(), Constantes.TIPO_ETIQUETA_MODALIDADES_ALTURA);
                alunoResultado.setALTURA(alunoSem1.getALTURA());
                alunoResultado.setALTURA_COMP_2(alunoSem2.getALTURA());
                alunoResultado.setResultadoAltura(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemAltura(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresAltura(algoComparacaoSemestres.getIndicador());

                ////IMC   
                alunoResultado.setIMC(alunoSem1.getIMC());
                alunoResultado.setIMC_Sem_2(alunoSem2.getIMC());
                alunoResultado.setIndicadoresIMCSem_1(alunoSem1.getClassificacao_IMC_POEST());
                alunoResultado.setIndicadoresIMCSem_2(alunoSem2.getClassificacao_IMC_POEST());
                algoComparacaoSemestres.tabelaComparativa(alunoResultado.getIMC(), alunoResultado.getIMC_Sem_2(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_IMC);
                alunoResultado.setIndicadoresIMCTab3(algoComparacaoSemestres.getIndicador());
                alunoResultado.setResultadoIMCTab3(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemIMCTab3(Double.toString(algoComparacaoSemestres.getPorcentagem()));

                ////Cinura        
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getCINTURA(), alunoSem2.getCINTURA(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_CINTURA);
                alunoResultado.setCINTURA(alunoSem1.getCINTURA());
                alunoResultado.setCINTURA_COMP2(alunoSem2.getCINTURA());
                alunoResultado.setResultadoCintura(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemCintura(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresCintura(algoComparacaoSemestres.getIndicador());

                ////RCE
                alunoResultado.setValor_Classificacao_RCE(alunoSem1.getValor_Classificacao_RCE());
                alunoResultado.setValor_Classificacao_RCE_comp_2(alunoSem2.getValor_Classificacao_RCE());
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getValor_Classificacao_RCE(),
                        alunoSem2.getValor_Classificacao_RCE(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_RCE);
                alunoResultado.setIndicadoresRCESemestre_1(alunoSem1.getClassificacao_RCE());
                alunoResultado.setIndicadoresRCESemestre_2(alunoSem2.getClassificacao_RCE());

                alunoResultado.setResultadoRCEab3(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemRCEab3(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresRCETab3(algoComparacaoSemestres.getIndicador());

                ///Evergadura       
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getENVERGADURA(), alunoSem2.getENVERGADURA(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_ENVERGADURA);
                alunoResultado.setENVERGADURA(alunoSem1.getENVERGADURA());
                alunoResultado.setENVERGADURA_COMP2(alunoSem2.getENVERGADURA());
                alunoResultado.setResultadoEnvergadura(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemEnvergadura(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresEnvergadura(algoComparacaoSemestres.getIndicador());

                //Flex       
                alunoSem1.getFLEXIBILIDADE();
                alunoSem2.getFLEXIBILIDADE();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getFLEXIBILIDADE(), alunoSem2.getFLEXIBILIDADE(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_FLEXIBILIDADE);
                alunoResultado.setFLEXIBILIDADE(alunoSem1.getFLEXIBILIDADE());
                alunoResultado.setFLEXIBILIDADE_COMP2(alunoSem2.getFLEXIBILIDADE());
                alunoResultado.setResultadoFlex(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemFlex(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresFlex(algoComparacaoSemestres.getIndicador());
//Abdominal     
                alunoSem1.getABDOMINAL();
                alunoSem2.getABDOMINAL();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getABDOMINAL(), alunoSem2.getABDOMINAL(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_ABDOMINAL);
                alunoResultado.setABDOMINAL(alunoSem1.getABDOMINAL());
                alunoResultado.setABDOMINAL_COMP2(alunoSem2.getABDOMINAL());
                alunoResultado.setResultadoAbdomem(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemAbdomem(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresAbdomem(algoComparacaoSemestres.getIndicador());
                //Salto             
                alunoSem1.getSALTO();
                alunoSem2.getSALTO();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getSALTO(), alunoSem2.getSALTO(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_SALTO);
                alunoResultado.setSALTO(alunoSem1.getSALTO());
                alunoResultado.setSALTO_COMPE2(alunoSem2.getSALTO());
                alunoResultado.setResultadoSalto(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemSalto(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresSalto(algoComparacaoSemestres.getIndicador());
//MEDBALL    
                alunoSem1.getMEDICINIBALL();
                alunoSem2.getMEDICINIBALL();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getMEDICINIBALL(), alunoSem2.getMEDICINIBALL(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_MEDBALL);
                alunoResultado.setMEDICINIBALL(alunoSem1.getMEDICINIBALL());
                alunoResultado.setMEDICINIBALL_COMP2(alunoSem2.getMEDICINIBALL());
                alunoResultado.setResultadoMedBall(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemMedBall(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresMedBall(algoComparacaoSemestres.getIndicador());

//vELOCIDADE    
                alunoSem1.getVELOCIDADE();
                alunoSem2.getVELOCIDADE();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getVELOCIDADE(), alunoSem2.getVELOCIDADE(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_VELOCIDADE);
                alunoResultado.setVELOCIDADE(alunoSem1.getVELOCIDADE());
                alunoResultado.setVELOCIDADE_COMP2(alunoSem2.getVELOCIDADE());
                alunoResultado.setResultadoVerlocidade(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemVerlocidade(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresVerlocidade(algoComparacaoSemestres.getIndicador());
//Agilidade   
                alunoSem1.getAGILIDADE();
                alunoSem2.getAGILIDADE();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getAGILIDADE(), alunoSem2.getAGILIDADE(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_AGILIDADE);
                alunoResultado.setAGILIDADE(alunoSem1.getAGILIDADE());
                alunoResultado.setAGILIDADE_COMP2(alunoSem2.getAGILIDADE());
                alunoResultado.setResultadoAgilidade(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemAgilidade(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresAgilidade(algoComparacaoSemestres.getIndicador());
//CORRIDA 6  
                alunoSem1.getCORRIDA_6_MIN();
                alunoSem2.getCORRIDA_6_MIN();
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getCORRIDA_6_MIN(), alunoSem2.getCORRIDA_6_MIN(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_CORRIDA6);
                alunoResultado.setCORRIDA_6_MIN(alunoSem1.getCORRIDA_6_MIN());
                alunoResultado.setCORRIDA_6_MIN_COMP2(alunoSem2.getCORRIDA_6_MIN());
                alunoResultado.setResultadoCorrida_6(Double.toString(algoComparacaoSemestres.getResultado()));
                alunoResultado.setResultadoPorcentagemCorrida_6(Double.toString(algoComparacaoSemestres.getPorcentagem()));
                alunoResultado.setIndicadoresCorrida_6(algoComparacaoSemestres.getIndicador());
                //cORRIDA 6    SAUDE
                algoComparacaoSemestres.tabelaComparativa(alunoSem1.getCORRIDA_6_MIN(), alunoSem2.getCORRIDA_6_MIN(),
                        Constantes.TIPO_ETIQUETA_MODALIDADES_CORRIDA6_SAUDE);
                alunoResultado.setIndicadoresCorrida_6_saude(algoComparacaoSemestres.getIndicador());

                listaAlunosResult.add(alunoResultado);

            } else {
                alunosNaoProcessados.add(alunoSem1);
            }
        }
          return listaAlunosResult;


    }

    private Alunos acharAlunoSemestreDois(String matricula, List<Alunos> listaAlunosSem2) {

        return listaAlunosSem2.stream()
                .filter(Objects::nonNull)
                .filter(x -> x.getMatricula() != null)
                .filter(x -> x.getMatricula().equals(matricula))
                .findFirst().orElse(null);

    }

}

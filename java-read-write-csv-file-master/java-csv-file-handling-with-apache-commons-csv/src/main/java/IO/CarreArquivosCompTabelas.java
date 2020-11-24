/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import beans.Alunos;
import beans.Constantes;
import java.io.IOException;
import java.util.ArrayList;
import negocio.AlgoComparacaoSemestres;
import processo.IniciarProcesso;

/**
 *
 * @author felipessca
 */
public class CarreArquivosCompTabelas {
    
    
   // private static CarreArquivosCompTabelas arquivosCompTabelas;
    
    private ArrayList<Alunos> listaAlunosSem1;
    private ArrayList<Alunos> listaAlunosSem2;
    private ArrayList<Alunos> listaAlunosResult = new ArrayList<>();
    private Alunos alunoResultado;
    
    
    //**ALTERAR CAMINHOS AQUI================================
    
    /*
    private String INPUTcaminhoPlanilha01 =  Constantes.XLSX_FILE_PATH_SEM1;
    private String OUTPUTcaminhoPlanilha01 = Constantes.TABELA_XLSX_FILE_OUT+Constantes.TABELA_SEMESTRE_OUT_9_2_1;
    
    private String INPUTcaminhoPlanilha02 =  Constantes.XLSX_FILE_PATH_SEM2;
    private String OUTPUTcaminhoPlanilha02 = Constantes.TABELA_XLSX_FILE_OUT+Constantes.TABELA_SEMESTRE_OUT_9_2_2;
    
    private String OUTPUTplanilha03 = Constantes.TABELA_XLSX_FILE_OUT+Constantes.TABELA_SEMESTRE_OUT_9_2_3;
    */
    
    private String INPUTcaminhoPlanilha01;
    private String OUTPUTcaminhoPlanilha01;
    
    private String INPUTcaminhoPlanilha02;
    private String OUTPUTcaminhoPlanilha02;
    
    private String OUTPUTplanilha03;
    
    //========================================================
    
    
    
        public CarreArquivosCompTabelas() {
    
    }
    
    /*
    private static synchronized CarreArquivosCompTabelas getInstance(){
    
        if(arquivosCompTabelas == null){
        arquivosCompTabelas = new CarreArquivosCompTabelas();
        
        }
        return arquivosCompTabelas;
    
    
    }
    */
    
    
    public void carregarTabelasSemestreUm()throws IOException,Exception{
        
        IniciarProcesso iniciarProcesso = new IniciarProcesso();
        iniciarProcesso.iniciarProcessoLeituraXls(getINPUTcaminhoPlanilha01());
        listaAlunosSem1 = iniciarProcesso.getListaAluns();
        exportarTabelasXlsx(listaAlunosSem1, getOUTPUTcaminhoPlanilha01());
      
    
    }
    public void carregarTabelasSemestreDois()throws IOException,Exception{
        
        IniciarProcesso iniciarProcesso = new IniciarProcesso();
        iniciarProcesso.iniciarProcessoLeituraXls(getINPUTcaminhoPlanilha02());
        listaAlunosSem2 = iniciarProcesso.getListaAluns();
        exportarTabelasXlsx(listaAlunosSem2, getOUTPUTcaminhoPlanilha02());
        
    
    
    }
    
    public void processarResultadosTabelasTres(){
   
        AlgoComparacaoSemestres algoComparacaoSemestres = new AlgoComparacaoSemestres();
        
        
        
    
     for(int i=0;listaAlunosSem1.size()>i;i++){
         if(i==0){
         
         }else{
             
        alunoResultado = new Alunos();
        alunoResultado.setMatricula(listaAlunosSem1.get(i).getMatricula());
        alunoResultado.setNome(listaAlunosSem1.get(i).getNome());
        
//PESO COMP
        listaAlunosSem1.get(i).getPESO();
        listaAlunosSem2.get(i).getPESO();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getPESO(),listaAlunosSem2.get(i).getPESO(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_PESO);
        alunoResultado.setPESO(listaAlunosSem1.get(i).getPESO());
        alunoResultado.setPESO_COMP_2(listaAlunosSem2.get(i).getPESO());
        alunoResultado.setResultadoPeso(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemPeso(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresPeso(algoComparacaoSemestres.getIndicador());
//ALTURA        
        listaAlunosSem1.get(i).getALTURA();
        listaAlunosSem2.get(i).getALTURA();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getALTURA(),
                listaAlunosSem2.get(i).getALTURA(),Constantes.TIPO_ETIQUETA_MODALIDADES_ALTURA);
        alunoResultado.setALTURA(listaAlunosSem1.get(i).getALTURA());
        alunoResultado.setALTURA_COMP_2(listaAlunosSem2.get(i).getALTURA());
        alunoResultado.setResultadoAltura(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemAltura(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresAltura(algoComparacaoSemestres.getIndicador());
        
//IMC   

        alunoResultado.setIMC( listaAlunosSem1.get(i).getIMC());
        alunoResultado.setIMC_Sem_2(listaAlunosSem2.get(i).getIMC());
        alunoResultado.setIndicadoresIMCSem_1(listaAlunosSem1.get(i).getClassificacao_IMC_POEST());
        alunoResultado.setIndicadoresIMCSem_2(listaAlunosSem2.get(i).getClassificacao_IMC_POEST());
        algoComparacaoSemestres.tabelaComparativa(alunoResultado.getIMC(),alunoResultado.getIMC_Sem_2(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_IMC);
        alunoResultado.setIndicadoresIMCTab3(algoComparacaoSemestres.getIndicador());
        alunoResultado.setResultadoIMCTab3(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemIMCTab3(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        
//Cinura        
        listaAlunosSem1.get(i).getCINTURA();
        listaAlunosSem2.get(i).getCINTURA();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getCINTURA(),listaAlunosSem2.get(i).getCINTURA(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_CINTURA);
        alunoResultado.setCINTURA(listaAlunosSem1.get(i).getCINTURA());
        alunoResultado.setCINTURA_COMP2(listaAlunosSem2.get(i).getCINTURA());
        alunoResultado.setResultadoCintura(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemCintura(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresCintura(algoComparacaoSemestres.getIndicador());
       
//RCE
        alunoResultado.setValor_Classificacao_RCE(listaAlunosSem1.get(i).getValor_Classificacao_RCE());
        alunoResultado.setValor_Classificacao_RCE_comp_2(listaAlunosSem2.get(i).getValor_Classificacao_RCE());
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getValor_Classificacao_RCE(),
                listaAlunosSem2.get(i).getValor_Classificacao_RCE(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_RCE);
        alunoResultado.setIndicadoresRCESemestre_1(listaAlunosSem1.get(i).getClassificacao_RCE());
        alunoResultado.setIndicadoresRCESemestre_2(listaAlunosSem2.get(i).getClassificacao_RCE());
        
        alunoResultado.setResultadoRCEab3(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemRCEab3(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresRCETab3(algoComparacaoSemestres.getIndicador());
              
//Evergadura       
        listaAlunosSem1.get(i).getENVERGADURA();
        listaAlunosSem2.get(i).getENVERGADURA();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getENVERGADURA(),listaAlunosSem2.get(i).getENVERGADURA(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_ENVERGADURA);
        alunoResultado.setENVERGADURA(listaAlunosSem1.get(i).getENVERGADURA());
        alunoResultado.setENVERGADURA_COMP2(listaAlunosSem2.get(i).getENVERGADURA());
        alunoResultado.setResultadoEnvergadura(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemEnvergadura(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresEnvergadura(algoComparacaoSemestres.getIndicador());

//Flex       
        listaAlunosSem1.get(i).getFLEXIBILIDADE();
        listaAlunosSem2.get(i).getFLEXIBILIDADE();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getFLEXIBILIDADE(),listaAlunosSem2.get(i).getFLEXIBILIDADE(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_FLEXIBILIDADE);
        alunoResultado.setFLEXIBILIDADE(listaAlunosSem1.get(i).getFLEXIBILIDADE());
        alunoResultado.setFLEXIBILIDADE_COMP2(listaAlunosSem2.get(i).getFLEXIBILIDADE());
        alunoResultado.setResultadoFlex(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemFlex(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresFlex(algoComparacaoSemestres.getIndicador());
//Abdominal     
        listaAlunosSem1.get(i).getABDOMINAL();
        listaAlunosSem2.get(i).getABDOMINAL();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getABDOMINAL(),listaAlunosSem2.get(i).getABDOMINAL(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_ABDOMINAL);
        alunoResultado.setABDOMINAL(listaAlunosSem1.get(i).getABDOMINAL());
        alunoResultado.setABDOMINAL_COMP2(listaAlunosSem2.get(i).getABDOMINAL());
        alunoResultado.setResultadoAbdomem(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemAbdomem(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresAbdomem(algoComparacaoSemestres.getIndicador());
//Salto    
        listaAlunosSem1.get(i).getSALTO();
        listaAlunosSem2.get(i).getSALTO();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getSALTO(),listaAlunosSem2.get(i).getSALTO(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_SALTO);
        alunoResultado.setSALTO(listaAlunosSem1.get(i).getSALTO());
        alunoResultado.setSALTO_COMPE2(listaAlunosSem2.get(i).getSALTO());
        alunoResultado.setResultadoSalto(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemSalto(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresSalto(algoComparacaoSemestres.getIndicador());
//MEDBALL    
        listaAlunosSem1.get(i).getMEDICINIBALL();
        listaAlunosSem2.get(i).getMEDICINIBALL();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getMEDICINIBALL(),listaAlunosSem2.get(i).getMEDICINIBALL(),
                Constantes.TIPO_ETIQUETA_MODALIDADES_MEDBALL);
        alunoResultado.setMEDICINIBALL(listaAlunosSem1.get(i).getMEDICINIBALL());
        alunoResultado.setMEDICINIBALL_COMP2(listaAlunosSem2.get(i).getMEDICINIBALL());
        alunoResultado.setResultadoMedBall(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemMedBall(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresMedBall(algoComparacaoSemestres.getIndicador());
        
//vELOCIDADE    
        listaAlunosSem1.get(i).getVELOCIDADE();
        listaAlunosSem2.get(i).getVELOCIDADE();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getVELOCIDADE(),listaAlunosSem2.get(i).getVELOCIDADE(),
        Constantes.TIPO_ETIQUETA_MODALIDADES_VELOCIDADE);
        alunoResultado.setVELOCIDADE(listaAlunosSem1.get(i).getVELOCIDADE());
        alunoResultado.setVELOCIDADE_COMP2(listaAlunosSem2.get(i).getVELOCIDADE());
        alunoResultado.setResultadoVerlocidade(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemVerlocidade(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresVerlocidade(algoComparacaoSemestres.getIndicador());
//Agilidade   
        listaAlunosSem1.get(i).getAGILIDADE();
        listaAlunosSem2.get(i).getAGILIDADE();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getAGILIDADE(),listaAlunosSem2.get(i).getAGILIDADE(),
        Constantes.TIPO_ETIQUETA_MODALIDADES_AGILIDADE);
        alunoResultado.setAGILIDADE(listaAlunosSem1.get(i).getAGILIDADE());
        alunoResultado.setAGILIDADE_COMP2(listaAlunosSem2.get(i).getAGILIDADE());
        alunoResultado.setResultadoAgilidade(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemAgilidade(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresAgilidade(algoComparacaoSemestres.getIndicador());
//cORRIDA 6    ESPORTE
        listaAlunosSem1.get(i).getCORRIDA_6_MIN();
        listaAlunosSem2.get(i).getCORRIDA_6_MIN();
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getCORRIDA_6_MIN(),listaAlunosSem2.get(i).getCORRIDA_6_MIN(),
        Constantes.TIPO_ETIQUETA_MODALIDADES_CORRIDA6);
        alunoResultado.setCORRIDA_6_MIN(listaAlunosSem1.get(i).getCORRIDA_6_MIN());
        alunoResultado.setCORRIDA_6_MIN_COMP2(listaAlunosSem2.get(i).getCORRIDA_6_MIN());
        alunoResultado.setResultadoCorrida_6(Double.toString(algoComparacaoSemestres.getResultado()));
        alunoResultado.setResultadoPorcentagemCorrida_6(Double.toString(algoComparacaoSemestres.getPorcentagem()));
        alunoResultado.setIndicadoresCorrida_6(algoComparacaoSemestres.getIndicador());
        //cORRIDA 6    SAUDE
        algoComparacaoSemestres.tabelaComparativa( listaAlunosSem1.get(i).getCORRIDA_6_MIN(),listaAlunosSem2.get(i).getCORRIDA_6_MIN(),
        Constantes.TIPO_ETIQUETA_MODALIDADES_CORRIDA6_SAUDE);
        alunoResultado.setIndicadoresCorrida_6_saude(algoComparacaoSemestres.getIndicador());
        
        
        listaAlunosResult.add(alunoResultado);
        
        
        
         }
     
     }
        
   
    exportarTabelasXlsxResultado(listaAlunosResult, getOUTPUTplanilha03());
        
    
    
    }
    
    private void exportarTabelasXlsx(ArrayList<Alunos>resultadoAlunos, String pathOut){
    
                
              ExportaTabelaExl exportaTabelaExl = new ExportaTabelaExl();
              exportaTabelaExl.exportarExel(resultadoAlunos,pathOut);
    
    }
    private void exportarTabelasXlsxResultado(ArrayList<Alunos>resultadoAlunos, String pathOut){
    
                
              ExportaTabelaExl exportaTabelaExl = new ExportaTabelaExl();
              exportaTabelaExl.exportarExelComparacaoSemestres(resultadoAlunos,pathOut);
    
    }
   

    /**
     * @return the listaAlunosSem1
     */
    public ArrayList<Alunos> getListaAlunosSem1() {
        return listaAlunosSem1;
    }

    /**
     * @param listaAlunosSem1 the listaAlunosSem1 to set
     */
    public void setListaAlunosSem1(ArrayList<Alunos> listaAlunosSem1) {
        this.listaAlunosSem1 = listaAlunosSem1;
    }

    /**
     * @return the listaAlunosSem2
     */
    public ArrayList<Alunos> getListaAlunosSem2() {
        return listaAlunosSem2;
    }

    /**
     * @param listaAlunosSem2 the listaAlunosSem2 to set
     */
    public void setListaAlunosSem2(ArrayList<Alunos> listaAlunosSem2) {
        this.listaAlunosSem2 = listaAlunosSem2;
    }

    /**
     * @return the INPUTcaminhoPlanilha01
     */
    public String getINPUTcaminhoPlanilha01() {
        return INPUTcaminhoPlanilha01;
    }

    /**
     * @param INPUTcaminhoPlanilha01 the INPUTcaminhoPlanilha01 to set
     */
    public void setINPUTcaminhoPlanilha01(String INPUTcaminhoPlanilha01) {
        this.INPUTcaminhoPlanilha01 = INPUTcaminhoPlanilha01;
    }

    /**
     * @return the OUTPUTcaminhoPlanilha01
     */
    public String getOUTPUTcaminhoPlanilha01() {
        return OUTPUTcaminhoPlanilha01;
    }

    /**
     * @param OUTPUTcaminhoPlanilha01 the OUTPUTcaminhoPlanilha01 to set
     */
    public void setOUTPUTcaminhoPlanilha01(String OUTPUTcaminhoPlanilha01) {
        this.OUTPUTcaminhoPlanilha01 = OUTPUTcaminhoPlanilha01;
    }

    /**
     * @return the INPUTcaminhoPlanilha02
     */
    public String getINPUTcaminhoPlanilha02() {
        return INPUTcaminhoPlanilha02;
    }

    /**
     * @param INPUTcaminhoPlanilha02 the INPUTcaminhoPlanilha02 to set
     */
    public void setINPUTcaminhoPlanilha02(String INPUTcaminhoPlanilha02) {
        this.INPUTcaminhoPlanilha02 = INPUTcaminhoPlanilha02;
    }

    /**
     * @return the OUTPUTcaminhoPlanilha02
     */
    public String getOUTPUTcaminhoPlanilha02() {
        return OUTPUTcaminhoPlanilha02;
    }

    /**
     * @param OUTPUTcaminhoPlanilha02 the OUTPUTcaminhoPlanilha02 to set
     */
    public void setOUTPUTcaminhoPlanilha02(String OUTPUTcaminhoPlanilha02) {
        this.OUTPUTcaminhoPlanilha02 = OUTPUTcaminhoPlanilha02;
    }

    /**
     * @return the OUTPUTplanilha03
     */
    public String getOUTPUTplanilha03() {
        return OUTPUTplanilha03;
    }

    /**
     * @param OUTPUTplanilha03 the OUTPUTplanilha03 to set
     */
    public void setOUTPUTplanilha03(String OUTPUTplanilha03) {
        this.OUTPUTplanilha03 = OUTPUTplanilha03;
    }
    
}

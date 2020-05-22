/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IO;

import beans.Alunos;
import beans.Constantes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import util.Legendas;
import util.Validacoes;

/**
 *
 * @author FelipeSSCA
 */
   /*
public class _old_CarregarArquivo {
    
    //private final String SAMPLE_CSV_FILE_PATH = "F://TFCIC//TFCIC//Tabelas_dados_CSV//cvs//7-1-GV-2017.csv";
    private final String SAMPLE_CSV_FILE_PATH = "F://TFCIC//TFCIC//Tabelas_dados_CSV//xlsx//7_1_GV_2017.xlsx";
    private Alunos alunos;
    private ArrayList<Alunos> listaAlunos = new ArrayList();
    
    public void carregarArquivos() throws IOException,Exception{
    
      try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            
        ) {
        
        try {
                    FileInputStream arquivo = new FileInputStream(new File(
                             AbreExcel.fileName));
  
                    HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
  
                    HSSFSheet sheetAlunos = workbook.getSheetAt(0);
            long csvParserSize = 0;
            
            for (CSVRecord csvRecord : csvParser) {
                
               csvParserSize = csvParser.getRecordNumber();
                //pular cabecalho
                if(csvRecord.getRecordNumber() == 1){
                
                }else if(csvRecord.getRecordNumber()> csvParserSize){
                    return;
                }
                else{
             
       try{
                    FileInputStream arquivo = new FileInputStream(new File(
                              SAMPLE_CSV_FILE_PATH ));
                    HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
                    HSSFSheet sheetAlunos = workbook.getSheetAt(0);
                    Iterator<Row> rowIterator = sheetAlunos.iterator();
                    
                while(rowIterator.hasNext()){
                     Row row = rowIterator.next();
                     Iterator<Cell> cellIterator = row.cellIterator();
                   
                     while (cellIterator.hasNext()) {
                      Cell cell = cellIterator.next();
                alunos = new Alunos();
                alunos.setMatricula(csvRecord.get(0));
                alunos.setNumeroOrdem(csvRecord.get(1));
                alunos.setNome(csvRecord.get(2));
                alunos.setQUANTIDADE_TOTAL_DE_TREINOS(csvRecord.get(3));
                alunos.setQUANTIDADE_DE_TREINOS_POR_ALUNOS(csvRecord.get(4));
                alunos.setQUANTIDADE_DE_VEZES_COM_UNIFORME(csvRecord.get(5));
                alunos.setDtNascimento(csvRecord.get(6));
                
                Validacoes validacoes  =  new Validacoes();
                Legendas legendas = new Legendas();
                if(alunos.getDtNascimento().length()<6){
                
                }else{
                    
                int idade = validacoes.idadeFinal(alunos.getDtNascimento());                    
                alunos.setIdade(Integer.toString(idade));
                
                }
                alunos.setGenero(csvRecord.get(7));
                alunos.setnAvaliacao(csvRecord.get(8));
                alunos.setDtAvaliacao(csvRecord.get(9));
                alunos.setSERIE(csvRecord.get(10));
                alunos.setTURMA(csvRecord.get(11)); 
                
                alunos.setPESO(csvRecord.get(12));
                alunos.setALTURA(csvRecord.get(13));
                
                alunos.setIMC(csvRecord.get(14));
                alunos.setClassificacao_IMC_POEST(csvRecord.get(15));
                
                alunos.setCINTURA(csvRecord.get(16));
                alunos.setClassificacao_RCE(csvRecord.get(17));
                
                alunos.setENVERGADURA(csvRecord.get(18));
                alunos.setFLEXIBILIDADE(csvRecord.get(19));
                alunos.setCLASSIFICACAO_FLEXIBILIDADE(csvRecord.get(20));
                
                alunos.setABDOMINAL(csvRecord.get(21));
                alunos.setOBSERVACAO_ABDOMINAL(csvRecord.get(22));
                alunos.setCLASSIFICACAO_ABDOMINAL(csvRecord.get(23));
                
                alunos.setSALTO(csvRecord.get(24));
                alunos.setCLASSIFICACAO_SALTO(csvRecord.get(25));
                
                alunos.setMEDICINIBALL(csvRecord.get(26));
                alunos.setCLASSIFICACAO_MEDICINIBALL(csvRecord.get(27));
                
                alunos.setVELOCIDADE(csvRecord.get(28));
                alunos.setCLASSIFICACAO_VELOCIDADE(csvRecord.get(29));
                
                alunos.setAGILIDADE(csvRecord.get(30));
                alunos.setCLASSIFICACAO_AGILIDADE(csvRecord.get(31));
                
                alunos.setCORRIDA_6_MIN(csvRecord.get(32));
                alunos.setCLASSIFICACAO_6MIN(csvRecord.get(33));
                
                alunos.setOBS1_CALCADO(legendas.converteLegendas(csvRecord.get(34),Constantes.OBS1));
                alunos.setOBS2_CAFÉ(legendas.converteLegendas(csvRecord.get(35),Constantes.OBS2));
                alunos.setOBS3_PERCEPCAO(legendas.converteLegendas(csvRecord.get(36),Constantes.OBS3));
                alunos.setOBS4_PERCEPCAO(legendas.converteLegendas(csvRecord.get(37),Constantes.OBS3));
                alunos.setOBS5_PERCEPCAO(legendas.converteLegendas(csvRecord.get(38),Constantes.OBS3));
                alunos.setOBS7_PERCEPCAO(legendas.converteLegendas(csvRecord.get(39),Constantes.OBS3));
                
              
                
               
                
                getListaAlunos().add(alunos);
                
                    }
                     
              
               
                }catch(FileNotFoundException e){
                e.printStackTrace();
                System.out.println("Arquivo Excel não encontrado!");
                
                }
            }
      
      
        
      
    
    
        


    public ArrayList<Alunos> getListaAlunos() {
        return listaAlunos;
    }

 
    public void setListaAlunos(ArrayList<Alunos> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
     
*/

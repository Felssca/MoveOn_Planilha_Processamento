/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import beans.Alunos;
import beans.Constantes;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import style.TabelaXlsStyle;
import util.Legendas;
import util.Validacoes;

/**
 *
 * @author FelipeSSCA
 */
public class ExportaTabelaExl {

    public void exportarExel(ArrayList<Alunos> listaAluno, String pathOut) {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
       
        TabelaXlsStyle tabelaXlsStyle = new TabelaXlsStyle();
        Legendas legendas = new Legendas();
        Validacoes validacoes = new Validacoes();

        //Create a blank sheet
        XSSFSheet sheetAlunos = workbook.createSheet("Alunos");
        
       sheetAlunos.createFreezePane(9,2);
        

        int rownum = 1;
        int cellCount = 0;
        
        Row rowZero = sheetAlunos.createRow(0);
        
        Cell cab0 = rowZero.createCell(cellCount++);
        cab0.setCellValue(Constantes.CAB_MATRICULA);
        
        Cell cab1 = rowZero.createCell(cellCount++);
        cab1.setCellValue(Constantes.CAB_NUM);
        
        Cell cab2 = rowZero.createCell(cellCount++);
        cab2.setCellValue(Constantes.CAB_NOME);
        
        Cell cab3 = rowZero.createCell(cellCount++);
        cab3.setCellValue(Constantes.CAB_DT_NASCIMENTO);
        
        //---------------------------
        
        Cell cab6 = rowZero.createCell(cellCount++);
        cab6.setCellValue(Constantes.CAB_DT_AVALIACAO);
        
             
        Cell cab7 = rowZero.createCell(cellCount++);  
        cab7.setCellValue(Constantes.CAB_SERIE);
        
        Cell cab8 = rowZero.createCell(cellCount++);
        cab8.setCellValue(Constantes.CAB_TURMA);
        
             Cell cab5 = rowZero.createCell(cellCount++);
        cab5.setCellValue(Constantes.CAB_GENERO);
        
        Cell cab4 = rowZero.createCell(cellCount++);
        cab4.setCellValue(Constantes.CAB_IDADE);
        
   //---------------------------
        
        Cell cab9 = rowZero.createCell(cellCount++);
        cab9.setCellValue(Constantes.CAB_PESO);
        
        Cell cab10 = rowZero.createCell(cellCount++);
        
        cab10.setCellValue(Constantes.CAB_ALTURA);
         Cell cab13 = rowZero.createCell(cellCount++);
         
        cab13.setCellValue(Constantes.CAB_CINTURA);
         Cell cab15 = rowZero.createCell(cellCount++);
         
        cab15.setCellValue(Constantes.CAB_ENVERGADURA);
        Cell cab11 = rowZero.createCell(cellCount++);
        
        cab11.setCellValue(Constantes.CAB_IMC);
        Cell cab12 = rowZero.createCell(cellCount++);
        
        cab12.setCellValue(Constantes.CAB_IMC_POEST);
        Cell cabRce = rowZero.createCell(cellCount++);
        
        cabRce.setCellValue(Constantes.CAB_RCE_NUMB);
        Cell cab14 = rowZero.createCell(cellCount++);
        
        cab14.setCellValue(Constantes.CAB_RCE);  
        Cell cab16 = rowZero.createCell(cellCount++);
        cab16.setCellValue(Constantes.CAB_FLEXIBILIDADE);
        Cell cab17 = rowZero.createCell(cellCount++);
        cab17.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_FLEXIBILIDADE);
        
        Cell cab18 = rowZero.createCell(cellCount++);
        cab18.setCellValue(Constantes.CAB_ABDOMINAL);
        Cell cab20 = rowZero.createCell(cellCount++);
        cab20.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_ABDOMINAL);
        
        Cell cab29ValorSaude = rowZero.createCell(cellCount++);
        cab29ValorSaude.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_6MIN_SAUDE);
        Cell cab31 = rowZero.createCell(cellCount++);
        cab31.setCellValue(Constantes. CAB_CLASS_CLASSIFICAÇÃO_6MIN_SAUDE);
      
        Cell cab29 = rowZero.createCell(cellCount++);
        cab29.setCellValue(Constantes.CAB_CORRIDA_6_MIN_DESEMPENHO_ESPORTIVO);
        Cell cab30 = rowZero.createCell(cellCount++);
        cab30.setCellValue(Constantes.CAB_CORRIDA_CLASSIFICACAO_6_MIN_DESEMPENHO_ESPORTIVO);

        Cell cab21 = rowZero.createCell(cellCount++);
        cab21.setCellValue(Constantes.CAB_SALTO);
        Cell cab22 = rowZero.createCell(cellCount++);
        cab22.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_SALTO_HORIZONTAL);
        Cell cab23 = rowZero.createCell(cellCount++);
        cab23.setCellValue(Constantes.CAB_MEDICINIBALL);
        Cell cab24 = rowZero.createCell(cellCount++);
        cab24.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_MEDICINIBALL);
        Cell cab25 = rowZero.createCell(cellCount++);
        cab25.setCellValue(Constantes.CAB_VELOCIDADE);
        Cell cab26 = rowZero.createCell(cellCount++);
        cab26.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_VELOCIDADE);
        Cell cab27 = rowZero.createCell(cellCount++);
        cab27.setCellValue(Constantes.CAB_AGILIDADE);
        Cell cab28 = rowZero.createCell(cellCount++);
        cab28.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_AGILIDADE);
        
        Cell caboBSSAP = rowZero.createCell(cellCount++);
        caboBSSAP.setCellValue(Constantes.SAPATO_OBS);
        Cell caboFeed = rowZero.createCell(cellCount++);
        caboFeed.setCellValue(Constantes.ALIMENTACAO_OBS);
        Cell cabCorrida = rowZero.createCell(cellCount++);
        cabCorrida.setCellValue(Constantes.PERCEPCAO_DE_ESFORCO_OBS_1);
        Cell cabCorrida1 = rowZero.createCell(cellCount++);
        cabCorrida1.setCellValue(Constantes.PERCEPCAO_DE_ESFORCO_OBS_2);
        Cell cabCorrida2 = rowZero.createCell(cellCount++);
        cabCorrida2.setCellValue(Constantes.PERCEPCAO_DE_ESFORCO_OBS_3);
        Cell cabCorrida3 = rowZero.createCell(cellCount++);
        cabCorrida3.setCellValue(Constantes.PERCEPCAO_DE_ESFORCO_OBS_4);
        Cell cabCorrida4 = rowZero.createCell(cellCount++);
        cabCorrida4.setCellValue(Constantes.PERCEPCAO_DE_ESFORCO_OBS_5);
        
      
     
        
        for (Alunos alunos : listaAluno) {

            Row row = sheetAlunos.createRow(rownum++);
            int cellnum = 0;

            Cell cellMat = row.createCell(cellnum++);
            cellMat.setCellValue(alunos.getMatricula());
            
            Cell cellNumOrdem = row.createCell(cellnum++);
            cellNumOrdem.setCellValue(alunos.getNumeroOrdem());

            Cell cellNome = row.createCell(cellnum++);
            cellNome.setCellValue(alunos.getNome());

            Cell cellDtNacimento = row.createCell(cellnum++);
            cellDtNacimento.setCellValue(alunos.getDtNascimento());
            
            Cell cellDataAvaliacao = row.createCell(cellnum++);
            cellDataAvaliacao.setCellValue(alunos.getDtAvaliacao());
            
             Cell cellSerie = row.createCell(cellnum++);
            cellSerie.setCellValue(alunos.getSERIE());

            Cell cellTurma = row.createCell(cellnum++);
            cellTurma.setCellValue(alunos.getTURMA());
            
             Cell cellGenero = row.createCell(cellnum++);
            cellGenero.setCellValue(legendas.converteLegendas(alunos.getGenero(),5));

            Cell cellDtIdade = row.createCell(cellnum++);
            cellDtIdade.setCellValue(alunos.getIdade());


            Cell cellPeso = row.createCell(cellnum++);
            cellPeso.setCellValue(alunos.getPESO());

            Cell cellAltura = row.createCell(cellnum++);
            cellAltura.setCellValue(alunos.getALTURA());
            
             Cell cellCinta = row.createCell(cellnum++);
             cellCinta.setCellValue(alunos.getCINTURA());
             
             Cell cellEnverga = row.createCell(cellnum++);
             cellEnverga.setCellValue(alunos.getENVERGADURA());

            Cell cellImc = row.createCell(cellnum++);
            cellImc.setCellValue(validacoes.truncateValorDoubleString(alunos.getIMC()));
            Cell cellImcPoest = row.createCell(cellnum++);
            
            cellImcPoest.setCellValue(alunos.getClassificacao_IMC_POEST());
            cellImcPoest.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getClassificacao_IMC_POEST()));
             
             
             Cell cellRceResult = row.createCell(cellnum++);
             cellRceResult.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE()));
             cellRceResult.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getValor_Classificacao_RCE()));
             
             Cell cellRce = row.createCell(cellnum++);
             cellRce.setCellValue(alunos.getClassificacao_RCE());
             cellRce.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getClassificacao_RCE()));
            
             
             Cell cellFlex = row.createCell(cellnum++);
             cellFlex.setCellValue(alunos.getFLEXIBILIDADE());
             Cell cellFlexCalss = row.createCell(cellnum++);
             cellFlexCalss.setCellValue(alunos.getCLASSIFICACAO_FLEXIBILIDADE());
             cellFlexCalss.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_FLEXIBILIDADE()));
              
             Cell cellAbdominal = row.createCell(cellnum++);
             cellAbdominal.setCellValue(alunos.getABDOMINAL());

             Cell cellAbdominalClass = row.createCell(cellnum++);
             cellAbdominalClass.setCellValue(alunos.getCLASSIFICACAO_ABDOMINAL());
             cellAbdominalClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_ABDOMINAL()));
             
             Cell cellCorrida6 = row.createCell(cellnum++);
             cellCorrida6.setCellValue(alunos.getCORRIDA_6_MIN());
             
             Cell cellCorrida6ClassSaude = row.createCell(cellnum++);
             cellCorrida6ClassSaude.setCellValue(alunos.getCLASSIFICACAO_6MIN_SAUDE());
             cellCorrida6ClassSaude.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_6MIN_SAUDE()));
             
              Cell cellCorrida6Saude = row.createCell(cellnum++);
             cellCorrida6Saude.setCellValue(alunos.getCORRIDA_6_MIN());
             
             Cell cellCorrida6Class = row.createCell(cellnum++);
             cellCorrida6Class.setCellValue(alunos.getCLASSIFICACAO_6MIN());
             cellCorrida6Class.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_6MIN()));
             
             Cell cellSalto = row.createCell(cellnum++);
             cellSalto.setCellValue(alunos.getSALTO());
             Cell cellSaltoClass = row.createCell(cellnum++);
             cellSaltoClass.setCellValue(alunos.getCLASSIFICACAO_SALTO());
             cellSaltoClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_SALTO()));
             
             Cell cellMedBall = row.createCell(cellnum++);
             cellMedBall.setCellValue(alunos.getMEDICINIBALL());
             Cell cellMedBallClass = row.createCell(cellnum++);
             cellMedBallClass.setCellValue(alunos.getCLASSIFICACAO_MEDICINIBALL());
             cellMedBallClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_MEDICINIBALL()));
             
             Cell cellVelocidade = row.createCell(cellnum++);
             cellVelocidade.setCellValue(alunos.getVELOCIDADE());
             Cell cellVelocidadeClass = row.createCell(cellnum++);
             cellVelocidadeClass.setCellValue(alunos.getCLASSIFICACAO_VELOCIDADE());
             cellVelocidadeClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_VELOCIDADE()));
             
             Cell cellAgilidade = row.createCell(cellnum++);
             cellAgilidade.setCellValue(alunos.getAGILIDADE());
             Cell cellAgilidadeClass = row.createCell(cellnum++);
             cellAgilidadeClass.setCellValue(alunos.getCLASSIFICACAO_AGILIDADE());
             cellAgilidadeClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getCLASSIFICACAO_AGILIDADE()));
             
                
             Cell Obs1 = row.createCell(cellnum++);
             Obs1.setCellValue(alunos.getOBS1_CALCADO());
             
             Cell Obs2 = row.createCell(cellnum++);
             Obs2.setCellValue(alunos.getOBS2_CAFE());
             
             Cell Obs3 = row.createCell(cellnum++);
             Obs3.setCellValue(alunos.getOBS3_PERCEPCAO());
             Cell Obs4 = row.createCell(cellnum++);
             Obs4.setCellValue(alunos.getOBS4_PERCEPCAO());
             Cell Obs5 = row.createCell(cellnum++);
             Obs5.setCellValue(alunos.getOBS5_PERCEPCAO());
             Cell Obs6 = row.createCell(cellnum++);
             Obs6.setCellValue(alunos.getOBS6_PERCEPCAO());
             Cell Obs7 = row.createCell(cellnum++);
             Obs7.setCellValue(alunos.getOBS7_PERCEPCAO());
             
             
        }

        //This data needs to be written (Object[])
        /*
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
		data.put("2", new Object[] {1, "Amit", "Shukla"});
		data.put("3", new Object[] {2, "Lokesh", "Gupta"});
		data.put("4", new Object[] {3, "John", "Adwards"});
		data.put("5", new Object[] {4, "Brian", "Schultz"});
		 
		//Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset)
		{
		    Row row = sheet.createRow(rownum++);
		    Object [] objArr = data.get(key);
		    int cellnum = 0;
		    for (Object obj : objArr)
		    {
		       Cell cell = (Cell) row.createCell(cellnum++);
		       if(obj instanceof String)
                    
		            cell.((String)obj);
		        else if(obj instanceof Integer)
		            cell.setCellValue((Integer)obj);
		    }
		}*/
        try {
            //Write the workbook in file system
             for(int i = 0; i<41; i++){
                 sheetAlunos.autoSizeColumn(i);
             }
         
            FileOutputStream out = new FileOutputStream(new File(pathOut));
            workbook.write(out);
            out.close();

            System.out.println("Planilha Criada Com Sucesso!!");

        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                e.getMessage(),
                "Erro ao criar a planilha! Verifique se o local de exportação está marcado!",
                JOptionPane.ERROR_MESSAGE);
             
        }
    }
    
    /*
    Expota tabelas comparativas 
    */
    public void exportarExelComparacaoSemestres(ArrayList<Alunos> listaAluno, String pathOut) {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
       
        TabelaXlsStyle tabelaXlsStyle = new TabelaXlsStyle();
        
        String sinalIndicativo = " ";

        //Create a blank sheet
        XSSFSheet sheetAlunos = workbook.createSheet("Alunos");
        Validacoes validacoes = new Validacoes();
        
       sheetAlunos.createFreezePane(2,1);
        
        int rownum = 1;
        int cell = 1;
        
        Row rowZero = sheetAlunos.createRow(0);
        
        Cell cab0 = rowZero.createCell(0);
        cab0.setCellValue(Constantes.CAB_MATRICULA);
        Cell cab1 = rowZero.createCell(cell++);
        cab1.setCellValue(Constantes.CAB_NOME);
        //PESO
        Cell cab2 = rowZero.createCell(cell++); 
        cab2.setCellValue(Constantes.CAB_PESO+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab3 = rowZero.createCell(cell++);
        cab3.setCellValue(Constantes.CAB_PESO+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab4 = rowZero.createCell(cell++);
        cab4.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab5 = rowZero.createCell(cell++);
        cab5.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab6 = rowZero.createCell(cell++);
        cab6.setCellValue(Constantes.CAB_INDICADORES);
        //ALTURA
        Cell cab7 = rowZero.createCell(cell++);
        cab7.setCellValue(Constantes.CAB_ALTURA+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab8 = rowZero.createCell(cell++);
        cab8.setCellValue(Constantes.CAB_ALTURA+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab9 = rowZero.createCell(cell++);
        cab9.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab10 = rowZero.createCell(cell++);
        cab10.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab11 = rowZero.createCell(cell++);
        cab11.setCellValue(Constantes.CAB_INDICADORES); 
        ///Cintura
        Cell cab12 = rowZero.createCell(cell++);
        cab12.setCellValue(Constantes.CAB_CINTURA+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cabCintura2 = rowZero.createCell(cell++);       
        cabCintura2.setCellValue(Constantes.CAB_CINTURA+" "+Constantes.CAB_SEMESTRE_DOIS);    
        Cell cab14 = rowZero.createCell(cell++);
        cab14.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab15 = rowZero.createCell(cell++);
        cab15.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab16 = rowZero.createCell(cell++);
        cab16.setCellValue(Constantes.CAB_INDICADORES);
        
         //Envergadura
        
        Cell cab17 = rowZero.createCell(cell++);
        cab17.setCellValue(Constantes.CAB_ENVERGADURA+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab18 = rowZero.createCell(cell++);
        cab18.setCellValue(Constantes.CAB_ENVERGADURA+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab19 = rowZero.createCell(cell++);
        cab19.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab20 = rowZero.createCell(cell++);
        cab20.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab21 = rowZero.createCell(cell++);
        cab21.setCellValue(Constantes.CAB_INDICADORES);
        
        
        //IMC
        Cell cabIMC = rowZero.createCell(cell++);
        cabIMC.setCellValue(Constantes.CAB_IMC+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cabIMC_2 = rowZero.createCell(cell++);
        cabIMC_2.setCellValue(Constantes.CAB_IMC+" "+Constantes.CAB_SEMESTRE_DOIS);
        
        Cell cabIMC_resultado = rowZero.createCell(cell++);
        cabIMC_resultado.setCellValue(Constantes.CAB_IMC+" "+Constantes.CAB_RESULTADO);
        
        Cell cabIMC_percentual = rowZero.createCell(cell++);
        cabIMC_percentual.setCellValue(Constantes.CAB_IMC+" "+Constantes.CAB_PERCENTUAL);
       
        Cell cabIMC_Indicadores = rowZero.createCell(cell++);
        cabIMC_Indicadores.setCellValue(Constantes.CAB_IMC+" "+Constantes.CAB_INDICADORES);
        
        
        
        
        //RCE

        Cell cabRCE1 = rowZero.createCell(cell++);        
        cabRCE1.setCellValue(Constantes.CAB_RCE_NUMB+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cabRCE2 = rowZero.createCell(cell++);        
        cabRCE2.setCellValue(Constantes.CAB_RCE_NUMB+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cabRCEResult = rowZero.createCell(cell++);
        cabRCEResult.setCellValue(Constantes.CAB_RESULTADO);
        Cell cabRcePerc = rowZero.createCell(cell++);
        cabRcePerc.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell RCEindi = rowZero.createCell(cell++);
        RCEindi.setCellValue(Constantes.CAB_INDICADORES);
        
      
        
        Cell cab22 = rowZero.createCell(cell++);
        cab22.setCellValue(Constantes.CAB_FLEXIBILIDADE+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab23 = rowZero.createCell(cell++);
        cab23.setCellValue(Constantes.CAB_FLEXIBILIDADE+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab24 = rowZero.createCell(cell++);
        cab24.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab25 = rowZero.createCell(cell++);
        cab25.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab26 = rowZero.createCell(cell++);
        cab26.setCellValue(Constantes.CAB_INDICADORES);
        
        //Abdominial
        Cell cab27 = rowZero.createCell(cell++);  
        cab27.setCellValue(Constantes.CAB_ABDOMINAL+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab28 = rowZero.createCell(cell++);
        cab28.setCellValue(Constantes.CAB_ABDOMINAL+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab29 = rowZero.createCell(cell++);
        cab29.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab30 = rowZero.createCell(cell++);
        cab30.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab31 = rowZero.createCell(cell++);
        cab31.setCellValue(Constantes.CAB_INDICADORES);
        
        //corrida 6 minutos vs saúde
        Cell cab6Sau = rowZero.createCell(cell++);  
        cab6Sau.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_6MIN_SAUDE +" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab6Sau2 = rowZero.createCell(cell++);
        cab6Sau2.setCellValue(Constantes.CAB_CLASSIFICAÇÃO_6MIN_SAUDE +" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab6Sau3 = rowZero.createCell(cell++);
        cab6Sau3.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab6Sau4 = rowZero.createCell(cell++);
        cab6Sau4.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab6Sau5 = rowZero.createCell(cell++);
        cab6Sau5.setCellValue(Constantes.CAB_INDICADORES);
      //======================================================================================00
        //corrida 6 minutos vs esporte
         Cell cab52 = rowZero.createCell(cell++);  
        cab52.setCellValue(Constantes.CAB_CORRIDA_6_MIN_DESEMPENHO_ESPORTIVO+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab53 = rowZero.createCell(cell++);
        cab53.setCellValue(Constantes.CAB_CORRIDA_6_MIN_DESEMPENHO_ESPORTIVO+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab54 = rowZero.createCell(cell++);
        cab54.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab55 = rowZero.createCell(cell++);
        cab55.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab56 = rowZero.createCell(cell++);
        cab56.setCellValue(Constantes.CAB_INDICADORES+" "+Constantes.CAB_CORRIDA_6_MIN_DESEMPENHO_ESPORTIVO);
        
         //Salto
        Cell cab32 = rowZero.createCell(cell++);  
        cab32.setCellValue(Constantes.CAB_SALTO+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab33 = rowZero.createCell(cell++);
        cab33.setCellValue(Constantes.CAB_SALTO+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab34 = rowZero.createCell(cell++);
        cab34.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab35 = rowZero.createCell(cell++);
        cab35.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab36 = rowZero.createCell(cell++);
        cab36.setCellValue(Constantes.CAB_INDICADORES);
        
        Cell cab37 = rowZero.createCell(cell++);  
        cab37.setCellValue(Constantes.CAB_MEDICINIBALL+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab38 = rowZero.createCell(cell++);
        cab38.setCellValue(Constantes.CAB_MEDICINIBALL+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab39 = rowZero.createCell(cell++);
        cab39.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab40 = rowZero.createCell(cell++);
        cab40.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab41 = rowZero.createCell(cell++);
        cab41.setCellValue(Constantes.CAB_INDICADORES);
        
        Cell cab42 = rowZero.createCell(cell++);  
        cab42.setCellValue(Constantes.CAB_VELOCIDADE+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab43 = rowZero.createCell(cell++);
        cab43.setCellValue(Constantes.CAB_VELOCIDADE+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab44 = rowZero.createCell(cell++);
        cab44.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab45 = rowZero.createCell(cell++);
        cab45.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab46 = rowZero.createCell(cell++);
        cab46.setCellValue(Constantes.CAB_INDICADORES);
        
        Cell cab47 = rowZero.createCell(cell++);  
        cab47.setCellValue(Constantes.CAB_AGILIDADE+" "+Constantes.CAB_SEMESTRE_UM);
        Cell cab48 = rowZero.createCell(cell++);
        cab48.setCellValue(Constantes.CAB_AGILIDADE+" "+Constantes.CAB_SEMESTRE_DOIS);
        Cell cab49 = rowZero.createCell(cell++);
        cab49.setCellValue(Constantes.CAB_RESULTADO);
        Cell cab50 = rowZero.createCell(cell++);
        cab50.setCellValue(Constantes.CAB_PERCENTUAL);
        Cell cab51 = rowZero.createCell(cell++);
        cab51.setCellValue(Constantes.CAB_INDICADORES);
        

        
        
        
        
        for (Alunos alunos : listaAluno) {
            sinalIndicativo = " ";

            Row row = sheetAlunos.createRow(rownum++);
            int cellnum = 0;

            Cell cellMat = row.createCell(cellnum++);
            cellMat.setCellValue(alunos.getMatricula());
            
            Cell cellNome = row.createCell(cellnum++);
            cellNome.setCellValue(alunos.getNome());
            
            //peso

            Cell cellPeso = row.createCell(cellnum++);
            cellPeso.setCellValue(alunos.getPESO());
            
            Cell cellPeso2 = row.createCell(cellnum++);
            cellPeso2.setCellValue(alunos.getPESO_COMP_2());
            
            if(alunos.getIndicadoresPeso().equals(Constantes.ZONA_CLASSIFICACAO_PESO_PERDA)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresPeso().equals(Constantes.ZONA_CLASSIFICAÇÃO_PESO_GANHO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellPesoResult = row.createCell(cellnum++);
            cellPesoResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPeso())));
            
            Cell cellPesoPerc = row.createCell(cellnum++);
            cellPesoPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemPeso()))+" %");
            
            Cell cellPesoInd = row.createCell(cellnum++);
            cellPesoInd.setCellValue(alunos.getIndicadoresPeso());
            cellPesoInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresPeso()));
            

         //altura
            
            Cell cellAltura= row.createCell(cellnum++);
            cellAltura.setCellValue(alunos.getALTURA());
            
            Cell cellAltura2 = row.createCell(cellnum++);
            cellAltura2.setCellValue(alunos.getALTURA_COMP_2());
            sinalIndicativo = " ";
            
            if(alunos.getIndicadoresAltura().equals(Constantes.ZONA_CLASSIFICAÇÃO_ALTURA_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresAltura().equals(Constantes.ZONA_CLASSIFICAÇÃO_ALTURA_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellAlturaResult = row.createCell(cellnum++);
            cellAlturaResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoAltura())));
            
            Cell AlturaPerc = row.createCell(cellnum++);
            AlturaPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemAltura()))+" %");
            
            Cell AlturaInd = row.createCell(cellnum++);
            AlturaInd.setCellValue(alunos.getIndicadoresAltura());
            AlturaInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresAltura()));
            sinalIndicativo = " ";
            
            //cintura
            Cell cellCintura = row.createCell(cellnum++);
            cellCintura.setCellValue(alunos.getCINTURA());
            
           
            //INDICADOR CLASSIFICADOR
          //  Cell cellRCEClassificador = row.createCell(cellnum++);
          //  cellRCEClassificador.setCellValue(alunos.getIndicadoresRCESemestre_1());
          //  cellRCEClassificador.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresRCESemestre_1()));
            
            Cell cellCintura2 = row.createCell(cellnum++);
            cellCintura2.setCellValue(alunos.getCINTURA_COMP2());

            
          //  //Cell cellRCEClassificadorSem2 = row.createCell(cellnum++);
            //cellRCEClassificadorSem2.setCellValue(alunos.getIndicadoresRCESemestre_2());
          //  cellRCEClassificadorSem2.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresRCESemestre_2()));
            
            sinalIndicativo = " ";
            
            if(alunos.getIndicadoresCintura().equals(Constantes.ZONA_CLASSIFICAÇÃO_CINTURA_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresCintura().equals(Constantes.ZONA_CLASSIFICAÇÃO_CINTURA_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellCinturaResult = row.createCell(cellnum++);
            cellCinturaResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoCintura())));
            
            Cell CinturaPerc = row.createCell(cellnum++);
            CinturaPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemCintura()))+" %");
            
            Cell CinturaInd = row.createCell(cellnum++);
            CinturaInd.setCellValue(alunos.getIndicadoresCintura());
            CinturaInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresCintura()));
            sinalIndicativo = " ";
            
               //envergadura
            Cell cellEnvergadura= row.createCell(cellnum++);
            cellEnvergadura.setCellValue(alunos.getENVERGADURA());
            
            Cell cellEnvergadura2 = row.createCell(cellnum++);
            cellEnvergadura2.setCellValue(alunos.getENVERGADURA_COMP2());
            
            
            if(alunos.getIndicadoresEnvergadura().equals(Constantes.ZONA_CLASSIFICAÇÃO_ENVERGADURA_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresEnvergadura().equals(Constantes.ZONA_CLASSIFICAÇÃO_ENVERGADURA_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellEnvergaduraResult = row.createCell(cellnum++);
            cellEnvergaduraResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoEnvergadura())));
            
            Cell EnvergaduraPerc = row.createCell(cellnum++);
            EnvergaduraPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemEnvergadura()))+" %");
            
            Cell EnvergaduraInd = row.createCell(cellnum++);
            EnvergaduraInd.setCellValue(alunos.getIndicadoresEnvergadura());
            EnvergaduraInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresEnvergadura()));
            sinalIndicativo = " ";
            
               //IMC
            Cell IMCNUM = row.createCell(cellnum++);
            IMCNUM.setCellValue(sinalIndicativo+validacoes.truncateValorDoubleString(alunos.getIMC()));
         //   Cell IMCClass = row.createCell(cellnum++);
         //   IMCClass.setCellValue(alunos.getIndicadoresIMCSem_1());
         //   IMCClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresIMCSem_1()));
            
            Cell IMCNUM_2 = row.createCell(cellnum++);
            IMCNUM_2.setCellValue(validacoes.truncateValorDoubleString(alunos.getIMC_Sem_2()));
         //   Cell IMCClass_2 = row.createCell(cellnum++);
         //   IMCClass_2.setCellValue(alunos.getIndicadoresIMCSem_2());
         //   IMCClass_2.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresIMCSem_2()));
         
            if(alunos.getIndicadoresIMCTab3().equals(Constantes.ZONA_CLASSIFICAÇÃO_IMC_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresIMCTab3().equals(Constantes.ZONA_CLASSIFICAÇÃO_IMC_AUMENTO)){
                    sinalIndicativo = " + ";
            }
         
            Cell IMC_Result = row.createCell(cellnum++);
            IMC_Result.setCellValue(sinalIndicativo+validacoes.truncateValorDoubleString(alunos.getResultadoIMCTab3()));
            Cell IMC_percent = row.createCell(cellnum++);
            IMC_percent.setCellValue(sinalIndicativo+validacoes.truncateValorDoubleString(alunos.getResultadoPorcentagemIMCTab3())+" %");
            
            Cell IMCNUM_Indicativo = row.createCell(cellnum++);
            IMCNUM_Indicativo.setCellValue(alunos.getIndicadoresIMCTab3());
            IMCNUM_Indicativo.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresIMCTab3()));
            sinalIndicativo = " ";
            
            //RCE
            
            Cell cellRCE1 = row.createCell(cellnum++);
            cellRCE1.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE()));
            
            Cell cellRCE2 = row.createCell(cellnum++);
            cellRCE2.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE_comp_2()));
            
             if(alunos.getIndicadoresRCETab3().equals(Constantes.ZONA_CLASSIFICAÇÃO_RCE_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresRCETab3().equals(Constantes.ZONA_CLASSIFICAÇÃO_RCE_AUMENTO)){
                    sinalIndicativo = " + ";
            }
            Cell cellRceResult = row.createCell(cellnum++);
            cellRceResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoRCEab3())));
            
            Cell RCEPerc = row.createCell(cellnum++);
            RCEPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemRCEab3()))+" %");
            
            Cell RCEInd = row.createCell(cellnum++);
            RCEInd.setCellValue(alunos.getIndicadoresRCETab3());
            RCEInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresRCETab3()));
            sinalIndicativo = " ";
            
              
            //flexibilidade
            Cell cellFlex= row.createCell(cellnum++);
            cellFlex.setCellValue(alunos.getFLEXIBILIDADE());
            
            Cell cellFlex2 = row.createCell(cellnum++);
            cellFlex2.setCellValue(alunos.getFLEXIBILIDADE_COMP2());
            
            
            if(alunos.getIndicadoresFlex().equals(Constantes.ZONA_CLASSIFICAÇÃO_FLEXIBILIDADE_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresFlex().equals(Constantes.ZONA_CLASSIFICAÇÃO_FLEXIBILIDADE_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellFlexResult = row.createCell(cellnum++);
            cellFlexResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoFlex())));
            
            Cell FlexPerc = row.createCell(cellnum++);
            FlexPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemFlex()))+" %");
            
            Cell FlexInd = row.createCell(cellnum++);
            FlexInd.setCellValue(alunos.getIndicadoresFlex());
            FlexInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresFlex()));
            sinalIndicativo = " ";
            
            //abdomem
            Cell cellAbd = row.createCell(cellnum++);
            cellAbd.setCellValue(alunos.getABDOMINAL());
            
            Cell cellAbd2 = row.createCell(cellnum++);
            cellAbd2.setCellValue(alunos.getABDOMINAL_COMP2());
            
            
            if(alunos.getIndicadoresAbdomem().equals(Constantes.ZONA_CLASSIFICAÇÃO_ABDOMINAL_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresAbdomem().equals(Constantes.ZONA_CLASSIFICAÇÃO_ABDOMINAL_AUMENTO)){
                    sinalIndicativo = " + ";
            }
            
           
         
            Cell cellAbdResult = row.createCell(cellnum++);
            cellAbdResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoAbdomem())));
            
            Cell AbdPerc = row.createCell(cellnum++);
            AbdPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemAbdomem()))+" %");
            
            Cell AbdInd = row.createCell(cellnum++);
            AbdInd.setCellValue(alunos.getIndicadoresAbdomem());
            AbdInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresAbdomem()));
            sinalIndicativo = " ";
            
            //corrida 6 minutos saude
           
            
            Cell cellCorrida6saude = row.createCell(cellnum++);
            cellCorrida6saude.setCellValue(alunos.getCORRIDA_6_MIN());
            
            Cell cellCorrida6saude2 = row.createCell(cellnum++);
            cellCorrida6saude2.setCellValue(alunos.getCORRIDA_6_MIN_COMP2());
            
            if(alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellCorridaResult6s = row.createCell(cellnum++);
            cellCorridaResult6s.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoCorrida_6())));
            
            Cell CorridaPerc6s = row.createCell(cellnum++);
            CorridaPerc6s.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemCorrida_6()))+" %");
            
            
            Cell CorridaInd6s = row.createCell(cellnum++);
            CorridaInd6s.setCellValue(alunos.getIndicadoresCorrida_6());
            CorridaInd6s.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresCorrida_6()));
            sinalIndicativo = " ";
            
            
            //============================================================
            
            //Corrida 6 metros esporte
            
              Cell cellCorrida = row.createCell(cellnum++);
            cellCorrida.setCellValue(alunos.getCORRIDA_6_MIN());
            
            Cell cellCorrida2 = row.createCell(cellnum++);
            cellCorrida2.setCellValue(alunos.getCORRIDA_6_MIN_COMP2());
            
            
            if(alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellCorridaResult = row.createCell(cellnum++);
            cellCorridaResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoCorrida_6())));
            
            Cell CorridaPerc = row.createCell(cellnum++);
            CorridaPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemCorrida_6()))+" %");
            
            
            Cell CorridaInd = row.createCell(cellnum++);
            CorridaInd.setCellValue(alunos.getIndicadoresCorrida_6());
            CorridaInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresCorrida_6()));
            sinalIndicativo = " ";
            
            //salto
            
            Cell cellSalto = row.createCell(cellnum++);
            cellSalto.setCellValue(alunos.getSALTO());
            
            Cell cellSalto2 = row.createCell(cellnum++);
            cellSalto2.setCellValue(alunos.getSALTO_COMPE2());
            
            
            if(alunos.getIndicadoresSalto().equals(Constantes.ZONA_CLASSIFICAÇÃO_SALTO_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresSalto().equals(Constantes.ZONA_CLASSIFICAÇÃO_SALTO_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellSaltoResult = row.createCell(cellnum++);
            cellSaltoResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoSalto())));
            
            Cell SaltoPerc = row.createCell(cellnum++);
            SaltoPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemSalto()))+" %");
            
            Cell SaltoInd = row.createCell(cellnum++);
            SaltoInd.setCellValue(alunos.getIndicadoresSalto());
            SaltoInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresSalto()));
            sinalIndicativo = " ";
            
            //MedBall
            
            Cell cellMedBall = row.createCell(cellnum++);
            cellMedBall.setCellValue(alunos.getMEDICINIBALL());
            
            Cell cellMedBall2 = row.createCell(cellnum++);
            cellMedBall2.setCellValue(alunos.getMEDICINIBALL_COMP2());
            
            
            if(alunos.getIndicadoresMedBall().equals(Constantes.ZONA_CLASSIFICAÇÃO_MEDBALL_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresMedBall().equals(Constantes.ZONA_CLASSIFICAÇÃO_MEDBALL_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellMedBallResult = row.createCell(cellnum++);
            cellMedBallResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoMedBall())));
            
            Cell MedBallPerc = row.createCell(cellnum++);
            MedBallPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemMedBall()))+" %");
            
            Cell MedBallInd = row.createCell(cellnum++);
            MedBallInd.setCellValue(alunos.getIndicadoresMedBall());
            MedBallInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresMedBall()));
            sinalIndicativo = " ";
            
            //Velocidade
            
            Cell cellVelocidade = row.createCell(cellnum++);
            cellVelocidade.setCellValue(alunos.getVELOCIDADE());
            
            Cell cellVelocidade2 = row.createCell(cellnum++);
            cellVelocidade2.setCellValue(alunos.getVELOCIDADE_COMP2());
            
            
            if(alunos.getIndicadoresVerlocidade().equals(Constantes.ZONA_CLASSIFICAÇÃO_VELOCIDADE_AUMENTO)){
                    sinalIndicativo = " + ";
            }
            if(alunos.getIndicadoresVerlocidade().equals(Constantes.ZONA_CLASSIFICAÇÃO_VELOCIDADE_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
           
            Cell cellVelocidadeResult = row.createCell(cellnum++);
            cellVelocidadeResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoVerlocidade())));
            
            Cell VelocidadePerc = row.createCell(cellnum++);
            VelocidadePerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemVerlocidade()))+" %");
            
            
            Cell VerlocidadeInd = row.createCell(cellnum++);
            VerlocidadeInd.setCellValue(alunos.getIndicadoresVerlocidade());
            VerlocidadeInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresVerlocidade()));
            sinalIndicativo = " ";
            
            //Agilidade
            
            Cell cellAgilidade = row.createCell(cellnum++);
            cellAgilidade.setCellValue(alunos.getAGILIDADE());
            
            Cell cellAgilidade2 = row.createCell(cellnum++);
            cellAgilidade2.setCellValue(alunos.getAGILIDADE_COMP2());
            
            
            if(alunos.getIndicadoresAgilidade().equals(Constantes.ZONA_CLASSIFICAÇÃO_AGILIDADE_DIMINUICAO)){
                    sinalIndicativo = " - ";
            }
            if(alunos.getIndicadoresAgilidade().equals(Constantes.ZONA_CLASSIFICAÇÃO_AGILIDADE_AUMENTO)){
                    sinalIndicativo = " + ";
            }
           
            Cell cellAgilidadeResult = row.createCell(cellnum++);
            cellAgilidadeResult.setCellValue(sinalIndicativo+validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoAgilidade())));
            
            Cell AgilidadePerc = row.createCell(cellnum++);
            AgilidadePerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemAgilidade()))+" %");
            
            Cell AgilidadeInd = row.createCell(cellnum++);
            AgilidadeInd.setCellValue(alunos.getIndicadoresAgilidade());
            AgilidadeInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresAgilidade()));
            sinalIndicativo = " ";
            
         
            
          
            //Corrida 6 metros SAUDE
            
         //   Cell CorridaIndSaude = row.createCell(cellnum++);
        //   CorridaIndSaude.setCellValue(alunos.getIndicadoresCorrida_6_saude());
        //   CorridaIndSaude.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresCorrida_6_saude()));
        //    sinalIndicativo = " ";
             
        }

        //This data needs to be written (Object[])
        /*
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
		data.put("2", new Object[] {1, "Amit", "Shukla"});
		data.put("3", new Object[] {2, "Lokesh", "Gupta"});
		data.put("4", new Object[] {3, "John", "Adwards"});
		data.put("5", new Object[] {4, "Brian", "Schultz"});
		 
		//Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset)
		{
		    Row row = sheet.createRow(rownum++);
		    Object [] objArr = data.get(key);
		    int cellnum = 0;
		    for (Object obj : objArr)
		    {
		       Cell cell = (Cell) row.createCell(cellnum++);
		       if(obj instanceof String)
                    
		            cell.((String)obj);
		        else if(obj instanceof Integer)
		            cell.setCellValue((Integer)obj);
		    }
		}*/
        try {
            //Write the workbook in file system
             for(int i = 0; i<78; i++){
                 sheetAlunos.autoSizeColumn(i);
             }
         
            FileOutputStream out = new FileOutputStream(new File(pathOut));
            workbook.write(out);
            out.close();

            System.out.println("Planilha Criada Com Sucesso!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

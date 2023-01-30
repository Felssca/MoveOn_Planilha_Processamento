/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;

import beans.Alunos;
import beans.Constantes;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import style.TabelaXlsStyle;
import util.Validacoes;

/**
 *
 * @author FelipeSSCA
 */
public class PlanilhaResultadoConteudo {

    public void montarConteudo(List<Alunos> listaAluno, XSSFSheet sheetAlunos, XSSFWorkbook workbook, TabelaXlsStyle tabelaXlsStyle) {

        Validacoes validacoes = new Validacoes();

        int rowNum = 2;

        for (Alunos alunos : listaAluno) {

            String sinalIndicativo = " ";
            int cellnum = 0;
            Row row = sheetAlunos.createRow(rowNum++);
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellMat = row.createCell(cellnum++);
            cellMat.setCellValue(alunos.getMatricula());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellGenero = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellGenero.setCellValue(alunos.getGenero());

            Cell cellNome = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellNome.setCellValue(alunos.getNome());

            Cell cellIdade = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellIdade.setCellValue(alunos.getIdade());

            //PESO
            Cell cellPeso = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellPeso.setCellValue(alunos.getPESO());

            Cell cellPeso2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellPeso2.setCellValue(alunos.getPESO_COMP_2());

            if (alunos.getIndicadoresPeso().equals(Constantes.ZONA_CLASSIFICACAO_PESO_PERDA)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresPeso().equals(Constantes.ZONA_CLASSIFICACAO_PESO_GANHO)) {
                sinalIndicativo = " + ";
            }

            Cell cellPesoResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellPesoResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPeso())));
            Cell cellPesoPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);

            cellPesoPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemPeso())) + " %");
            Cell cellPesoInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);

            cellPesoInd.setCellValue(alunos.getIndicadoresPeso());
            cellPesoInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresPeso()));
            sinalIndicativo = " ";

            //ALTURA
            Cell cellAltura = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAltura.setCellValue(alunos.getALTURA());

            Cell cellAltura2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAltura2.setCellValue(alunos.getALTURA_COMP_2());
            sinalIndicativo = " ";

            if (alunos.getIndicadoresAltura().equals(Constantes.ZONA_CLASSIFICACAO_ALTURA_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresAltura().equals(Constantes.ZONA_CLASSIFICACAO_ALTURA_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellAlturaResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAlturaResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoAltura())));

            Cell AlturaPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            AlturaPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemAltura())) + " %");

            Cell AlturaInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            AlturaInd.setCellValue(alunos.getIndicadoresAltura());
            AlturaInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresAltura()));
            sinalIndicativo = " ";

            //CINTURA
            Cell cellCintura = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCintura.setCellValue(alunos.getCINTURA());

            Cell cellCintura2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCintura2.setCellValue(alunos.getCINTURA_COMP2());

            if (alunos.getIndicadoresCintura().equals(Constantes.ZONA_CLASSIFICACAO_CINTURA_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresCintura().equals(Constantes.ZONA_CLASSIFICACAO_CINTURA_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellCinturaResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCinturaResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoCintura())));

            Cell CinturaPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            CinturaPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemCintura())) + " %");

            Cell CinturaInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            CinturaInd.setCellValue(alunos.getIndicadoresCintura());
            CinturaInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresCintura()));
            sinalIndicativo = " ";

            //ENVERGADURA
            Cell cellEnvergadura = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellEnvergadura.setCellValue(alunos.getENVERGADURA());

            Cell cellEnvergadura2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellEnvergadura2.setCellValue(alunos.getENVERGADURA_COMP2());

            if (alunos.getIndicadoresEnvergadura().equals(Constantes.ZONA_CLASSIFICACAO_ENVERGADURA_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresEnvergadura().equals(Constantes.ZONA_CLASSIFICACAO_ENVERGADURA_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellEnvergaduraResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellEnvergaduraResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoEnvergadura())));

            Cell EnvergaduraPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            EnvergaduraPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemEnvergadura())) + " %");

            Cell EnvergaduraInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            EnvergaduraInd.setCellValue(alunos.getIndicadoresEnvergadura());
            EnvergaduraInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresEnvergadura()));
            sinalIndicativo = " ";

            //IMC            
            Cell cellImcNum01 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellImcNum01.setCellValue(validacoes.truncateValorDoubleString(alunos.getIMC()));
          
            Cell cellImcNum02 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellImcNum02.setCellValue(validacoes.truncateValorDoubleString(alunos.getIMC_Sem_2()));
            
            if (alunos.getIndicadoresIMCTab3().equals(Constantes.ZONA_CLASSIFICACAO_IMC_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresIMCTab3().equals(Constantes.ZONA_CLASSIFICACAO_IMC_AUMENTO)) {
                sinalIndicativo = " + ";
            }
            
            Cell IMC_Result = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            IMC_Result.setCellValue(sinalIndicativo + validacoes.truncateValorDoubleString(alunos.getResultadoIMCTab3()));
            
            Cell IMC_percent = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            IMC_percent.setCellValue(sinalIndicativo + validacoes.truncateValorDoubleString(alunos.getResultadoPorcentagemIMCTab3()) + " %");

            Cell IMCNUM_Indicativo = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            IMCNUM_Indicativo.setCellValue(alunos.getIndicadoresIMCTab3());
            IMCNUM_Indicativo.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresIMCTab3()));
            sinalIndicativo = " ";

            //RCE
            Cell cellRCE1 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellRCE1.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE()));

            Cell cellRCE2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellRCE2.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE_comp_2()));

            if (alunos.getIndicadoresRCETab3().equals(Constantes.ZONA_CLASSIFICACAO_RCE_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresRCETab3().equals(Constantes.ZONA_CLASSIFICACAO_RCE_AUMENTO)) {
                sinalIndicativo = " + ";
            }
            Cell cellRceResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellRceResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoRCEab3())));

            Cell RCEPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            RCEPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemRCEab3())) + " %");

            Cell RCEInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            RCEInd.setCellValue(alunos.getIndicadoresRCETab3());
            RCEInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresRCETab3()));
            sinalIndicativo = " ";
            
            //FLEXIBILIDADE
            Cell cellFlex = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellFlex.setCellValue(alunos.getFLEXIBILIDADE());

            Cell cellFlex2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellFlex2.setCellValue(alunos.getFLEXIBILIDADE_COMP2());

            if (alunos.getIndicadoresFlex().equals(Constantes.ZONA_CLASSIFICACAO_FLEXIBILIDADE_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresFlex().equals(Constantes.ZONA_CLASSIFICACAO_FLEXIBILIDADE_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellFlexResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellFlexResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoFlex())));

            Cell FlexPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            FlexPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemFlex())) + " %");

            Cell FlexInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            FlexInd.setCellValue(alunos.getIndicadoresFlex());
            FlexInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresFlex()));
            sinalIndicativo = " ";

            //=================================================abdomem
            Cell cellAbd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAbd.setCellValue(alunos.getABDOMINAL());

            Cell cellAbd2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAbd2.setCellValue(alunos.getABDOMINAL_COMP2());

            if (alunos.getIndicadoresAbdomem().equals(Constantes.ZONA_CLASSIFICACAO_ABDOMINAL_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresAbdomem().equals(Constantes.ZONA_CLASSIFICACAO_ABDOMINAL_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellAbdResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAbdResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoAbdomem())));

            Cell AbdPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            AbdPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemAbdomem())) + " %");

            Cell AbdInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            AbdInd.setCellValue(alunos.getIndicadoresAbdomem());
            AbdInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresAbdomem()));
            sinalIndicativo = " ";

            //==============================================================MedBall
            Cell cellMedBall = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellMedBall.setCellValue(alunos.getMEDICINIBALL());

            Cell cellMedBall2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellMedBall2.setCellValue(alunos.getMEDICINIBALL_COMP2());

            if (alunos.getIndicadoresMedBall().equals(Constantes.ZONA_CLASSIFICACAO_MEDBALL_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresMedBall().equals(Constantes.ZONA_CLASSIFICACAO_MEDBALL_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellMedBallResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellMedBallResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoMedBall())));

            Cell MedBallPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            MedBallPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemMedBall())) + " %");

            Cell MedBallInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            MedBallInd.setCellValue(alunos.getIndicadoresMedBall());
            MedBallInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresMedBall()));
            sinalIndicativo = " ";

            //==================================SALTO 
            Cell cellSalto = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellSalto.setCellValue(alunos.getSALTO());

            Cell cellSalto2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellSalto2.setCellValue(alunos.getSALTO_COMPE2());

            if (alunos.getIndicadoresSalto().equals(Constantes.ZONA_CLASSIFICACAO_SALTO_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresSalto().equals(Constantes.ZONA_CLASSIFICACAO_SALTO_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellSaltoResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellSaltoResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoSalto())));

            Cell SaltoPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            SaltoPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemSalto())) + " %");

            Cell SaltoInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            SaltoInd.setCellValue(alunos.getIndicadoresSalto());
            SaltoInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresSalto()));
            sinalIndicativo = " ";

            //=====================================Agilidade
            Cell cellAgilidade = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAgilidade.setCellValue(alunos.getAGILIDADE());

            Cell cellAgilidade2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAgilidade2.setCellValue(alunos.getAGILIDADE_COMP2());

            if (alunos.getIndicadoresAgilidade().equals(Constantes.ZONA_CLASSIFICACAO_AGILIDADE_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresAgilidade().equals(Constantes.ZONA_CLASSIFICACAO_AGILIDADE_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellAgilidadeResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAgilidadeResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoAgilidade())));

            Cell AgilidadePerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            AgilidadePerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemAgilidade())) + " %");

            Cell AgilidadeInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            AgilidadeInd.setCellValue(alunos.getIndicadoresAgilidade());
            AgilidadeInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresAgilidade()));
            sinalIndicativo = " ";

            //=================================Velocidade
            Cell cellVelocidade = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVelocidade.setCellValue(alunos.getVELOCIDADE());

            Cell cellVelocidade2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVelocidade2.setCellValue(alunos.getVELOCIDADE_COMP2());

            if (alunos.getIndicadoresVerlocidade().equals(Constantes.ZONA_CLASSIFICACAO_VELOCIDADE_AUMENTO)) {
                sinalIndicativo = " + ";
            }
            if (alunos.getIndicadoresVerlocidade().equals(Constantes.ZONA_CLASSIFICACAO_VELOCIDADE_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }

            Cell cellVelocidadeResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVelocidadeResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoVerlocidade())));

            Cell VelocidadePerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            VelocidadePerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemVerlocidade())) + " %");

            Cell VerlocidadeInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            VerlocidadeInd.setCellValue(alunos.getIndicadoresVerlocidade());
            VerlocidadeInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresVerlocidade()));
            sinalIndicativo = " ";

            //========================================================corrida 6 minutos saude
            Cell cellCorrida6saude = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCorrida6saude.setCellValue(alunos.getCORRIDA_6_MIN());

            Cell cellCorrida6saude2 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCorrida6saude2.setCellValue(alunos.getCORRIDA_6_MIN_COMP2());

            if (alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICACAO_CORRIDA6_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICACAO_CORRIDA6_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellCorridaResult6s = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCorridaResult6s.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoCorrida_6())));

            Cell CorridaPerc6s = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            CorridaPerc6s.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemCorrida_6())) + " %");

            Cell CorridaInd6s = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            CorridaInd6s.setCellValue(alunos.getIndicadoresCorrida_6());
            CorridaInd6s.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresCorrida_6()));
            sinalIndicativo = " ";

            //==============================================VO2 CM 
            Cell cellVo2Um = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVo2Um.setCellValue(alunos.getVO2_MS_COMP_1());

            Cell cellVo2Dois = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVo2Dois.setCellValue(alunos.getVO2_MS_COMP_2());

            //=============================================VO2 Km 
            Cell cellVo2KmUm = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVo2KmUm.setCellValue(alunos.getVO2_KM_COMP_1());

            Cell cellVo2KmDois = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVo2KmDois.setCellValue(alunos.getVO2_KM_COMP_2());
            //============================================RESULTADO COMUM KM / CM 

            if (alunos.getIndicadoresV02Ms().equals(Constantes.ZONA_CLASSIFICACAO_V02_DIMINUICAO)) {
                sinalIndicativo = " + ";
            }
            if (alunos.getIndicadoresV02Ms().equals(Constantes.ZONA_CLASSIFICACAO_VO2_AUMENTO)) {
                sinalIndicativo = " - ";
            }

            Cell cellResultadoV02Ms = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellResultadoV02Ms.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoV02Ms())));

            Cell cellPercV02Ms = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellPercV02Ms.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemV02Ms())) + " %");

            Cell cellVo2msInd = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVo2msInd.setCellValue(alunos.getIndicadoresV02Ms());
            cellVo2msInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresV02Ms()));
            sinalIndicativo = " ";

            //============================================VO MAX
            Cell cellVoMax = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVoMax.setCellValue(alunos.getVO2_MAX_COMP_1());

            Cell cellVoMax02 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVoMax02.setCellValue(alunos.getVO2_MAX_COMP_2());

            if (alunos.getIndicadoresSalto().equals(Constantes.ZONA_CLASSIFICACAO_V02_DIMINUICAO)) {
                sinalIndicativo = " - ";
            }
            if (alunos.getIndicadoresSalto().equals(Constantes.ZONA_CLASSIFICACAO_VO2_AUMENTO)) {
                sinalIndicativo = " + ";
            }

            Cell cellVomaxResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVomaxResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoV02Max())));

            Cell voMaxPerc = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            voMaxPerc.setCellValue(validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemV02Max())) + " %");

            Cell voMaxindi = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            voMaxindi.setCellValue(alunos.getIndicadoresV02Max());
            voMaxindi.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresV02Max()));
            sinalIndicativo = " ";

//            //============================================VO MAX DESEMPENHO 
//            Cell cellVoMaxDesempenho01 = row.createCell(cellnum++); 
//            cellVoMaxDesempenho01.setCellValue(alunos.getVO2_MAX_DESEMPENHO_VALOR());
//
//            Cell cellVoMaxDesempenho02 = row.createCell(cellnum++);
//            cellVoMaxDesempenho02.setCellValue(alunos.getVO2_MAX_DESEMPENHO_RESULTADO());
//            cellVoMaxDesempenho02.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getVO2_MAX_DESEMPENHO_RESULTADO()));
//
//            if (alunos.getIndicadoresV02Ms().equals(Constantes.INDICADOR_POSITIVO)) {
//                sinalIndicativo = " + ";
//            }
//            if (alunos.getIndicadoresV02Ms().equals(Constantes.INDICADOR_NEGATIVO)) {
//                sinalIndicativo = " - ";
//            }  
//            
//            Cell cellResultadoV02km= row.createCell(cellnum++);
//            cellResultadoV02km.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoV02Km())));
//            
//            Cell cellPercV02Km = row.createCell(cellnum++);
//            cellPercV02Km.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.valueOf(alunos.getResultadoPorcentagemV02Km()))+ " %");
//            
//            Cell cellVo2kmInd = row.createCell(cellnum++);
//            cellVo2kmInd.setCellValue(alunos.getIndicadoresV02Km());
//            cellVo2kmInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresV02Km()));
//            sinalIndicativo = " ";
//            
//            
            //============================================================
            //Corrida 6 metros esporte
//            Cell cellCorrida = row.createCell(cellnum++);
//            cellCorrida.setCellValue(alunos.getCORRIDA_6_MIN());
//
//            Cell cellCorrida2 = row.createCell(cellnum++);
//            cellCorrida2.setCellValue(alunos.getCORRIDA_6_MIN_COMP2());
//
//            if (alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_DIMINUICAO)) {
//                sinalIndicativo = " - ";
//            }
//            if (alunos.getIndicadoresCorrida_6().equals(Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_AUMENTO)) {
//                sinalIndicativo = " + ";
//            }
//
//            Cell cellCorridaResult = row.createCell(cellnum++);
//            cellCorridaResult.setCellValue(sinalIndicativo + validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoCorrida_6())));
//
//            Cell CorridaPerc = row.createCell(cellnum++);
//            CorridaPerc.setCellValue(validacoes.truncateValorDouble(Double.parseDouble(alunos.getResultadoPorcentagemCorrida_6())) + " %");
//
//            Cell CorridaInd = row.createCell(cellnum++);
//            CorridaInd.setCellValue(alunos.getIndicadoresCorrida_6());
//            CorridaInd.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getIndicadoresCorrida_6()));
//            sinalIndicativo = " ";
            //Corrida 6 metros SAUDE
            //   Cell CorridaIndSaude = row.createCell(cellnum++);
            //   CorridaIndSaude.setCellValue(alunos.getIndicadoresCorrida_6_saude());
            //   CorridaIndSaude.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook,alunos.getIndicadoresCorrida_6_saude()));
            //    sinalIndicativo = " ";
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;

import beans.Alunos;
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
public class PlanilhaSemestresConteudo {

    public void montarPlanilhaConteudo(XSSFSheet sheetAlunos, XSSFWorkbook workbook, TabelaXlsStyle tabelaXlsStyle, List<Alunos> listaAluno) {

        Validacoes validacoes = new Validacoes();

        int rownum = 2;
        for (Alunos alunos : listaAluno) {

            Row row = sheetAlunos.createRow(rownum++);
            int cellnum = 0;

            Cell cellMat = row.createCell(cellnum++);
            cellMat.setCellValue(alunos.getMatricula());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellNumOrdem = row.createCell(cellnum++);
            cellNumOrdem.setCellValue(alunos.getGenero());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellNome = row.createCell(cellnum++);
            cellNome.setCellValue(alunos.getNome());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellDtNacimento = row.createCell(cellnum++);
            cellDtNacimento.setCellValue(alunos.getIdade());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellPeso = row.createCell(cellnum++);
            cellPeso.setCellValue(alunos.getPESO());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellAltura = row.createCell(cellnum++);
            cellAltura.setCellValue(alunos.getALTURA());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellCinta = row.createCell(cellnum++);
            cellCinta.setCellValue(alunos.getCINTURA());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellEnverga = row.createCell(cellnum++);
            cellEnverga.setCellValue(alunos.getENVERGADURA());
            sheetAlunos.autoSizeColumn(cellnum);

            Cell cellImc = row.createCell(cellnum++);
            cellImc.setCellValue(validacoes.truncateValorDoubleString(alunos.getIMC()));
            Cell cellImcPoest = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);

            cellImcPoest.setCellValue(alunos.getClassificacao_IMC_POEST());
            cellImcPoest.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getClassificacao_IMC_POEST()));

            Cell cellRceResult = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellRceResult.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE()));
            cellRceResult.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getValor_Classificacao_RCE()));

            Cell cellRce = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellRce.setCellValue(alunos.getClassificacao_RCE());
            cellRce.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getClassificacao_RCE()));

            Cell cellFlex = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellFlex.setCellValue(alunos.getFLEXIBILIDADE());
            Cell cellFlexCalss = row.createCell(cellnum++);
            cellFlexCalss.setCellValue(alunos.getCLASSIFICACAO_FLEXIBILIDADE());
            cellFlexCalss.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_FLEXIBILIDADE()));

            Cell cellAbdominal = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAbdominal.setCellValue(alunos.getABDOMINAL());

            Cell cellAbdominalClass = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAbdominalClass.setCellValue(alunos.getCLASSIFICACAO_ABDOMINAL());
            cellAbdominalClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_ABDOMINAL()));

            Cell cellCorrida6 = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCorrida6.setCellValue(alunos.getCORRIDA_6_MIN());

            Cell cellCorrida6ClassSaude = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);

            cellCorrida6ClassSaude.setCellValue(alunos.getCLASSIFICACAO_6MIN_SAUDE());
            cellCorrida6ClassSaude.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_6MIN_SAUDE()));

            Cell cellCorrida6Saude = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCorrida6Saude.setCellValue(alunos.getCORRIDA_6_MIN());

            Cell cellCorrida6Class = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellCorrida6Class.setCellValue(alunos.getCLASSIFICACAO_6MIN());
            cellCorrida6Class.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_6MIN()));

            Cell cellSalto = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellSalto.setCellValue(alunos.getSALTO());
            Cell cellSaltoClass = row.createCell(cellnum++);
            cellSaltoClass.setCellValue(alunos.getCLASSIFICACAO_SALTO());
            cellSaltoClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_SALTO()));

            Cell cellMedBall = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellMedBall.setCellValue(alunos.getMEDICINIBALL());
            Cell cellMedBallClass = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellMedBallClass.setCellValue(alunos.getCLASSIFICACAO_MEDICINIBALL());
            cellMedBallClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_MEDICINIBALL()));

            Cell cellVelocidade = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVelocidade.setCellValue(alunos.getVELOCIDADE());
            Cell cellVelocidadeClass = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellVelocidadeClass.setCellValue(alunos.getCLASSIFICACAO_VELOCIDADE());
            cellVelocidadeClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_VELOCIDADE()));

            Cell cellAgilidade = row.createCell(cellnum++);
            cellAgilidade.setCellValue(alunos.getAGILIDADE());
            sheetAlunos.autoSizeColumn(cellnum);
            Cell cellAgilidadeClass = row.createCell(cellnum++);
            sheetAlunos.autoSizeColumn(cellnum);
            cellAgilidadeClass.setCellValue(alunos.getCLASSIFICACAO_AGILIDADE());
            cellAgilidadeClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_AGILIDADE()));

            Cell cellVoMax = row.createCell(cellnum++);
            cellVoMax.setCellValue(validacoes.truncateValorDoubleString(alunos.getVO2_MAX()));
            sheetAlunos.autoSizeColumn(cellnum);
            Cell cellVoMaxClass = row.createCell(cellnum++);
            cellVoMaxClass.setCellValue(alunos.getCLASSFICACAO_VO2_MAX());
            sheetAlunos.autoSizeColumn(cellnum);
            cellVoMaxClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSFICACAO_VO2_MAX()));

        }
    }

}
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

    public void montarPlanilhaConteudo( XSSFSheet sheetAlunos,XSSFWorkbook workbook , TabelaXlsStyle tabelaXlsStyle,List<Alunos> listaAluno) {

        Validacoes validacoes = new Validacoes();

        int rownum = 2;
        for (Alunos alunos : listaAluno) {

            Row row = sheetAlunos.createRow(rownum++);
            int cellnum = 0;

            Cell cellMat = row.createCell(cellnum++);
            cellMat.setCellValue(alunos.getMatricula());

            Cell cellNumOrdem = row.createCell(cellnum++);
            cellNumOrdem.setCellValue(alunos.getGenero());

            Cell cellNome = row.createCell(cellnum++);
            cellNome.setCellValue(alunos.getNome());

            Cell cellDtNacimento = row.createCell(cellnum++);
            cellDtNacimento.setCellValue(alunos.getIdade());

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
            cellImcPoest.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getClassificacao_IMC_POEST()));

            Cell cellRceResult = row.createCell(cellnum++);
            cellRceResult.setCellValue(validacoes.truncateValorDoubleString(alunos.getValor_Classificacao_RCE()));
            cellRceResult.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getValor_Classificacao_RCE()));

            Cell cellRce = row.createCell(cellnum++);
            cellRce.setCellValue(alunos.getClassificacao_RCE());
            cellRce.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getClassificacao_RCE()));

            Cell cellFlex = row.createCell(cellnum++);
            cellFlex.setCellValue(alunos.getFLEXIBILIDADE());
            Cell cellFlexCalss = row.createCell(cellnum++);
            cellFlexCalss.setCellValue(alunos.getCLASSIFICACAO_FLEXIBILIDADE());
            cellFlexCalss.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_FLEXIBILIDADE()));

            Cell cellAbdominal = row.createCell(cellnum++);
            cellAbdominal.setCellValue(alunos.getABDOMINAL());

            Cell cellAbdominalClass = row.createCell(cellnum++);
            cellAbdominalClass.setCellValue(alunos.getCLASSIFICACAO_ABDOMINAL());
            cellAbdominalClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_ABDOMINAL()));

            Cell cellCorrida6 = row.createCell(cellnum++);
            cellCorrida6.setCellValue(alunos.getCORRIDA_6_MIN());

            Cell cellCorrida6ClassSaude = row.createCell(cellnum++);
            cellCorrida6ClassSaude.setCellValue(alunos.getCLASSIFICACAO_6MIN_SAUDE());
            cellCorrida6ClassSaude.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_6MIN_SAUDE()));

            Cell cellCorrida6Saude = row.createCell(cellnum++);
            cellCorrida6Saude.setCellValue(alunos.getCORRIDA_6_MIN());

            Cell cellCorrida6Class = row.createCell(cellnum++);
            cellCorrida6Class.setCellValue(alunos.getCLASSIFICACAO_6MIN());
            cellCorrida6Class.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_6MIN()));

            Cell cellSalto = row.createCell(cellnum++);
            cellSalto.setCellValue(alunos.getSALTO());
            Cell cellSaltoClass = row.createCell(cellnum++);
            cellSaltoClass.setCellValue(alunos.getCLASSIFICACAO_SALTO());
            cellSaltoClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_SALTO()));

            Cell cellMedBall = row.createCell(cellnum++);
            cellMedBall.setCellValue(alunos.getMEDICINIBALL());
            Cell cellMedBallClass = row.createCell(cellnum++);
            cellMedBallClass.setCellValue(alunos.getCLASSIFICACAO_MEDICINIBALL());
            cellMedBallClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_MEDICINIBALL()));

            Cell cellVelocidade = row.createCell(cellnum++);
            cellVelocidade.setCellValue(alunos.getVELOCIDADE());
            Cell cellVelocidadeClass = row.createCell(cellnum++);
            cellVelocidadeClass.setCellValue(alunos.getCLASSIFICACAO_VELOCIDADE());
            cellVelocidadeClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_VELOCIDADE()));

            Cell cellAgilidade = row.createCell(cellnum++);
            cellAgilidade.setCellValue(alunos.getAGILIDADE());
            Cell cellAgilidadeClass = row.createCell(cellnum++);
            cellAgilidadeClass.setCellValue(alunos.getCLASSIFICACAO_AGILIDADE());
            cellAgilidadeClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSIFICACAO_AGILIDADE()));

            Cell cellVoMax = row.createCell(cellnum++);
            cellVoMax.setCellValue(validacoes.truncateValorDoubleString(alunos.getVO2_MAX()));
            Cell cellVoMaxClass = row.createCell(cellnum++);
            cellVoMaxClass.setCellValue(alunos.getCLASSFICACAO_VO2_MAX());
            cellVoMaxClass.setCellStyle(tabelaXlsStyle.cellDesempenhoFraco(workbook, alunos.getCLASSFICACAO_VO2_MAX()));

        }
    }

}

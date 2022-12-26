/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabelas;

import beans.Constantes;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import style.TabelaXlsStyle;

/**
 *
 * @author FelipeSSCA
 */
public class PlanilhasSemestresCabecalho {

    public void planilhaSemestreMontaCabecalho(XSSFWorkbook workbook,XSSFSheet sheetAlunos, TabelaXlsStyle tabelaXlsStyle) {
        
        sheetAlunos.createFreezePane(4, 3);

        int cellCount = 0;

        //LINHA 0
        //estilo cabeçalho:
        //linha um cabeçalho
        Row rowNum = sheetAlunos.createRow(0);
        Cell cabcabecalho = rowNum.createCell(0);

        cabcabecalho.setCellStyle(tabelaXlsStyle.cellTabelaResultadoIdentificacaoDicente(workbook));
        cabcabecalho.setCellValue(Constantes.CAB_IDENTIFICACAO_DISCENTE);

        //linha dois cabeçalho
        sheetAlunos.addMergedRegion(CellRangeAddress.valueOf("A1:BU1"));

        //AVALIAÇÃO GERAL 
        // sheetAlunos.addMergedRegion(CellRangeAddress.valueOf("D1:BK"));
        Short laranja = IndexedColors.ORANGE.getIndex();
        Short azul = IndexedColors.AQUA.getIndex();
        Short marfim = IndexedColors.LIGHT_YELLOW.getIndex();

        //LINHA CABECALHO 2
        Row rowZero = sheetAlunos.createRow(1);

        Cell titulo = rowZero.createCell(cellCount++);
        titulo.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_MATRICULA));
        titulo.setCellValue(Constantes.CAB_MATRICULA);

        Cell genero = rowZero.createCell(cellCount++);
        genero.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_GENERO));
        genero.setCellValue(Constantes.CAB_GENERO);

        Cell nome = rowZero.createCell(cellCount++);
        nome.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_NOME));
        nome.setCellValue(Constantes.CAB_NOME);

        Cell idade = rowZero.createCell(cellCount++);
        idade.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_IDADE));
        idade.setCellValue(Constantes.CAB_IDADE);
        //---------------------------------------------------------------------------------------------------
        Cell cab9 = rowZero.createCell(cellCount++);
        cab9.setCellValue(Constantes.CAB_PESO);
        cab9.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab10 = rowZero.createCell(cellCount++);
        cab10.setCellValue(Constantes.CAB_ALTURA);
        cab10.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab13 = rowZero.createCell(cellCount++);
        cab13.setCellValue(Constantes.CAB_CINTURA);
        cab13.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab15 = rowZero.createCell(cellCount++);
        cab15.setCellValue(Constantes.CAB_ENVERGADURA);
        cab15.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab11 = rowZero.createCell(cellCount++);
        cab11.setCellValue(Constantes.CAB_IMC);
        cab11.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab12 = rowZero.createCell(cellCount++);
        cab12.setCellValue(Constantes.CAB_IMC_POEST);
        cab12.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cabRce = rowZero.createCell(cellCount++);
        cabRce.setCellValue(Constantes.CAB_RCE_NUMB);
        cabRce.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab14 = rowZero.createCell(cellCount++);
        cab14.setCellValue(Constantes.CAB_RCE);
        cab14.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab16 = rowZero.createCell(cellCount++);
        cab16.setCellValue(Constantes.CAB_FLEXIBILIDADE);
        cab16.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab17 = rowZero.createCell(cellCount++);
        cab17.setCellValue(Constantes.CAB_CLASSIFICACAO_FLEXIBILIDADE);
        cab17.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab18 = rowZero.createCell(cellCount++);
        cab18.setCellValue(Constantes.CAB_ABDOMINAL);
        cab18.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab20 = rowZero.createCell(cellCount++);
        cab20.setCellValue(Constantes.CAB_CLASSIFICACAO_ABDOMINAL);
        cab20.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab29ValorSaude = rowZero.createCell(cellCount++);
        cab29ValorSaude.setCellValue(Constantes.CAB_CLASSIFICACAO_6MIN_SAUDE);
        cab29ValorSaude.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab31 = rowZero.createCell(cellCount++);
        cab31.setCellValue(Constantes.CAB_CLASS_CLASSIFICACAO_6MIN_SAUDE);
        cab31.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab29 = rowZero.createCell(cellCount++);
        cab29.setCellValue(Constantes.CAB_CORRIDA_6_MIN_DESEMPENHO_ESPORTIVO);
        cab29.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab30 = rowZero.createCell(cellCount++);
        cab30.setCellValue(Constantes.CAB_CORRIDA_CLASSIFICACAO_6_MIN_DESEMPENHO_ESPORTIVO);
        cab30.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab21 = rowZero.createCell(cellCount++);
        cab21.setCellValue(Constantes.CAB_SALTO);
        cab21.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));
        Cell cab22 = rowZero.createCell(cellCount++);
        cab22.setCellValue(Constantes.CAB_CLASSIFICACAO_SALTO_HORIZONTAL);
        cab22.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab23 = rowZero.createCell(cellCount++);
        cab23.setCellValue(Constantes.CAB_MEDICINIBALL);
        cab23.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));
        Cell cab24 = rowZero.createCell(cellCount++);
        cab24.setCellValue(Constantes.CAB_CLASSIFICACAO_MEDICINIBALL);
        cab24.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab25 = rowZero.createCell(cellCount++);
        cab25.setCellValue(Constantes.CAB_VELOCIDADE);
        cab25.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));
        Cell cab26 = rowZero.createCell(cellCount++);
        cab26.setCellValue(Constantes.CAB_CLASSIFICACAO_VELOCIDADE);
        cab26.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab27 = rowZero.createCell(cellCount++);
        cab27.setCellValue(Constantes.CAB_AGILIDADE);
        cab27.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));
        Cell cab28 = rowZero.createCell(cellCount++);
        cab28.setCellValue(Constantes.CAB_CLASSIFICACAO_AGILIDADE);
        cab28.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cabVo2 = rowZero.createCell(cellCount++);
        cabVo2.setCellValue(Constantes.CAB_VOMAX);
        cabVo2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));
        Cell cabVo2Classficicacao = rowZero.createCell(cellCount++);
        cabVo2Classficicacao.setCellValue(Constantes.CAB_CLASS_CLASSIFICACAO_VO2_MAX);
        cabVo2Classficicacao.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

    }

}

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
public class PlanilhaResultadoCabecalho {

    public void montarCabecalho(XSSFWorkbook workbook, XSSFSheet sheetAlunos, TabelaXlsStyle tabelaXlsStyle) {

        sheetAlunos.createFreezePane(4, 3);

        int cell = 0;

        //LINHA 0
        //estilo cabeçalho:
        //linha um cabeçalho
        Row rowInit = sheetAlunos.createRow(0);
        Cell cabcabecalho = rowInit.createCell(0);

        cabcabecalho.setCellStyle(tabelaXlsStyle.cellTabelaResultadoIdentificacaoDicente(workbook));
        cabcabecalho.setCellValue(Constantes.CAB_IDENTIFICACAO_DISCENTE);

        //linha dois cabeçalho
        sheetAlunos.addMergedRegion(CellRangeAddress.valueOf("A1:CC1"));

        //AVALIAÇÃO GERAL 
        // sheetAlunos.addMergedRegion(CellRangeAddress.valueOf("D1:BK"));
        Short laranja = IndexedColors.ORANGE.getIndex();
        Short azul = IndexedColors.AQUA.getIndex();
        Short marfim = IndexedColors.LIGHT_YELLOW.getIndex();

        //LINHA CABECALHO 2
        Row rowZero = sheetAlunos.createRow(1);

        Cell titulo = rowZero.createCell(cell++);
        titulo.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_MATRICULA));
        titulo.setCellValue(Constantes.CAB_MATRICULA);

        Cell genero = rowZero.createCell(cell++);
        genero.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_GENERO));
        genero.setCellValue(Constantes.CAB_GENERO);

        Cell nome = rowZero.createCell(cell++);
        nome.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_NOME));
        nome.setCellValue(Constantes.CAB_NOME);

        Cell idade = rowZero.createCell(cell++);
        idade.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalho02(workbook, Constantes.CAB_IDADE));
        idade.setCellValue(Constantes.CAB_IDADE);

        //PESO
        Cell cab2 = rowZero.createCell(cell++);
        cab2.setCellValue(Constantes.CAB_PESO_1.concat(Constantes.CAB_PESO_KG));
        cab2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab3 = rowZero.createCell(cell++);
        cab3.setCellValue(Constantes.CAB_PESO_2.concat(Constantes.CAB_PESO_KG));
        cab3.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab4 = rowZero.createCell(cell++);
        cab4.setCellValue(Constantes.CAB_DIFERENCA);
        cab4.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab5 = rowZero.createCell(cell++);
        cab5.setCellValue(Constantes.CAB_PERCENTUAL);
        cab5.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab6 = rowZero.createCell(cell++);
        cab6.setCellValue(Constantes.CAB_RESULTADO);
        cab6.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //ALTURA
        Cell cab7 = rowZero.createCell(cell++);
        cab7.setCellValue(Constantes.CAB_ALTURA_1.concat(Constantes.CAB_CM));
        cab7.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab8 = rowZero.createCell(cell++);
        cab8.setCellValue(Constantes.CAB_ALTURA_2.concat(Constantes.CAB_CM));
        cab8.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab9 = rowZero.createCell(cell++);
        cab9.setCellValue(Constantes.CAB_DIFERENCA);
        cab9.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab10 = rowZero.createCell(cell++);
        cab10.setCellValue(Constantes.CAB_PERCENTUAL);
        cab10.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab11 = rowZero.createCell(cell++);
        cab11.setCellValue(Constantes.CAB_RESULTADO);
        cab11.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        ///Cintura
        Cell cab12 = rowZero.createCell(cell++);
        cab12.setCellValue(Constantes.CAB_CINTURA_1.concat(Constantes.CAB_CM));
        cab12.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab13 = rowZero.createCell(cell++);
        cab13.setCellValue(Constantes.CAB_CINTURA_2.concat(Constantes.CAB_CM));
        cab13.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab14 = rowZero.createCell(cell++);
        cab14.setCellValue(Constantes.CAB_DIFERENCA);
        cab14.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab15 = rowZero.createCell(cell++);
        cab15.setCellValue(Constantes.CAB_PERCENTUAL);
        cab15.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab16 = rowZero.createCell(cell++);
        cab16.setCellValue(Constantes.CAB_RESULTADO);
        cab16.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //ENVERGADURA
        Cell cab17 = rowZero.createCell(cell++);
        cab17.setCellValue(Constantes.CAB_ENVERGADURA_1.concat(Constantes.CAB_CM));
        cab17.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab18 = rowZero.createCell(cell++);
        cab18.setCellValue(Constantes.CAB_ENVERGADURA_2.concat(Constantes.CAB_CM));
        cab18.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab19 = rowZero.createCell(cell++);
        cab19.setCellValue(Constantes.CAB_DIFERENCA);
        cab19.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab20 = rowZero.createCell(cell++);
        cab20.setCellValue(Constantes.CAB_PERCENTUAL);
        cab20.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab21 = rowZero.createCell(cell++);
        cab21.setCellValue(Constantes.CAB_RESULTADO);
        cab21.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //IMC
        Cell cabIMC = rowZero.createCell(cell++);
        cabIMC.setCellValue(Constantes.CAB_IMC_1.concat(Constantes.CAB_CM));
        cabIMC.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cabImc2 = rowZero.createCell(cell++);
        cabImc2.setCellValue(Constantes.CAB_IMC_2.concat(Constantes.CAB_CM));
        cabImc2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cabImcDiff = rowZero.createCell(cell++);
        cabImcDiff.setCellValue(Constantes.CAB_DIFERENCA);
        cabImcDiff.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cabImcPerc = rowZero.createCell(cell++);
        cabImcPerc.setCellValue(Constantes.CAB_PERCENTUAL);
        cabImcPerc.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cabImcResult = rowZero.createCell(cell++);
        cabImcResult.setCellValue(Constantes.CAB_RESULTADO);
        cabImcResult.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //RCE
        Cell cabRce = rowZero.createCell(cell++);
        cabRce.setCellValue(Constantes.CAB_RCE_NUMB_1.concat(Constantes.CAB_CM));
        cabRce.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cabRce2 = rowZero.createCell(cell++);
        cabRce2.setCellValue(Constantes.CAB_RCE_NUMB_2.concat(Constantes.CAB_CM));
        cabRce2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cabRCEDiff = rowZero.createCell(cell++);
        cabRCEDiff.setCellValue(Constantes.CAB_DIFERENCA);
        cabRCEDiff.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cabRcePerc = rowZero.createCell(cell++);
        cabRcePerc.setCellValue(Constantes.CAB_PERCENTUAL);
        cabRcePerc.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cabRceResult = rowZero.createCell(cell++);
        cabRceResult.setCellValue(Constantes.CAB_RESULTADO);
        cabRceResult.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //FLEXBILIDADE
        Cell cab22 = rowZero.createCell(cell++);
        cab22.setCellValue(Constantes.CAB_FLEXIBILIDADE_1.concat(Constantes.CAB_CM));
        cab22.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab23 = rowZero.createCell(cell++);
        cab23.setCellValue(Constantes.CAB_FLEXIBILIDADE_2.concat(Constantes.CAB_CM));
        cab23.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab24 = rowZero.createCell(cell++);
        cab24.setCellValue(Constantes.CAB_DIFERENCA);
        cab24.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab25 = rowZero.createCell(cell++);
        cab25.setCellValue(Constantes.CAB_PERCENTUAL);
        cab25.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab26 = rowZero.createCell(cell++);
        cab26.setCellValue(Constantes.CAB_RESULTADO);
        cab26.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //Abdominial
        Cell cab27 = rowZero.createCell(cell++);
        cab27.setCellValue(Constantes.CAB_ABDOMINAL_1.concat(Constantes.CAB_MAX));
        cab27.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab28 = rowZero.createCell(cell++);
        cab28.setCellValue(Constantes.CAB_ABDOMINAL_2.concat(Constantes.CAB_MAX));
        cab28.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab29 = rowZero.createCell(cell++);
        cab29.setCellValue(Constantes.CAB_DIFERENCA);
        cab29.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab30 = rowZero.createCell(cell++);
        cab30.setCellValue(Constantes.CAB_PERCENTUAL);
        cab30.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab31 = rowZero.createCell(cell++);
        cab31.setCellValue(Constantes.CAB_RESULTADO);
        cab31.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //ARREMESSO
        Cell cab32 = rowZero.createCell(cell++);
        cab32.setCellValue(Constantes.CAB_ARREMESSO_1.concat(Constantes.CAB_METRO));
        cab32.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab33 = rowZero.createCell(cell++);
        cab33.setCellValue(Constantes.CAB_ARREMESSO_2.concat(Constantes.CAB_METRO));
        cab33.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab34 = rowZero.createCell(cell++);
        cab34.setCellValue(Constantes.CAB_DIFERENCA);
        cab34.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab35 = rowZero.createCell(cell++);
        cab35.setCellValue(Constantes.CAB_PERCENTUAL);
        cab35.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab36 = rowZero.createCell(cell++);
        cab36.setCellValue(Constantes.CAB_RESULTADO);
        cab36.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //SALTO
        Cell cab37 = rowZero.createCell(cell++);
        cab37.setCellValue(Constantes.CAB_SALTO_1.concat(Constantes.CAB_METRO));
        cab37.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab38 = rowZero.createCell(cell++);
        cab38.setCellValue(Constantes.CAB_SALTO_2.concat(Constantes.CAB_METRO));
        cab38.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab39 = rowZero.createCell(cell++);
        cab39.setCellValue(Constantes.CAB_DIFERENCA);
        cab39.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab40 = rowZero.createCell(cell++);
        cab40.setCellValue(Constantes.CAB_PERCENTUAL);
        cab40.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab41 = rowZero.createCell(cell++);
        cab41.setCellValue(Constantes.CAB_RESULTADO);
        cab41.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //AGILIDADE
        Cell cab42 = rowZero.createCell(cell++);
        cab42.setCellValue(Constantes.CAB_AGILIDADE_1.concat(Constantes.CAB_SEGUNDO));
        cab42.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell cab43 = rowZero.createCell(cell++);
        cab43.setCellValue(Constantes.CAB_AGILIDADE_2.concat(Constantes.CAB_SEGUNDO));
        cab43.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell cab44 = rowZero.createCell(cell++);
        cab44.setCellValue(Constantes.CAB_DIFERENCA);
        cab44.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab45 = rowZero.createCell(cell++);
        cab45.setCellValue(Constantes.CAB_PERCENTUAL);
        cab45.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell cab46 = rowZero.createCell(cell++);
        cab46.setCellValue(Constantes.CAB_RESULTADO);
        cab46.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //VELOCIDADE
        Cell velocidadeCell = rowZero.createCell(cell++);
        velocidadeCell.setCellValue(Constantes.CAB_VELOCIDADE_1.concat(Constantes.CAB_SEGUNDO));
        velocidadeCell.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell velocidadeCell2 = rowZero.createCell(cell++);
        velocidadeCell2.setCellValue(Constantes.CAB_VELOCIDADE_2.concat(Constantes.CAB_SEGUNDO));
        velocidadeCell2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell velocidadeCell3 = rowZero.createCell(cell++);
        velocidadeCell3.setCellValue(Constantes.CAB_DIFERENCA);
        velocidadeCell3.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell velcidadeCell4 = rowZero.createCell(cell++);
        velcidadeCell4.setCellValue(Constantes.CAB_PERCENTUAL);
        velcidadeCell4.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell velocidadeCell5 = rowZero.createCell(cell++);
        velocidadeCell5.setCellValue(Constantes.CAB_RESULTADO);
        velocidadeCell5.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //RESISTENCIA
        Cell resistenciaCell = rowZero.createCell(cell++);
        resistenciaCell.setCellValue(Constantes.CAB_RESISTENCIA_1.concat(Constantes.CAB_METRO));
        resistenciaCell.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell resistenciaCell2 = rowZero.createCell(cell++);
        resistenciaCell2.setCellValue(Constantes.CAB_RESISTENCIA_2.concat(Constantes.CAB_METRO));
        resistenciaCell2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell resistenciaCell3 = rowZero.createCell(cell++);
        resistenciaCell3.setCellValue(Constantes.CAB_DIFERENCA);
        resistenciaCell3.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell resistenciaCell4 = rowZero.createCell(cell++);
        resistenciaCell4.setCellValue(Constantes.CAB_PERCENTUAL);
        resistenciaCell4.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell resistenciaCell5 = rowZero.createCell(cell++);
        resistenciaCell5.setCellValue(Constantes.CAB_RESULTADO);
        resistenciaCell5.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //VOMAX CM 
        Cell v02Cell = rowZero.createCell(cell++);
        v02Cell.setCellValue(Constantes.CAB_VOMAX_MS_1);
        v02Cell.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell v02Cell2 = rowZero.createCell(cell++);
        v02Cell2.setCellValue(Constantes.CAB_VOMAX_MS_2);
        v02Cell2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        //VOMAX KM 
        Cell v02CellKm = rowZero.createCell(cell++);
        v02CellKm.setCellValue(Constantes.CAB_VOMAX_KM_1);
        v02CellKm.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell v02Cell2Km = rowZero.createCell(cell++);
        v02Cell2Km.setCellValue(Constantes.CAB_VOMAX_KM_2);
        v02Cell2Km.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        //VO KM E CM RESULTADO UNIFICADO 
        Cell v02Cell3 = rowZero.createCell(cell++);
        v02Cell3.setCellValue(Constantes.CAB_DIFERENCA);
        v02Cell3.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell v02Cell4 = rowZero.createCell(cell++);
        v02Cell4.setCellValue(Constantes.CAB_PERCENTUAL);
        v02Cell4.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell v02Cell5 = rowZero.createCell(cell++);
        v02Cell5.setCellValue(Constantes.CAB_RESULTADO);
        v02Cell5.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        //VO MAX
        Cell vomaxCell01 = rowZero.createCell(cell++);
        vomaxCell01.setCellValue(Constantes.CAB_VOMAX_01);
        vomaxCell01.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, azul));

        Cell voMaxCell2 = rowZero.createCell(cell++);
        voMaxCell2.setCellValue(Constantes.CAB_VOMAX_02);
        voMaxCell2.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, laranja));

        Cell voMaxCell3 = rowZero.createCell(cell++);
        voMaxCell3.setCellValue(Constantes.CAB_DIFERENCA);
        voMaxCell3.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell voMaxCell4 = rowZero.createCell(cell++);
        voMaxCell4.setCellValue(Constantes.CAB_PERCENTUAL);
        voMaxCell4.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));

        Cell voMaxCell5 = rowZero.createCell(cell++);
        voMaxCell5.setCellValue(Constantes.CAB_RESULTADO);
        voMaxCell5.setCellStyle(tabelaXlsStyle.cellTabelaResultadoCabecalhoReultado(workbook, marfim));


    }

}

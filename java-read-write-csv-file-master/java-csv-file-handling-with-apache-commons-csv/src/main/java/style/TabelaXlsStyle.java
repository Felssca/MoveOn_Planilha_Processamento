/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package style;

import beans.Constantes;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Felipessca
 */
public class TabelaXlsStyle {

    public CellStyle cellDesempenhoFraco(XSSFWorkbook workbook, String classificacao) {

        CellStyle cellStyle = null;
        cellStyle = workbook.createCellStyle();
        Font font = workbook.createFont();

        if (classificacao == null) {
            cellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
            cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            font.setColor(IndexedColors.BLACK.getIndex());
            cellStyle.setFont(font);
        } else {

            if (classificacao.equals(Constantes.IMC_RISCO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.IMC_SAUDAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.FLEX_SAUDAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.FLEX_RISCO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            //6minutos corrida SAUDE X ESPORTE - SAUDE
            if (classificacao.equals(Constantes.CORRIDA_6M_SAUDE_RISCO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.CORRIDA_6M_SAUDE_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);
            }

            /**
             * Classifica豫o TABELA 1 E 2
             */
            if (classificacao.equals(Constantes.FRACO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.RAZOAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.BOM)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.MUITO_BOM)) {
                cellStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);
            }
            if (classificacao.equals(Constantes.EXCELENCA)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE1.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);
            }
            /**
             * Resultado
             */

            if (classificacao.equals(Constantes.INDICADOR_NEGATIVO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.INDICADOR_POSITIVO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE1.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.INDICADOR_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * TABELA 3 CLASSIFICACAO
             */

            /**
             * Resultado peso
             */
            if (classificacao.equals(Constantes.ZONA_CLASSIFICACAO_PESO_GANHO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICACAO_PESO_PERDA)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICACAO_PESO_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * Resultado ALTURA
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ALTURA_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ALTURA_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ALTURA_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);
            }
            /**
             * Resultado AGILIDADE
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_AGILIDADE_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_AGILIDADE_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_AGILIDADE_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);
            }

            /**
             * Resultado CINTURA
             */
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CINTURA_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CINTURA_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CINTURA_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * ENVERGADURA
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ENVERGADURA_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ENVERGADURA_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ENVERGADURA_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * SALTO
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_SALTO_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_SALTO_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_SALTO_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * ABDOMEM
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ABDOMINAL_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ABDOMINAL_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_ABDOMINAL_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * VELOCIDADE
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_VELOCIDADE_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_VELOCIDADE_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_VELOCIDADE_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * FLEXIBILIDADE
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_FLEXIBILIDADE_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_FLEXIBILIDADE_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_FLEXIBILIDADE_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * CORRIDA ESPORTE
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CORRIDA6_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CORRIDA6_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CORRIDA6_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * CORRIDA SAUDE
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CORRIDA6_SAUDE_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CORRIDA6_SAUDE_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_CORRIDA6_SAUDE_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
            /**
             * MEDBALL
             */

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_MEDBALL_AUMENTO)) {
                cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE.index);
                cellStyle.setFont(font);
            }

            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_MEDBALL_DIMINUICAO)) {
                cellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.WHITE1.index);
                cellStyle.setFont(font);

            }
            if (classificacao.equals(Constantes.ZONA_CLASSIFICA플O_MEDBALL_ESTAVEL)) {
                cellStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                font.setColor(IndexedColors.BLACK.index);
                cellStyle.setFont(font);

            }
        }

        return cellStyle;
    }

    public CellStyle cellTabelaResultadoCabecalho02(XSSFWorkbook workbook, String campo) {

        CellStyle cellStyle = null;
        cellStyle = workbook.createCellStyle();
        Font font = workbook.createFont();

        cellStyle.setFillForegroundColor(IndexedColors.GREY_80_PERCENT.index);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        font.setColor(IndexedColors.WHITE1.getIndex());
        cellStyle.setFont(font);

        if (!campo.equals(Constantes.CAB_NOME)) {
            cellStyle.setRotation((short) 90);
        }

        return cellStyle;

    }

    public CellStyle cellTabelaResultadoCabecalhoReultado(XSSFWorkbook workbook, Short cores) {

        CellStyle cellStyle = null;
        cellStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setColor(IndexedColors.BLACK.getIndex());
        font.setBold(true);
        
        cellStyle.setFillForegroundColor(cores);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setRotation((short) 90);

        cellStyle.setFont(font);

        return cellStyle;

    }}

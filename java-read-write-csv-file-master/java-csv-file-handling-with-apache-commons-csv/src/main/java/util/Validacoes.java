/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Constantes;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;

/**
 *
 * @author FelpeSSCA
 */
public class Validacoes {

    public boolean isPathEmptXlsx(String path) {

        if (path != null) {
            if (path.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public boolean isPathValidXlsx(String path) {

        if (path != null) {
            if (path.endsWith("xls") || path.endsWith("xlsx")) {
                return true;
            }
        }

        return false;

    }

    public boolean verificaNumeroInteiro(String s) {

        // cria um array de char  
        // char[] c = s.toCharArray();  
        boolean isInterger = true;
        if (s == null) {
            isInterger = false;
        } else {

            for (int i = 0; i < s.length(); i++) {
                // verifica se o char não é um dígito  
                if (!Character.isDigit(s.charAt(i))) {
                    isInterger = false;
                    break;
                }
            }
        }

        return isInterger;

    }

    public boolean verificaNueroDouble(String numero) {

        boolean isDouble = false;
        try {
            Double.valueOf(numero);
            isDouble = true;
        } catch (NumberFormatException e) {
            isDouble = false;
        }

        return isDouble;

    }

    public int calculaIdadeAtual(java.util.Date dataNasc) {

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        } else {
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH)
                    < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
    }

    public int calcularIdadeAtual(String dataNascimento) {
        if (dataNascimento != null && !dataNascimento.isEmpty()) {

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataAniversario = LocalDate.parse(dataNascimento, formatter);
                LocalDate dataAtual = LocalDate.of(2016, Month.NOVEMBER, 16);

                return Period.between(dataAniversario, dataAtual).getYears();

            } catch (Exception ex) {
                System.out.println("Erro ao converter data " + ex.getMessage());
            }
        }

        return 0;

    }

    public double transformarCampoDouble(String valor) {
        String valorAlterado = valor;

        if (valor != null && !valor.isEmpty()) {
            if (valor.contains(",")) {
                valorAlterado = valor.replace(",", ".");

            }
            return Double.parseDouble(valorAlterado);
        }

        return 0.0;
    }

    public int calculaIdadeEpocaProva(java.util.Date dataNasc, Date dataEpocaExame) {

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar dataEpocaProva = Calendar.getInstance();
        dataEpocaProva.setTime(dataEpocaExame);
        int idade = dataEpocaProva.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (dataEpocaProva.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        } else {
            if (dataEpocaProva.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && dataEpocaProva.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
    }

    public int idadeFinal(String idadeNotFormat) throws Exception {

        //   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date dataNascimento = sdf.parse(idadeNotFormat);
        int idadeAtual = calculaIdadeAtual(dataNascimento);
        System.out.println(idadeAtual);

        return idadeAtual;
    }

    public int idadeEpocaTeste(String idadeNotFormat, String dataExame) throws Exception {

        SimpleDateFormat sdfExame = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(idadeNotFormat);
        Date exame = sdfExame.parse(dataExame);
        int idadeAtual = calculaIdadeEpocaProva(dataNascimento, exame);
        System.out.println(idadeAtual);

        return idadeAtual;
    }

    public boolean isMatricula(String matricula) {
        if (matricula == null) {
            return false;
        } else {
            return matricula.length() >= 5;
        }

    }

    public double truncateValorDouble(Double value) {
        if (value == null || value.equals("")) {
            return 0;
        } else {
            return Math.round(value * 100) / 100d;
        }
    }

    public String truncateValorDoubleString(String value) {
        if (value == null || value.equals("")) {
            return Constantes.ERROR_TRUCA_DOUBLR;
        } else {

            Double valor = Double.valueOf(value);
            DecimalFormat df = new DecimalFormat("0.##");
            return df.format(valor);
        }
    }

    public boolean isNull(String aluno) {
        boolean isNull = true;

        if (aluno == null || aluno.equals("null")) {

            isNull = false;

        }

        return isNull;
    }

    public boolean isCellEmpty(final Cell cell) {
        if (cell == null) { // use row.getCell(x, Row.CREATE_NULL_AS_BLANK) to avoid null cells
            return true;
        }

        if (cell.getCellType() == cell.getCellType().BLANK) {
            return true;
        }

        if (cell.getCellType() == cell.getCellType().STRING && cell.getStringCellValue().trim().isEmpty()) {
            return true;
        }

        return false;
    }

    public String covertCellToString(final Cell cell, String campoEsperado) {
        System.out.println("Campo " + campoEsperado + " Tipo da celula " + cell.getCellType());
        if (null == cell.getCellType()) {
            return null;
        } else {
            switch (cell.getCellType()) {
                case STRING:
                    System.out.println("Valor do campo: " + cell.getStringCellValue());
                    return cell.getStringCellValue();
                case NUMERIC:
                    System.out.println("Valor do campo:" + cell.getNumericCellValue());
                    return String.valueOf(cell.getNumericCellValue());
                default:
                    return null;
            }
        }

    }

}

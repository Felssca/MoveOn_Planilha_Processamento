/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Constantes;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
            if (path.isBlank()) {
                return false;
            }
            if (path.isEmpty()) {
                return false;
            }
        }

        return true;
    }
    
    
    public boolean isPathValidXlsx(String path){
    
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
            Double.parseDouble(numero);
            isDouble = true;
        } catch (Exception e) {
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
            if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
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
        boolean isMatricula = false;
        if (matricula == null) {

        } else {
            if (matricula.length() < 5) {
                isMatricula = false;
            } else {
                isMatricula = true;
            }
        }

        return isMatricula;
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

            Double valor = Double.parseDouble(value);
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

}

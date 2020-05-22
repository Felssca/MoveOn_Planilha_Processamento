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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import util.Legendas;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import util.Validacoes;

/**
 *
 * @author FelipeSSCA
 */
public class CarregarArquivo {

    private Alunos alunos;
    private ArrayList<Alunos> listaAlunos = new ArrayList();
    private Validacoes validacao = new Validacoes();
    private Legendas legendas = new Legendas();
    private String logSistema;

    private void acrescentarLogSistemaInterno(String log) {

        logSistema += log + "\n";

    }

    public void carregarArquivos(String pathName) throws IOException, Exception {
        FileInputStream arquivo = null;
        try {
            arquivo = new FileInputStream(new File(
                    pathName));

            //     HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
            XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
            XSSFSheet sheetAlunos = workbook.getSheetAt(0);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dataNascimento = "";
            String dataAvalicao = "";

            Iterator<Row> rowIterator = sheetAlunos.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
                int max = row.getLastCellNum();
                alunos = new Alunos();
                if (row.getRowNum() == 0) {

                } else if (max == row.getRowNum()) {
                    break;
                } else {

                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        switch (cell.getColumnIndex()) {
                            case 0:
                                alunos.setMatricula(cell.getStringCellValue());
                                System.out.println("----" + alunos.getMatricula());
                                acrescentarLogSistemaInterno("----" + alunos.getMatricula());

                                break;
                            case 1:
                                alunos.setNumeroOrdem(String.valueOf(cell.getNumericCellValue()));
                                System.out.println("----" + alunos.getNumeroOrdem());
                                acrescentarLogSistemaInterno("----" + alunos.getNumeroOrdem());

                                break;
                            case 2:
                                alunos.setNome(cell.getStringCellValue());
                                break;
                            case 3:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setQUANTIDADE_TOTAL_DE_TREINOS(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 4:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setQUANTIDADE_DE_TREINOS_POR_ALUNOS(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 5:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setQUANTIDADE_DE_VEZES_COM_UNIFORME(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 6:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    
                                    if (cell.getCellType() == CellType.STRING) {
                                        System.out.println("Tipo de celula[x]:" + cell.getCellType());
                                        String dataString = cell.getStringCellValue();
                                        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                                        dataNascimento = sdf.format(data);
                                        System.out.println("DT-Nacimento[*-String]:" +dataNascimento);
                                    } else {
                                        dataNascimento = sdf.format(cell.getDateCellValue());
                                        System.out.println("DT-Nacimento[*-Numeric]:" +dataNascimento);
                                    }
                                    alunos.setDtNascimento(dataNascimento);
    
                                }

                                break;
                            case 7:
                                alunos.setGenero(cell.getStringCellValue());
                                break;
                            case 8:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setnAvaliacao(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 9:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    if(cell.getCellType()== CellType.STRING){   
                                     String dataString = cell.getStringCellValue();
                                     Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                                     dataAvalicao = sdf.format(data);
                                    }
                                    //String dataFormatada = sdf.format(cell.getDateCellValue());
                                    dataAvalicao = sdf.format(cell.getDateCellValue());
                                    alunos.setDtAvaliacao(dataAvalicao);
                                    int idadeEpocaExame = validacao.idadeEpocaTeste(alunos.getDtNascimento(), alunos.getDtAvaliacao());
                                    alunos.setIdade(Integer.toString(idadeEpocaExame));
                                }
                                break;
                            case 10:
                                alunos.setSERIE(cell.getStringCellValue());
                                break;
                            case 11:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setTURMA(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 12:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setPESO(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 13:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setALTURA(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 14:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setIMC("");
                                } else {
                                    alunos.setIMC(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 15:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setClassificacao_IMC_POEST("");
                                } else {
                                    alunos.setClassificacao_IMC_POEST(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 16:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setCINTURA(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 17:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setClassificacao_RCE("");
                                } else {
                                    alunos.setClassificacao_RCE(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 18:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setENVERGADURA(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 19:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setFLEXIBILIDADE("0");
                                } else {
                                    alunos.setFLEXIBILIDADE(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 20:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setCLASSIFICACAO_FLEXIBILIDADE("0");
                                } else {
                                    alunos.setCLASSIFICACAO_FLEXIBILIDADE(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 21:
                                alunos.setABDOMINAL(String.valueOf(cell.getNumericCellValue()));
                                break;
                            case 22:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBSERVACAO_ABDOMINAL("");
                                } else {
                                    alunos.setOBSERVACAO_ABDOMINAL(cell.getStringCellValue());
                                }
                                break;
                            case 23:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setCLASSIFICACAO_ABDOMINAL("");
                                } else {
                                    alunos.setCLASSIFICACAO_ABDOMINAL(cell.getStringCellValue());
                                }
                                break;
                            case 24:
                                alunos.setSALTO(String.valueOf(cell.getNumericCellValue()));
                                break;
                            case 25:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setCLASSIFICACAO_SALTO("");
                                } else {
                                    alunos.setCLASSIFICACAO_SALTO(cell.getStringCellValue());
                                }
                                break;
                            case 26:
                                alunos.setMEDICINIBALL(String.valueOf(cell.getNumericCellValue()));
                                break;
                            case 27:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setCLASSIFICACAO_MEDICINIBALL("");
                                } else {
                                    alunos.setCLASSIFICACAO_MEDICINIBALL(cell.getStringCellValue());
                                }
                                break;

                            case 28:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setVELOCIDADE(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 29:
                                alunos.setCLASSIFICACAO_VELOCIDADE("");
                                break;
                            case 30:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setAGILIDADE(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 31:
                                alunos.setCLASSIFICACAO_AGILIDADE("");
                                break;
                            case 32:
                                if (validacao.isCellEmpty(cell)) {
                                } else {
                                    alunos.setCORRIDA_6_MIN(String.valueOf(cell.getNumericCellValue()));
                                }
                                break;
                            case 33:
                                alunos.setCLASSIFICACAO_6MIN("");
                                break;
                            case 34:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS1_CALCADO(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS1_CALCADO(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS1));
                                }
                                break;
                            case 35:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS2_CAFÉ(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS2_CAFÉ(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS2));
                                }

                                break;
                            case 36:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS2_CAFÉ(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS2_CAFÉ(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS2));
                                }
                                break;
                            case 37:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS3_PERCEPCAO(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS3_PERCEPCAO(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS3));
                                }

                                break;
                            case 38:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS3_PERCEPCAO(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS3_PERCEPCAO(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS3));
                                }
                                break;
                            case 39:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS4_PERCEPCAO(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS4_PERCEPCAO(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS3));
                                }
                                break;
                            case 40:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS5_PERCEPCAO(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS5_PERCEPCAO(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS3));
                                }
                                break;
                            case 41:
                                if (validacao.isCellEmpty(cell)) {
                                    alunos.setOBS6_PERCEPCAO(Constantes.BRANCO);
                                } else {
                                    alunos.setOBS7_PERCEPCAO(legendas.converteLegendas(cell.getStringCellValue(), Constantes.OBS3));
                                }
                                break;

                        }

                    }
                }
                getListaAlunos().add(alunos);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
        } finally {
            arquivo.close();
        }

    }

    /**
     * @return the listaAlunos
     */
    public ArrayList<Alunos> getListaAlunos() {
        return listaAlunos;
    }

    /**
     * @param listaAlunos the listaAlunos to set
     */
    public void setListaAlunos(ArrayList<Alunos> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

}

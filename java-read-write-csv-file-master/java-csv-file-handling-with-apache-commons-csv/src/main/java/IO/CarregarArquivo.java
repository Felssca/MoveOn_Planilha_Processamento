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
    private final Validacoes validacao = new Validacoes();
    
    public void carregarArquivos(String pathName) throws IOException, Exception {
        
        try (final FileInputStream arquivo = new FileInputStream(new File(pathName))) {

            //     HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
            XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
            XSSFSheet sheetAlunos = workbook.getSheetAt(0);
            
            for (Row row : sheetAlunos) {
                Iterator<Cell> cellIterator = row.cellIterator();
                int max = row.getLastCellNum();
                alunos = new Alunos();
                if (row.getRowNum() < 2) {
                    System.out.println("Cabeçalho!");
                } else if (max == row.getRowNum()) {
                    break;
                } else {
                    
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        switch (cell.getColumnIndex()) {
                            case 0:
                                alunos.setMatricula(validacao.covertCellToString(cell, Constantes.CAB_MATRICULA));
                                break;
                            case 1:
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                String dataString = validacao.covertCellToString(cell, Constantes.CAB_DT_NASCIMENTO);
                                if (dataString.contains("/")) {
                                    Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                                    alunos.setDtNascimento(sdf.format(data));
                                } else {
                                    alunos.setDtNascimento(null);
                                }
                                
                                break;
                            case 2:
                                alunos.setGenero(validacao.covertCellToString(cell, Constantes.CAB_GENERO));
                                break;
                            case 3:
                                alunos.setDeficienciaReportada(validacao.covertCellToString(cell, Constantes.CAB_DEFICIENCIA_REPOT));
                                break;
                            case 4:
                                alunos.setNome(validacao.covertCellToString(cell, Constantes.CAB_NOME));
                                break;
                            case 5:
                                alunos.setPESO(validacao.covertCellToString(cell, Constantes.CAB_PESO));
                                break;
                            case 6:
                                alunos.setALTURA(validacao.covertCellToString(cell, Constantes.CAB_ALTURA));
                                break;
                            case 7:
                                alunos.setENVERGADURA(validacao.covertCellToString(cell, Constantes.CAB_ENVERGADURA));
                                break;
                            case 8:
                                alunos.setCINTURA(validacao.covertCellToString(cell, Constantes.CAB_CINTURA));
                                break;
                            case 9:
                                alunos.setFLEXIBILIDADE(validacao.covertCellToString(cell, Constantes.CAB_FLEXIBILIDADE));
                                break;
                            case 10:
                                alunos.setABDOMINAL(validacao.covertCellToString(cell, Constantes.CAB_ABDOMINAL));
                                break;
                            case 11:
                                alunos.setMEDICINIBALL(validacao.covertCellToString(cell, Constantes.CAB_MEDICINIBALL));
                                break;
                            case 12:
                                alunos.setSALTO(validacao.covertCellToString(cell, Constantes.CAB_SALTO));
                                break;
                            case 13:
                                alunos.setAGILIDADE(validacao.covertCellToString(cell, Constantes.CAB_AGILIDADE));
                                break;
                            case 14:
                                alunos.setVELOCIDADE(validacao.covertCellToString(cell, Constantes.CAB_VELOCIDADE));
                                break;
                            case 15:
                                alunos.setCORRIDA_6_MIN(validacao.covertCellToString(cell, Constantes.CAB_CORRIDA_6_MIN));
                                break;
                            case 16:
                                alunos.setParticipacaoTestes(validacao.covertCellToString(cell, Constantes.PARTICIPACAO_TESTE));
                                break;
                        }
                        
                    }
                }
                getListaAlunos().add(alunos);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo Excel não encontrado!");
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

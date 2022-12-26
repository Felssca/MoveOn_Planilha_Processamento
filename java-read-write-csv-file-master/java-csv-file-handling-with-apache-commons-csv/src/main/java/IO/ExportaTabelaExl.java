/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import beans.Alunos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import style.TabelaXlsStyle;
import tabelas.PlanilhaResultadoCabecalho;
import tabelas.PlanilhaResultadoConteudo;
import tabelas.PlanilhaSemestresConteudo;
import tabelas.PlanilhasSemestresCabecalho;

/**
 *
 * @author FelipeSSCA
 */
public class ExportaTabelaExl {

    //exporta planilha 01 e 02 isoladamente
    public void exportarPlanilhaSemestresExel(List<Alunos> listaAluno, String pathOut) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        TabelaXlsStyle tabelaXlsStyle = new TabelaXlsStyle();
        //Create a blank sheet
        XSSFSheet sheetAlunos = workbook.createSheet("Alunos");

        PlanilhasSemestresCabecalho cabecalho = new PlanilhasSemestresCabecalho();
        cabecalho.planilhaSemestreMontaCabecalho(workbook, sheetAlunos, tabelaXlsStyle);

        PlanilhaSemestresConteudo conteudo = new PlanilhaSemestresConteudo();
        conteudo.montarPlanilhaConteudo(sheetAlunos, workbook, tabelaXlsStyle, listaAluno);

        try {
            //Write the workbook in file system
            for (int i = 0; i < listaAluno.size(); i++) {
                sheetAlunos.autoSizeColumn(i);
            }

            try ( FileOutputStream out = new FileOutputStream(new File(pathOut))) {
                workbook.write(out);
            }

            System.out.println("Planilha Semestre Criada Com Sucesso!!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                    e.getMessage(),
                    "Erro ao criar a planilha!",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    /*
    Expota tabelas comparativas semestre 01 x semestre 02
     */
    public void exportarComparacaoSemestresExcel(List<Alunos> listaAluno, String pathOut) {
        //Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        TabelaXlsStyle tabelaXlsStyle = new TabelaXlsStyle();
        //Create a blank sheet
        XSSFSheet sheetAlunos = workbook.createSheet("Alunos");

        PlanilhaResultadoCabecalho cabecalho = new PlanilhaResultadoCabecalho();
        cabecalho.montarCabecalho(workbook, sheetAlunos, tabelaXlsStyle);

        PlanilhaResultadoConteudo conteudo = new PlanilhaResultadoConteudo();
        conteudo.montarConteudo(listaAluno, sheetAlunos, workbook, tabelaXlsStyle);

        try ( FileOutputStream out = new FileOutputStream(new File(pathOut))) {
            //Write the workbook in file system
            for (int i = 0; i < listaAluno.size(); i++) {
                sheetAlunos.autoSizeColumn(i);
            }
            workbook.write(out);
            out.close();

            System.out.println("Planilha Criada Com Sucesso!!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                    e.getMessage(),
                    "Erro ao criar a planilha FINAL RESULTANTE!",
                    JOptionPane.ERROR_MESSAGE);

            
            System.out.println("Erro ao gerar a  planilha FINAL RESULTANTE, motivo: " + e.getMessage());
        }
    }
}

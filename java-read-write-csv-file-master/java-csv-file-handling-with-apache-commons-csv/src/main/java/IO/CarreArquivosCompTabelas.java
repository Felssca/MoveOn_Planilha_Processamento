/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import beans.Alunos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import negocio.AlgoGeracaoResultado;
import processo.IniciarProcesso;

/**
 *
 * @author felipessca
 */
public class CarreArquivosCompTabelas {


    private List<Alunos> listaAlunosSem1;
    private List<Alunos> listaAlunosSem2;
    private List<Alunos> listaAlunosResult;

    private String INPUTcaminhoPlanilha01;
    private String OUTPUTcaminhoPlanilha01;

    private String INPUTcaminhoPlanilha02;
    private String OUTPUTcaminhoPlanilha02;

    private String OUTPUTplanilha03;

    //========================================================
    public CarreArquivosCompTabelas() {

    }

    public void carregarTabelasSemestreUm() throws IOException, Exception {

        IniciarProcesso iniciarProcesso = new IniciarProcesso();
        iniciarProcesso.iniciarProcessoLeituraXls(getINPUTcaminhoPlanilha01());
        listaAlunosSem1 = iniciarProcesso.getListaAluns();
        exportarTabelasXlsx(listaAlunosSem1, getOUTPUTcaminhoPlanilha01());

    }

    public void carregarTabelasSemestreDois() throws IOException, Exception {

        IniciarProcesso iniciarProcesso = new IniciarProcesso();
        iniciarProcesso.iniciarProcessoLeituraXls(getINPUTcaminhoPlanilha02());
        listaAlunosSem2 = iniciarProcesso.getListaAluns();
        exportarTabelasXlsx(listaAlunosSem2, getOUTPUTcaminhoPlanilha02());

    }

    public void processarResultadosTabelasTres() {
        
        AlgoGeracaoResultado geracaoResultado = new AlgoGeracaoResultado();
        listaAlunosResult = geracaoResultado.processarResultadosTabelasTres(listaAlunosSem1,listaAlunosSem2);
        exportarTabelasXlsxResultado(listaAlunosResult, getOUTPUTplanilha03());

    }

    private void exportarTabelasXlsx(List<Alunos> resultadoAlunos, String pathOut) {

        ExportaTabelaExl exportaTabelaExl = new ExportaTabelaExl();
        exportaTabelaExl.exportarPlanilhaSemestresExel(resultadoAlunos, pathOut);

    }

    private void exportarTabelasXlsxResultado(List<Alunos> resultadoAlunos, String pathOut) {

        ExportaTabelaExl exportaTabelaExl = new ExportaTabelaExl();
        exportaTabelaExl.exportarComparacaoSemestresExcel(resultadoAlunos, pathOut);

    }

    /**
     * @return the listaAlunosSem1
     */
    public List<Alunos> getListaAlunosSem1() {
        return listaAlunosSem1;
    }

    /**
     * @param listaAlunosSem1 the listaAlunosSem1 to set
     */
    public void setListaAlunosSem1(ArrayList<Alunos> listaAlunosSem1) {
        this.listaAlunosSem1 = listaAlunosSem1;
    }

    /**
     * @return the listaAlunosSem2
     */
    public List<Alunos> getListaAlunosSem2() {
        return listaAlunosSem2;
    }

    /**
     * @param listaAlunosSem2 the listaAlunosSem2 to set
     */
    public void setListaAlunosSem2(ArrayList<Alunos> listaAlunosSem2) {
        this.listaAlunosSem2 = listaAlunosSem2;
    }

    /**
     * @return the INPUTcaminhoPlanilha01
     */
    public String getINPUTcaminhoPlanilha01() {
        return INPUTcaminhoPlanilha01;
    }

    /**
     * @param INPUTcaminhoPlanilha01 the INPUTcaminhoPlanilha01 to set
     */
    public void setINPUTcaminhoPlanilha01(String INPUTcaminhoPlanilha01) {
        this.INPUTcaminhoPlanilha01 = INPUTcaminhoPlanilha01;
    }

    /**
     * @return the OUTPUTcaminhoPlanilha01
     */
    public String getOUTPUTcaminhoPlanilha01() {
        return OUTPUTcaminhoPlanilha01;
    }

    /**
     * @param OUTPUTcaminhoPlanilha01 the OUTPUTcaminhoPlanilha01 to set
     */
    public void setOUTPUTcaminhoPlanilha01(String OUTPUTcaminhoPlanilha01) {
        this.OUTPUTcaminhoPlanilha01 = OUTPUTcaminhoPlanilha01;
    }

    /**
     * @return the INPUTcaminhoPlanilha02
     */
    public String getINPUTcaminhoPlanilha02() {
        return INPUTcaminhoPlanilha02;
    }

    /**
     * @param INPUTcaminhoPlanilha02 the INPUTcaminhoPlanilha02 to set
     */
    public void setINPUTcaminhoPlanilha02(String INPUTcaminhoPlanilha02) {
        this.INPUTcaminhoPlanilha02 = INPUTcaminhoPlanilha02;
    }

    /**
     * @return the OUTPUTcaminhoPlanilha02
     */
    public String getOUTPUTcaminhoPlanilha02() {
        return OUTPUTcaminhoPlanilha02;
    }

    /**
     * @param OUTPUTcaminhoPlanilha02 the OUTPUTcaminhoPlanilha02 to set
     */
    public void setOUTPUTcaminhoPlanilha02(String OUTPUTcaminhoPlanilha02) {
        this.OUTPUTcaminhoPlanilha02 = OUTPUTcaminhoPlanilha02;
    }

    /**
     * @return the OUTPUTplanilha03
     */
    public String getOUTPUTplanilha03() {
        return OUTPUTplanilha03;
    }

    /**
     * @param OUTPUTplanilha03 the OUTPUTplanilha03 to set
     */
    public void setOUTPUTplanilha03(String OUTPUTplanilha03) {
        this.OUTPUTplanilha03 = OUTPUTplanilha03;
    }

}

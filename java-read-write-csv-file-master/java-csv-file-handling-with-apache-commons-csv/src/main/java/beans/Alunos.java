/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author FelipeSSCA
 */
public class Alunos {

    /**
     * @return the VO2_MAX_DESEMPENHO_VALOR
     */
    public String getVO2_MAX_DESEMPENHO_VALOR() {
        return VO2_MAX_DESEMPENHO_VALOR;
    }

    /**
     * @param VO2_MAX_DESEMPENHO_VALOR the VO2_MAX_DESEMPENHO_VALOR to set
     */
    public void setVO2_MAX_DESEMPENHO_VALOR(String VO2_MAX_DESEMPENHO_VALOR) {
        this.VO2_MAX_DESEMPENHO_VALOR = VO2_MAX_DESEMPENHO_VALOR;
    }

    /**
     * @return the VO2_MAX_DESEMPENHO_RESULTADO
     */
    public String getVO2_MAX_DESEMPENHO_RESULTADO() {
        return VO2_MAX_DESEMPENHO_RESULTADO;
    }

    /**
     * @param VO2_MAX_DESEMPENHO_RESULTADO the VO2_MAX_DESEMPENHO_RESULTADO to set
     */
    public void setVO2_MAX_DESEMPENHO_RESULTADO(String VO2_MAX_DESEMPENHO_RESULTADO) {
        this.VO2_MAX_DESEMPENHO_RESULTADO = VO2_MAX_DESEMPENHO_RESULTADO;
    }

    private String matricula;
    private String nome;
    private String dtNascimento;
    private String genero;
    private String numeroOrdem;
    private String idade;
    private String deficienciaReportada;

    private String nAvaliacao;
    private String QUANTIDADE_TOTAL_TREINOS;
    private String QUANTIDADE_DE_TREINOS_POR_ALUNOS;
    private String QUANTIDADE_TOTAL_DE_TREINOS;
    private String QUANTIDADE_DE_VEZES_COM_UNIFORME;
    private String SERIE;
    private String TURMA;
    private String dtAvaliacao;
    private String participacaoTestes;

    //---desc classific
    private String PESO;
    private String ALTURA;
    private String IMC;
    private String IMC_Sem_2;

    private String indicadoresIMCSem_1;
    private String indicadoresIMCSem_2;

    private String Classificacao_IMC_POEST;

    private String CINTURA;
    private String Classificacao_RCE;
    private String Valor_Classificacao_RCE;

    private String ENVERGADURA;

    private String FLEXIBILIDADE;
    private String CLASSIFICACAO_FLEXIBILIDADE;
    private String VALOR_CLASSIFICACAO_FLEXIBILIDADE;

    private String ABDOMINAL;
    private String OBSERVACAO_ABDOMINAL;
    private String CLASSIFICACAO_ABDOMINAL;
    private String VALOR_CLASSIFICACAO_ABDOMINAL;

    private String SALTO;
    private String CLASSIFICACAO_SALTO;
    private String VALOR_CLASSIFICACAO_SALTO;

    private String MEDICINIBALL;
    private String CLASSIFICACAO_MEDICINIBALL;
    private String VALOR_CLASSIFICACAO_MEDICINIBALL;

    private String VELOCIDADE;
    private String CLASSIFICACAO_VELOCIDADE;
    private String VALOR_CLASSIFICACAO_VELOCIDADE;

    private String AGILIDADE;
    private String CLASSIFICACAO_AGILIDADE;
    private String VALOR_CLASSIFICACAO_AGILIDADE;

    private String CORRIDA_6_MIN;
    private String CLASSIFICACAO_6MIN;
    private String VALOR_CLASSIFICACAO_6MIN;
    private String CLASSIFICACAO_6MIN_SAUDE;

    private String VO2_VELOCIDADE_MEDIA_MS;
    private String CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS;
    private String VALOR_VO2_VELOCIDADE_MEDIA_MS;

    private String VO2_VELOCIDADE_MEDIA_KM;
    private String CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM;
    private String VALOR_VO2_VELOCIDADE_MEDIA_KM;

    private String VO2_MAX;
    private String CLASSFICACAO_VO2_MAX;
    private String VALOR_VO2_MAX;

    private String OBS1_CALCADO;
    private String OBS2_CAFE;
    private String OBS3_PERCEPCAO;
    private String OBS4_PERCEPCAO;
    private String OBS5_PERCEPCAO;
    private String OBS6_PERCEPCAO;
    private String OBS7_PERCEPCAO;

    //dados tabela 1 e 2 facilitar o comparativo 
    private String resultadoPeso;
    private String resultadoPorcentagemPeso;
    private String indicadoresPeso;

    private String resultadoAltura;
    private String resultadoPorcentagemAltura;
    private String indicadoresAltura;

    private String resultadoCintura;
    private String resultadoPorcentagemCintura;
    private String indicadoresCintura;

    private String resultadoEnvergadura;
    private String indicadoresEnvergadura;
    private String resultadoPorcentagemEnvergadura;

    private String resultadoFlex;
    private String indicadoresFlex;
    private String resultadoPorcentagemFlex;

    private String resultadoAbdomem;
    private String indicadoresAbdomem;
    private String resultadoPorcentagemAbdomem;

    private String resultadoSalto;
    private String indicadoresSalto;
    private String resultadoPorcentagemSalto;

    private String resultadoMedBall;
    private String indicadoresMedBall;
    private String resultadoPorcentagemMedBall;

    private String resultadoVerlocidade;
    private String indicadoresVerlocidade;
    private String resultadoPorcentagemVerlocidade;

    private String resultadoAgilidade;
    private String indicadoresAgilidade;
    private String resultadoPorcentagemAgilidade;

    private String resultadoCorrida;
    private String indicadoresCorrida;
    private String resultadoPorcentagemCorrida;

    private String resultadoCorrida_6;
    private String indicadoresCorrida_6;
    private String resultadoPorcentagemCorrida_6;

    private String indicadoresCorrida_6_saude;

    //---tabela 3 --// indicadores RCE
    private String indicadoresRCESemestre_1;
    private String indicadoresRCESemestre_2;

    //---IMC--diferencas IMC atual tabela 3 
    private String resultadoIMCTab3;
    private String indicadoresIMCTab3;
    private String resultadoPorcentagemIMCTab3;
    //---RCE--diferencas RCE atual tabela 3 

    private String resultadoRCEab3;
    private String indicadoresRCETab3;
    private String resultadoPorcentagemRCEab3;
    
    //-------------VO2--------------------
    
    private String resultadoV02Ms;
    private String indicadoresV02Ms;
    private String resultadoPorcentagemV02Ms;
    
    private String resultadoV02Km;
    private String indicadoresV02Km;
    private String resultadoPorcentagemV02Km;
    
    private String resultadoV02Max;
    private String indicadoresV02Max;
    private String resultadoPorcentagemV02Max;

    //voMs
    private String VO2_MS_COMP_1;
    private String VO2_MS_COMP_2;

    //VO2 KM
    private String VO2_KM_COMP_1;
    private String VO2_KM_COMP_2;

    //VO2 MAX
    private String VO2_MAX_COMP_1;
    private String VO2_MAX_COMP_2;
    
    //VO2 MAX DESEMPENHO 
    private String VO2_MAX_DESEMPENHO_VALOR;
    private String VO2_MAX_DESEMPENHO_RESULTADO;

    private String PESO_COMP_2;
    private String ALTURA_COMP_2;
    private String CINTURA_COMP2;
    private String Valor_Classificacao_RCE_comp_2;
    private String ENVERGADURA_COMP2;
    private String FLEXIBILIDADE_COMP2;
    private String ABDOMINAL_COMP2;
    private String SALTO_COMPE2;
    private String MEDICINIBALL_COMP2;
    private String VELOCIDADE_COMP2;
    private String AGILIDADE_COMP2;
    private String CORRIDA_6_MIN_COMP2;

    /**
     * @return the CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS
     */
    public String getCLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS() {
        return CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS;
    }

    /**
     * @param CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS the
     * CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS to set
     */
    public void setCLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS(String CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS) {
        this.CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS = CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_MS;
    }

    /**
     * @return the VALOR_VO2_VELOCIDADE_MEDIA_MS
     */
    public String getVALOR_VO2_VELOCIDADE_MEDIA_MS() {
        return VALOR_VO2_VELOCIDADE_MEDIA_MS;
    }

    /**
     * @param VALOR_VO2_VELOCIDADE_MEDIA_MS the VALOR_VO2_VELOCIDADE_MEDIA_MS to
     * set
     */
    public void setVALOR_VO2_VELOCIDADE_MEDIA_MS(String VALOR_VO2_VELOCIDADE_MEDIA_MS) {
        this.VALOR_VO2_VELOCIDADE_MEDIA_MS = VALOR_VO2_VELOCIDADE_MEDIA_MS;
    }

    /**
     * @return the CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM
     */
    public String getCLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM() {
        return CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM;
    }

    /**
     * @param CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM the
     * CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM to set
     */
    public void setCLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM(String CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM) {
        this.CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM = CLASSIFICACAO_VO2_VELOCIDADE_MEDIA_KM;
    }

    /**
     * @return the VALOR_VO2_VELOCIDADE_MEDIA_KM
     */
    public String getVALOR_VO2_VELOCIDADE_MEDIA_KM() {
        return VALOR_VO2_VELOCIDADE_MEDIA_KM;
    }

    /**
     * @param VALOR_VO2_VELOCIDADE_MEDIA_KM the VALOR_VO2_VELOCIDADE_MEDIA_KM to
     * set
     */
    public void setVALOR_VO2_VELOCIDADE_MEDIA_KM(String VALOR_VO2_VELOCIDADE_MEDIA_KM) {
        this.VALOR_VO2_VELOCIDADE_MEDIA_KM = VALOR_VO2_VELOCIDADE_MEDIA_KM;
    }

    /**
     * @return the CLASSFICACAO_VO2_MAX
     */
    public String getCLASSFICACAO_VO2_MAX() {
        return CLASSFICACAO_VO2_MAX;
    }

    /**
     * @param CLASSFICACAO_VO2_MAX the CLASSFICACAO_VO2_MAX to set
     */
    public void setCLASSFICACAO_VO2_MAX(String CLASSFICACAO_VO2_MAX) {
        this.CLASSFICACAO_VO2_MAX = CLASSFICACAO_VO2_MAX;
    }

    /**
     * @return the VALOR_VO2_MAX
     */
    public String getVALOR_VO2_MAX() {
        return VALOR_VO2_MAX;
    }

    /**
     * @param VALOR_VO2_MAX the VALOR_VO2_MAX to set
     */
    public void setVALOR_VO2_MAX(String VALOR_VO2_MAX) {
        this.VALOR_VO2_MAX = VALOR_VO2_MAX;
    }

    /**
     * @return the VO2_MS_COMP_1
     */
    public String getVO2_MS_COMP_1() {
        return VO2_MS_COMP_1;
    }

    /**
     * @param VO2_MS_COMP_1 the VO2_MS_COMP_1 to set
     */
    public void setVO2_MS_COMP_1(String VO2_MS_COMP_1) {
        this.VO2_MS_COMP_1 = VO2_MS_COMP_1;
    }

    /**
     * @return the VO2_MS_COMP_2
     */
    public String getVO2_MS_COMP_2() {
        return VO2_MS_COMP_2;
    }

    /**
     * @param VO2_MS_COMP_2 the VO2_MS_COMP_2 to set
     */
    public void setVO2_MS_COMP_2(String VO2_MS_COMP_2) {
        this.VO2_MS_COMP_2 = VO2_MS_COMP_2;
    }

    /**
     * @return the VO2_KM_COMP_1
     */
    public String getVO2_KM_COMP_1() {
        return VO2_KM_COMP_1;
    }

    /**
     * @param VO2_KM_COMP_1 the VO2_KM_COMP_1 to set
     */
    public void setVO2_KM_COMP_1(String VO2_KM_COMP_1) {
        this.VO2_KM_COMP_1 = VO2_KM_COMP_1;
    }

    /**
     * @return the VO2_KM_COMP_2
     */
    public String getVO2_KM_COMP_2() {
        return VO2_KM_COMP_2;
    }

    /**
     * @param VO2_KM_COMP_2 the VO2_KM_COMP_2 to set
     */
    public void setVO2_KM_COMP_2(String VO2_KM_COMP_2) {
        this.VO2_KM_COMP_2 = VO2_KM_COMP_2;
    }

    /**
     * @return the VO2_MAX_COMP_1
     */
    public String getVO2_MAX_COMP_1() {
        return VO2_MAX_COMP_1;
    }

    /**
     * @param VO2_MAX_COMP_1 the VO2_MAX_COMP_1 to set
     */
    public void setVO2_MAX_COMP_1(String VO2_MAX_COMP_1) {
        this.VO2_MAX_COMP_1 = VO2_MAX_COMP_1;
    }

    /**
     * @return the VO2_MAX_COMP_2
     */
    public String getVO2_MAX_COMP_2() {
        return VO2_MAX_COMP_2;
    }

    /**
     * @param VO2_MAX_COMP_2 the VO2_MAX_COMP_2 to set
     */
    public void setVO2_MAX_COMP_2(String VO2_MAX_COMP_2) {
        this.VO2_MAX_COMP_2 = VO2_MAX_COMP_2;
    }

    /**
     * @return the VO2_VELOCIDADE_MEDIA_MS
     */
    public String getVO2_VELOCIDADE_MEDIA_MS() {
        return VO2_VELOCIDADE_MEDIA_MS;
    }

    /**
     * @param VO2_VELOCIDADE_MEDIA_MS the VO2_VELOCIDADE_MEDIA_MS to set
     */
    public void setVO2_VELOCIDADE_MEDIA_MS(String VO2_VELOCIDADE_MEDIA_MS) {
        this.VO2_VELOCIDADE_MEDIA_MS = VO2_VELOCIDADE_MEDIA_MS;
    }

    /**
     * @return the VO2_VELOCIDADE_MEDIA_KM
     */
    public String getVO2_VELOCIDADE_MEDIA_KM() {
        return VO2_VELOCIDADE_MEDIA_KM;
    }

    /**
     * @param VO2_VELOCIDADE_MEDIA_KM the VO2_VELOCIDADE_MEDIA_KM to set
     */
    public void setVO2_VELOCIDADE_MEDIA_KM(String VO2_VELOCIDADE_MEDIA_KM) {
        this.VO2_VELOCIDADE_MEDIA_KM = VO2_VELOCIDADE_MEDIA_KM;
    }

    /**
     * @return the VO2_MAX
     */
    public String getVO2_MAX() {
        return VO2_MAX;
    }

    /**
     * @param VO2_MAX the VO2_MAX to set
     */
    public void setVO2_MAX(String VO2_MAX) {
        this.VO2_MAX = VO2_MAX;
    }

    /**
     * @return the indicadoresRCESemestre_1
     */
    public String getIndicadoresRCESemestre_1() {
        return indicadoresRCESemestre_1;
    }

    /**
     * @param indicadoresRCESemestre_1 the indicadoresRCESemestre_1 to set
     */
    public void setIndicadoresRCESemestre_1(String indicadoresRCESemestre_1) {
        this.indicadoresRCESemestre_1 = indicadoresRCESemestre_1;
    }

    /**
     * @return the indicadoresRCESemestre_2
     */
    public String getIndicadoresRCESemestre_2() {
        return indicadoresRCESemestre_2;
    }

    /**
     * @param indicadoresRCESemestre_2 the indicadoresRCESemestre_2 to set
     */
    public void setIndicadoresRCESemestre_2(String indicadoresRCESemestre_2) {
        this.indicadoresRCESemestre_2 = indicadoresRCESemestre_2;
    }

    /**
     * @return the Valor_Classificacao_RCE
     */
    public String getValor_Classificacao_RCE() {
        return Valor_Classificacao_RCE;
    }

    /**
     * @param Valor_Classificacao_RCE the Valor_Classificacao_RCE to set
     */
    public void setValor_Classificacao_RCE(String Valor_Classificacao_RCE) {
        this.Valor_Classificacao_RCE = Valor_Classificacao_RCE;
    }

    public String getCLASSIFICACAO_6MIN_SAUDE() {
        return CLASSIFICACAO_6MIN_SAUDE;
    }

    public void setCLASSIFICACAO_6MIN_SAUDE(String VALOR_CLASSIFICACAO_6MIN_SAUDE) {
        this.CLASSIFICACAO_6MIN_SAUDE = VALOR_CLASSIFICACAO_6MIN_SAUDE;
    }

    //resultado comp tabela
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dtNascimento
     */
    public String getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the numeroOrdem
     */
    public String getNumeroOrdem() {
        return numeroOrdem;
    }

    /**
     * @param numeroOrdem the numeroOrdem to set
     */
    public void setNumeroOrdem(String numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    /**
     * @return the nAvaliacao
     */
    public String getnAvaliacao() {
        return nAvaliacao;
    }

    /**
     * @param nAvaliacao the nAvaliacao to set
     */
    public void setnAvaliacao(String nAvaliacao) {
        this.nAvaliacao = nAvaliacao;
    }

    /**
     * @return the QUANTIDADE_TOTAL_TREINOS
     */
    public String getQUANTIDADE_TOTAL_TREINOS() {
        return QUANTIDADE_TOTAL_TREINOS;
    }

    /**
     * @param QUANTIDADE_TOTAL_TREINOS the QUANTIDADE_TOTAL_TREINOS to set
     */
    public void setQUANTIDADE_TOTAL_TREINOS(String QUANTIDADE_TOTAL_TREINOS) {
        this.QUANTIDADE_TOTAL_TREINOS = QUANTIDADE_TOTAL_TREINOS;
    }

    /**
     * @return the QUANTIDADE_DE_TREINOS_POR_ALUNOS
     */
    public String getQUANTIDADE_DE_TREINOS_POR_ALUNOS() {
        return QUANTIDADE_DE_TREINOS_POR_ALUNOS;
    }

    /**
     * @param QUANTIDADE_DE_TREINOS_POR_ALUNOS the
     * QUANTIDADE_DE_TREINOS_POR_ALUNOS to set
     */
    public void setQUANTIDADE_DE_TREINOS_POR_ALUNOS(String QUANTIDADE_DE_TREINOS_POR_ALUNOS) {
        this.QUANTIDADE_DE_TREINOS_POR_ALUNOS = QUANTIDADE_DE_TREINOS_POR_ALUNOS;
    }

    /**
     * @return the QUANTIDADE_TOTAL_DE_TREINOS
     */
    public String getQUANTIDADE_TOTAL_DE_TREINOS() {
        return QUANTIDADE_TOTAL_DE_TREINOS;
    }

    /**
     * @param QUANTIDADE_TOTAL_DE_TREINOS the QUANTIDADE_TOTAL_DE_TREINOS to set
     */
    public void setQUANTIDADE_TOTAL_DE_TREINOS(String QUANTIDADE_TOTAL_DE_TREINOS) {
        this.QUANTIDADE_TOTAL_DE_TREINOS = QUANTIDADE_TOTAL_DE_TREINOS;
    }

    /**
     * @return the QUANTIDADE_DE_VEZES_COM_UNIFORME
     */
    public String getQUANTIDADE_DE_VEZES_COM_UNIFORME() {
        return QUANTIDADE_DE_VEZES_COM_UNIFORME;
    }

    /**
     * @param QUANTIDADE_DE_VEZES_COM_UNIFORME the
     * QUANTIDADE_DE_VEZES_COM_UNIFORME to set
     */
    public void setQUANTIDADE_DE_VEZES_COM_UNIFORME(String QUANTIDADE_DE_VEZES_COM_UNIFORME) {
        this.QUANTIDADE_DE_VEZES_COM_UNIFORME = QUANTIDADE_DE_VEZES_COM_UNIFORME;
    }

    /**
     * @return the SERIE
     */
    public String getSERIE() {
        return SERIE;
    }

    /**
     * @param SERIE the SERIE to set
     */
    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    /**
     * @return the TURMA
     */
    public String getTURMA() {
        return TURMA;
    }

    /**
     * @param TURMA the TURMA to set
     */
    public void setTURMA(String TURMA) {
        this.TURMA = TURMA;
    }

    /**
     * @return the PESO
     */
    public String getPESO() {
        return PESO;
    }

    /**
     * @param PESO the PESO to set
     */
    public void setPESO(String PESO) {
        this.PESO = PESO;
    }

    /**
     * @return the ALTURA
     */
    public String getALTURA() {
        return ALTURA;
    }

    /**
     * @param ALTURA the ALTURA to set
     */
    public void setALTURA(String ALTURA) {
        this.ALTURA = ALTURA;
    }

    /**
     * @return the IMC
     */
    public String getIMC() {
        return IMC;
    }

    /**
     * @param IMC the IMC to set
     */
    public void setIMC(String IMC) {
        this.IMC = IMC;
    }

    /**
     * @return the Classificacao_IMC_POEST
     */
    public String getClassificacao_IMC_POEST() {
        return Classificacao_IMC_POEST;
    }

    /**
     * @param Classificacao_IMC_POEST the Classificacao_IMC_POEST to set
     */
    public void setClassificacao_IMC_POEST(String Classificacao_IMC_POEST) {
        this.Classificacao_IMC_POEST = Classificacao_IMC_POEST;
    }

    /**
     * @return the CINTURA
     */
    public String getCINTURA() {
        return CINTURA;
    }

    /**
     * @param CINTURA the CINTURA to set
     */
    public void setCINTURA(String CINTURA) {
        this.CINTURA = CINTURA;
    }

    /**
     * @return the Classificacao_RCE
     */
    public String getClassificacao_RCE() {
        return Classificacao_RCE;
    }

    /**
     * @param Classificacao_RCE the Classificacao_RCE to set
     */
    public void setClassificacao_RCE(String Classificacao_RCE) {
        this.Classificacao_RCE = Classificacao_RCE;
    }

    /**
     * @return the ENVERGADURA
     */
    public String getENVERGADURA() {
        return ENVERGADURA;
    }

    /**
     * @param ENVERGADURA the ENVERGADURA to set
     */
    public void setENVERGADURA(String ENVERGADURA) {
        this.ENVERGADURA = ENVERGADURA;
    }

    /**
     * @return the FLEXIBILIDADE
     */
    public String getFLEXIBILIDADE() {
        return FLEXIBILIDADE;
    }

    /**
     * @param FLEXIBILIDADE the FLEXIBILIDADE to set
     */
    public void setFLEXIBILIDADE(String FLEXIBILIDADE) {
        this.FLEXIBILIDADE = FLEXIBILIDADE;
    }

    /**
     * @return the CLASSIFICACAO_FLEXIBILIDADE
     */
    public String getCLASSIFICACAO_FLEXIBILIDADE() {
        return CLASSIFICACAO_FLEXIBILIDADE;
    }

    /**
     * @param CLASSIFICACAO_FLEXIBILIDADE the CLASSIFICACAO_FLEXIBILIDADE to set
     */
    public void setCLASSIFICACAO_FLEXIBILIDADE(String CLASSIFICACAO_FLEXIBILIDADE) {
        this.CLASSIFICACAO_FLEXIBILIDADE = CLASSIFICACAO_FLEXIBILIDADE;
    }

    /**
     * @return the ABDOMINAL
     */
    public String getABDOMINAL() {
        return ABDOMINAL;
    }

    /**
     * @param ABDOMINAL the ABDOMINAL to set
     */
    public void setABDOMINAL(String ABDOMINAL) {
        this.ABDOMINAL = ABDOMINAL;
    }

    /**
     * @return the OBSERVACAO_ABDOMINAL
     */
    public String getOBSERVACAO_ABDOMINAL() {
        return OBSERVACAO_ABDOMINAL;
    }

    /**
     * @param OBSERVACAO_ABDOMINAL the OBSERVACAO_ABDOMINAL to set
     */
    public void setOBSERVACAO_ABDOMINAL(String OBSERVACAO_ABDOMINAL) {
        this.OBSERVACAO_ABDOMINAL = OBSERVACAO_ABDOMINAL;
    }

    /**
     * @return the CLASSIFICACAO_ABDOMINAL
     */
    public String getCLASSIFICACAO_ABDOMINAL() {
        return CLASSIFICACAO_ABDOMINAL;
    }

    /**
     * @param CLASSIFICACAO_ABDOMINAL the CLASSIFICACAO_ABDOMINAL to set
     */
    public void setCLASSIFICACAO_ABDOMINAL(String CLASSIFICACAO_ABDOMINAL) {
        this.CLASSIFICACAO_ABDOMINAL = CLASSIFICACAO_ABDOMINAL;
    }

    /**
     * @return the SALTO
     */
    public String getSALTO() {
        return SALTO;
    }

    /**
     * @param SALTO the SALTO to set
     */
    public void setSALTO(String SALTO) {
        this.SALTO = SALTO;
    }

    /**
     * @return the CLASSIFICACAO_SALTO
     */
    public String getCLASSIFICACAO_SALTO() {
        return CLASSIFICACAO_SALTO;
    }

    /**
     * @param CLASSIFICACAO_SALTO the CLASSIFICACAO_SALTO to set
     */
    public void setCLASSIFICACAO_SALTO(String CLASSIFICACAO_SALTO) {
        this.CLASSIFICACAO_SALTO = CLASSIFICACAO_SALTO;
    }

    /**
     * @return the MEDICINIBALL
     */
    public String getMEDICINIBALL() {
        return MEDICINIBALL;
    }

    /**
     * @param MEDICINIBALL the MEDICINIBALL to set
     */
    public void setMEDICINIBALL(String MEDICINIBALL) {
        this.MEDICINIBALL = MEDICINIBALL;
    }

    /**
     * @return the CLASSIFICACAO_MEDICINIBALL
     */
    public String getCLASSIFICACAO_MEDICINIBALL() {
        return CLASSIFICACAO_MEDICINIBALL;
    }

    /**
     * @param CLASSIFICACAO_MEDICINIBALL the CLASSIFICACAO_MEDICINIBALL to set
     */
    public void setCLASSIFICACAO_MEDICINIBALL(String CLASSIFICACAO_MEDICINIBALL) {
        this.CLASSIFICACAO_MEDICINIBALL = CLASSIFICACAO_MEDICINIBALL;
    }

    /**
     * @return the VELOCIDADE
     */
    public String getVELOCIDADE() {
        return VELOCIDADE;
    }

    /**
     * @param VELOCIDADE the VELOCIDADE to set
     */
    public void setVELOCIDADE(String VELOCIDADE) {
        this.VELOCIDADE = VELOCIDADE;
    }

    /**
     * @return the CLASSIFICACAO_VELOCIDADE
     */
    public String getCLASSIFICACAO_VELOCIDADE() {
        return CLASSIFICACAO_VELOCIDADE;
    }

    /**
     * @param CLASSIFICACAO_VELOCIDADE the CLASSIFICACAO_VELOCIDADE to set
     */
    public void setCLASSIFICACAO_VELOCIDADE(String CLASSIFICACAO_VELOCIDADE) {
        this.CLASSIFICACAO_VELOCIDADE = CLASSIFICACAO_VELOCIDADE;
    }

    /**
     * @return the AGILIDADE
     */
    public String getAGILIDADE() {
        return AGILIDADE;
    }

    /**
     * @param AGILIDADE the AGILIDADE to set
     */
    public void setAGILIDADE(String AGILIDADE) {
        this.AGILIDADE = AGILIDADE;
    }

    /**
     * @return the CLASSIFICACAO_AGILIDADE
     */
    public String getCLASSIFICACAO_AGILIDADE() {
        return CLASSIFICACAO_AGILIDADE;
    }

    /**
     * @param CLASSIFICACAO_AGILIDADE the CLASSIFICACAO_AGILIDADE to set
     */
    public void setCLASSIFICACAO_AGILIDADE(String CLASSIFICACAO_AGILIDADE) {
        this.CLASSIFICACAO_AGILIDADE = CLASSIFICACAO_AGILIDADE;
    }

    /**
     * @return the CORRIDA_6_MIN
     */
    public String getCORRIDA_6_MIN() {
        return CORRIDA_6_MIN;
    }

    /**
     * @param CORRIDA_6_MIN the CORRIDA_6_MIN to set
     */
    public void setCORRIDA_6_MIN(String CORRIDA_6_MIN) {
        this.CORRIDA_6_MIN = CORRIDA_6_MIN;
    }

    /**
     * @return the CLASSIFICACAO_6MIN
     */
    public String getCLASSIFICACAO_6MIN() {
        return CLASSIFICACAO_6MIN;
    }

    /**
     * @param CLASSIFICACAO_6MIN the CLASSIFICACAO_6MIN to set
     */
    public void setCLASSIFICACAO_6MIN(String CLASSIFICACAO_6MIN) {
        this.CLASSIFICACAO_6MIN = CLASSIFICACAO_6MIN;
    }

    /**
     * @return the OBS1_CALCADO
     */
    public String getOBS1_CALCADO() {
        return OBS1_CALCADO;
    }

    /**
     * @param OBS1_CALCADO the OBS1_CALCADO to set
     */
    public void setOBS1_CALCADO(String OBS1_CALCADO) {
        this.OBS1_CALCADO = OBS1_CALCADO;
    }

    /**
     * @return the OBS2_CAFE
     */
    public String getOBS2_CAFE() {
        return OBS2_CAFE;
    }

    /**
     * @param OBS2_CAFE the OBS2_CAFE to set
     */
    public void setOBS2_CAFÉ(String OBS2_CAFE) {
        this.setOBS2_CAFE(OBS2_CAFE);
    }

    /**
     * @return the OBS3_PERCEPCAO
     */
    public String getOBS3_PERCEPCAO() {
        return OBS3_PERCEPCAO;
    }

    /**
     * @param OBS3_PERCEPCAO the OBS3_PERCEPCAO to set
     */
    public void setOBS3_PERCEPCAO(String OBS3_PERCEPCAO) {
        this.OBS3_PERCEPCAO = OBS3_PERCEPCAO;
    }

    /**
     * @return the OBS4_PERCEPCAO
     */
    public String getOBS4_PERCEPCAO() {
        return OBS4_PERCEPCAO;
    }

    /**
     * @param OBS4_PERCEPCAO the OBS4_PERCEPCAO to set
     */
    public void setOBS4_PERCEPCAO(String OBS4_PERCEPCAO) {
        this.OBS4_PERCEPCAO = OBS4_PERCEPCAO;
    }

    /**
     * @return the OBS5_PERCEPCAO
     */
    public String getOBS5_PERCEPCAO() {
        return OBS5_PERCEPCAO;
    }

    /**
     * @param OBS5_PERCEPCAO the OBS5_PERCEPCAO to set
     */
    public void setOBS5_PERCEPCAO(String OBS5_PERCEPCAO) {
        this.OBS5_PERCEPCAO = OBS5_PERCEPCAO;
    }

    /**
     * @return the OBS6_PERCEPCAO
     */
    public String getOBS6_PERCEPCAO() {
        return OBS6_PERCEPCAO;
    }

    /**
     * @param OBS6_PERCEPCAO the OBS6_PERCEPCAO to set
     */
    public void setOBS6_PERCEPCAO(String OBS6_PERCEPCAO) {
        this.OBS6_PERCEPCAO = OBS6_PERCEPCAO;
    }

    /**
     * @return the OBS7_PERCEPCAO
     */
    public String getOBS7_PERCEPCAO() {
        return OBS7_PERCEPCAO;
    }

    /**
     * @param OBS7_PERCEPCAO the OBS7_PERCEPCAO to set
     */
    public void setOBS7_PERCEPCAO(String OBS7_PERCEPCAO) {
        this.OBS7_PERCEPCAO = OBS7_PERCEPCAO;
    }

    /**
     * @return the dtAvaliacao
     */
    public String getDtAvaliacao() {
        return dtAvaliacao;
    }

    /**
     * @param dtAvaliacao the dtAvaliacao to set
     */
    public void setDtAvaliacao(String dtAvaliacao) {
        this.dtAvaliacao = dtAvaliacao;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_FLEXIBILIDADE
     */
    public String getVALOR_CLASSIFICACAO_FLEXIBILIDADE() {
        return VALOR_CLASSIFICACAO_FLEXIBILIDADE;
    }

    /**
     * @param VALOR_CLASSIFICACAO_FLEXIBILIDADE the
     * VALOR_CLASSIFICACAO_FLEXIBILIDADE to set
     */
    public void setVALOR_CLASSIFICACAO_FLEXIBILIDADE(String VALOR_CLASSIFICACAO_FLEXIBILIDADE) {
        this.VALOR_CLASSIFICACAO_FLEXIBILIDADE = VALOR_CLASSIFICACAO_FLEXIBILIDADE;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_ABDOMINAL
     */
    public String getVALOR_CLASSIFICACAO_ABDOMINAL() {
        return VALOR_CLASSIFICACAO_ABDOMINAL;
    }

    /**
     * @param VALOR_CLASSIFICACAO_ABDOMINAL the VALOR_CLASSIFICACAO_ABDOMINAL to
     * set
     */
    public void setVALOR_CLASSIFICACAO_ABDOMINAL(String VALOR_CLASSIFICACAO_ABDOMINAL) {
        this.VALOR_CLASSIFICACAO_ABDOMINAL = VALOR_CLASSIFICACAO_ABDOMINAL;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_SALTO
     */
    public String getVALOR_CLASSIFICACAO_SALTO() {
        return VALOR_CLASSIFICACAO_SALTO;
    }

    /**
     * @param VALOR_CLASSIFICACAO_SALTO the VALOR_CLASSIFICACAO_SALTO to set
     */
    public void setVALOR_CLASSIFICACAO_SALTO(String VALOR_CLASSIFICACAO_SALTO) {
        this.VALOR_CLASSIFICACAO_SALTO = VALOR_CLASSIFICACAO_SALTO;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_MEDICINIBALL
     */
    public String getVALOR_CLASSIFICACAO_MEDICINIBALL() {
        return VALOR_CLASSIFICACAO_MEDICINIBALL;
    }

    /**
     * @param VALOR_CLASSIFICACAO_MEDICINIBALL the
     * VALOR_CLASSIFICACAO_MEDICINIBALL to set
     */
    public void setVALOR_CLASSIFICACAO_MEDICINIBALL(String VALOR_CLASSIFICACAO_MEDICINIBALL) {
        this.VALOR_CLASSIFICACAO_MEDICINIBALL = VALOR_CLASSIFICACAO_MEDICINIBALL;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_VELOCIDADE
     */
    public String getVALOR_CLASSIFICACAO_VELOCIDADE() {
        return VALOR_CLASSIFICACAO_VELOCIDADE;
    }

    /**
     * @param VALOR_CLASSIFICACAO_VELOCIDADE the VALOR_CLASSIFICACAO_VELOCIDADE
     * to set
     */
    public void setVALOR_CLASSIFICACAO_VELOCIDADE(String VALOR_CLASSIFICACAO_VELOCIDADE) {
        this.VALOR_CLASSIFICACAO_VELOCIDADE = VALOR_CLASSIFICACAO_VELOCIDADE;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_AGILIDADE
     */
    public String getVALOR_CLASSIFICACAO_AGILIDADE() {
        return VALOR_CLASSIFICACAO_AGILIDADE;
    }

    /**
     * @param VALOR_CLASSIFICACAO_AGILIDADE the VALOR_CLASSIFICACAO_AGILIDADE to
     * set
     */
    public void setVALOR_CLASSIFICACAO_AGILIDADE(String VALOR_CLASSIFICACAO_AGILIDADE) {
        this.VALOR_CLASSIFICACAO_AGILIDADE = VALOR_CLASSIFICACAO_AGILIDADE;
    }

    /**
     * @return the VALOR_CLASSIFICACAO_6MIN
     */
    public String getVALOR_CLASSIFICACAO_6MIN() {
        return VALOR_CLASSIFICACAO_6MIN;
    }

    /**
     * @param VALOR_CLASSIFICACAO_6MIN the VALOR_CLASSIFICACAO_6MIN to set
     */
    public void setVALOR_CLASSIFICACAO_6MIN(String VALOR_CLASSIFICACAO_6MIN) {
        this.VALOR_CLASSIFICACAO_6MIN = VALOR_CLASSIFICACAO_6MIN;
    }

    /**
     * @param OBS2_CAFE the OBS2_CAFE to set
     */
    public void setOBS2_CAFE(String OBS2_CAFE) {
        this.OBS2_CAFE = OBS2_CAFE;
    }

    /**
     * @return the resultadoPeso
     */
    public String getResultadoPeso() {
        return resultadoPeso;
    }

    /**
     * @param resultadoPeso the resultadoPeso to set
     */
    public void setResultadoPeso(String resultadoPeso) {
        this.resultadoPeso = resultadoPeso;
    }

    /**
     * @return the resultadoAltura
     */
    public String getResultadoAltura() {
        return resultadoAltura;
    }

    /**
     * @param resultadoAltura the resultadoAltura to set
     */
    public void setResultadoAltura(String resultadoAltura) {
        this.resultadoAltura = resultadoAltura;
    }

    /**
     * @return the resultadoCintura
     */
    public String getResultadoCintura() {
        return resultadoCintura;
    }

    /**
     * @param resultadoCintura the resultadoCintura to set
     */
    public void setResultadoCintura(String resultadoCintura) {
        this.resultadoCintura = resultadoCintura;
    }

    /**
     * @return the resultadoEnvergadura
     */
    public String getResultadoEnvergadura() {
        return resultadoEnvergadura;
    }

    /**
     * @param resultadoEnvergadura the resultadoEnvergadura to set
     */
    public void setResultadoEnvergadura(String resultadoEnvergadura) {
        this.resultadoEnvergadura = resultadoEnvergadura;
    }

    /**
     * @return the PESO_COMP_2
     */
    public String getPESO_COMP_2() {
        return PESO_COMP_2;
    }

    /**
     * @param PESO_COMP_2 the PESO_COMP_2 to set
     */
    public void setPESO_COMP_2(String PESO_COMP_2) {
        this.PESO_COMP_2 = PESO_COMP_2;
    }

    /**
     * @return the ALTURA_COMP_2
     */
    public String getALTURA_COMP_2() {
        return ALTURA_COMP_2;
    }

    /**
     * @param ALTURA_COMP_2 the ALTURA_COMP_2 to set
     */
    public void setALTURA_COMP_2(String ALTURA_COMP_2) {
        this.ALTURA_COMP_2 = ALTURA_COMP_2;
    }

    /**
     * @return the CINTURA_COMP2
     */
    public String getCINTURA_COMP2() {
        return CINTURA_COMP2;
    }

    /**
     * @param CINTURA_COMP2 the CINTURA_COMP2 to set
     */
    public void setCINTURA_COMP2(String CINTURA_COMP2) {
        this.CINTURA_COMP2 = CINTURA_COMP2;
    }

    /**
     * @return the ENVERGADURA_COMP2
     */
    public String getENVERGADURA_COMP2() {
        return ENVERGADURA_COMP2;
    }

    /**
     * @param ENVERGADURA_COMP2 the ENVERGADURA_COMP2 to set
     */
    public void setENVERGADURA_COMP2(String ENVERGADURA_COMP2) {
        this.ENVERGADURA_COMP2 = ENVERGADURA_COMP2;
    }

    /**
     * @return the FLEXIBILIDADE_COMP2
     */
    public String getFLEXIBILIDADE_COMP2() {
        return FLEXIBILIDADE_COMP2;
    }

    /**
     * @param FLEXIBILIDADE_COMP2 the FLEXIBILIDADE_COMP2 to set
     */
    public void setFLEXIBILIDADE_COMP2(String FLEXIBILIDADE_COMP2) {
        this.FLEXIBILIDADE_COMP2 = FLEXIBILIDADE_COMP2;
    }

    /**
     * @return the ABDOMINAL_COMP2
     */
    public String getABDOMINAL_COMP2() {
        return ABDOMINAL_COMP2;
    }

    /**
     * @param ABDOMINAL_COMP2 the ABDOMINAL_COMP2 to set
     */
    public void setABDOMINAL_COMP2(String ABDOMINAL_COMP2) {
        this.ABDOMINAL_COMP2 = ABDOMINAL_COMP2;
    }

    /**
     * @return the SALTO_COMPE2
     */
    public String getSALTO_COMPE2() {
        return SALTO_COMPE2;
    }

    /**
     * @param SALTO_COMPE2 the SALTO_COMPE2 to set
     */
    public void setSALTO_COMPE2(String SALTO_COMPE2) {
        this.SALTO_COMPE2 = SALTO_COMPE2;
    }

    /**
     * @return the MEDICINIBALL_COMP2
     */
    public String getMEDICINIBALL_COMP2() {
        return MEDICINIBALL_COMP2;
    }

    /**
     * @param MEDICINIBALL_COMP2 the MEDICINIBALL_COMP2 to set
     */
    public void setMEDICINIBALL_COMP2(String MEDICINIBALL_COMP2) {
        this.MEDICINIBALL_COMP2 = MEDICINIBALL_COMP2;
    }

    /**
     * @return the VELOCIDADE_COMP2
     */
    public String getVELOCIDADE_COMP2() {
        return VELOCIDADE_COMP2;
    }

    /**
     * @param VELOCIDADE_COMP2 the VELOCIDADE_COMP2 to set
     */
    public void setVELOCIDADE_COMP2(String VELOCIDADE_COMP2) {
        this.VELOCIDADE_COMP2 = VELOCIDADE_COMP2;
    }

    /**
     * @return the AGILIDADE_COMP2
     */
    public String getAGILIDADE_COMP2() {
        return AGILIDADE_COMP2;
    }

    /**
     * @param AGILIDADE_COMP2 the AGILIDADE_COMP2 to set
     */
    public void setAGILIDADE_COMP2(String AGILIDADE_COMP2) {
        this.AGILIDADE_COMP2 = AGILIDADE_COMP2;
    }

    /**
     * @return the CORRIDA_6_MIN_COMP2
     */
    public String getCORRIDA_6_MIN_COMP2() {
        return CORRIDA_6_MIN_COMP2;
    }

    /**
     * @param CORRIDA_6_MIN_COMP2 the CORRIDA_6_MIN_COMP2 to set
     */
    public void setCORRIDA_6_MIN_COMP2(String CORRIDA_6_MIN_COMP2) {
        this.CORRIDA_6_MIN_COMP2 = CORRIDA_6_MIN_COMP2;
    }

    /**
     * @return the resultadoPorcentagemPeso
     */
    public String getResultadoPorcentagemPeso() {
        return resultadoPorcentagemPeso;
    }

    /**
     * @param resultadoPorcentagemPeso the resultadoPorcentagemPeso to set
     */
    public void setResultadoPorcentagemPeso(String resultadoPorcentagemPeso) {
        this.resultadoPorcentagemPeso = resultadoPorcentagemPeso;
    }

    /**
     * @return the indicadoresPeso
     */
    public String getIndicadoresPeso() {
        return indicadoresPeso;
    }

    /**
     * @param indicadoresPeso the indicadoresPeso to set
     */
    public void setIndicadoresPeso(String indicadoresPeso) {
        this.indicadoresPeso = indicadoresPeso;
    }

    /**
     * @return the resultadoPorcentagemAltura
     */
    public String getResultadoPorcentagemAltura() {
        return resultadoPorcentagemAltura;
    }

    /**
     * @param resultadoPorcentagemAltura the resultadoPorcentagemAltura to set
     */
    public void setResultadoPorcentagemAltura(String resultadoPorcentagemAltura) {
        this.resultadoPorcentagemAltura = resultadoPorcentagemAltura;
    }

    /**
     * @return the indicadoresAltura
     */
    public String getIndicadoresAltura() {
        return indicadoresAltura;
    }

    /**
     * @param indicadoresAltura the indicadoresAltura to set
     */
    public void setIndicadoresAltura(String indicadoresAltura) {
        this.indicadoresAltura = indicadoresAltura;
    }

    /**
     * @return the resultadoPorcentagemCintura
     */
    public String getResultadoPorcentagemCintura() {
        return resultadoPorcentagemCintura;
    }

    /**
     * @param resultadoPorcentagemCintura the resultadoPorcentagemCintura to set
     */
    public void setResultadoPorcentagemCintura(String resultadoPorcentagemCintura) {
        this.resultadoPorcentagemCintura = resultadoPorcentagemCintura;
    }

    /**
     * @return the indicadoresCintura
     */
    public String getIndicadoresCintura() {
        return indicadoresCintura;
    }

    /**
     * @param indicadoresCintura the indicadoresCintura to set
     */
    public void setIndicadoresCintura(String indicadoresCintura) {
        this.indicadoresCintura = indicadoresCintura;
    }

    /**
     * @return the indicadoresEnvergadura
     */
    public String getIndicadoresEnvergadura() {
        return indicadoresEnvergadura;
    }

    /**
     * @param indicadoresEnvergadura the indicadoresEnvergadura to set
     */
    public void setIndicadoresEnvergadura(String indicadoresEnvergadura) {
        this.indicadoresEnvergadura = indicadoresEnvergadura;
    }

    /**
     * @return the resultadoPorcentagemEnvergadura
     */
    public String getResultadoPorcentagemEnvergadura() {
        return resultadoPorcentagemEnvergadura;
    }

    /**
     * @param resultadoPorcentagemEnvergadura the
     * resultadoPorcentagemEnvergadura to set
     */
    public void setResultadoPorcentagemEnvergadura(String resultadoPorcentagemEnvergadura) {
        this.resultadoPorcentagemEnvergadura = resultadoPorcentagemEnvergadura;
    }

    /**
     * @return the resultadoFlex
     */
    public String getResultadoFlex() {
        return resultadoFlex;
    }

    /**
     * @param resultadoFlex the resultadoFlex to set
     */
    public void setResultadoFlex(String resultadoFlex) {
        this.resultadoFlex = resultadoFlex;
    }

    /**
     * @return the indicadoresFlex
     */
    public String getIndicadoresFlex() {
        return indicadoresFlex;
    }

    /**
     * @param indicadoresFlex the indicadoresFlex to set
     */
    public void setIndicadoresFlex(String indicadoresFlex) {
        this.indicadoresFlex = indicadoresFlex;
    }

    /**
     * @return the resultadoPorcentagemFlex
     */
    public String getResultadoPorcentagemFlex() {
        return resultadoPorcentagemFlex;
    }

    /**
     * @param resultadoPorcentagemFlex the resultadoPorcentagemFlex to set
     */
    public void setResultadoPorcentagemFlex(String resultadoPorcentagemFlex) {
        this.resultadoPorcentagemFlex = resultadoPorcentagemFlex;
    }

    /**
     * @return the resultadoAbdomem
     */
    public String getResultadoAbdomem() {
        return resultadoAbdomem;
    }

    /**
     * @param resultadoAbdomem the resultadoAbdomem to set
     */
    public void setResultadoAbdomem(String resultadoAbdomem) {
        this.resultadoAbdomem = resultadoAbdomem;
    }

    /**
     * @return the indicadoresAbdomem
     */
    public String getIndicadoresAbdomem() {
        return indicadoresAbdomem;
    }

    /**
     * @param indicadoresAbdomem the indicadoresAbdomem to set
     */
    public void setIndicadoresAbdomem(String indicadoresAbdomem) {
        this.indicadoresAbdomem = indicadoresAbdomem;
    }

    /**
     * @return the resultadoPorcentagemAbdomem
     */
    public String getResultadoPorcentagemAbdomem() {
        return resultadoPorcentagemAbdomem;
    }

    /**
     * @param resultadoPorcentagemAbdomem the resultadoPorcentagemAbdomem to set
     */
    public void setResultadoPorcentagemAbdomem(String resultadoPorcentagemAbdomem) {
        this.resultadoPorcentagemAbdomem = resultadoPorcentagemAbdomem;
    }

    /**
     * @return the resultadoSalto
     */
    public String getResultadoSalto() {
        return resultadoSalto;
    }

    /**
     * @param resultadoSalto the resultadoSalto to set
     */
    public void setResultadoSalto(String resultadoSalto) {
        this.resultadoSalto = resultadoSalto;
    }

    /**
     * @return the indicadoresSalto
     */
    public String getIndicadoresSalto() {
        return indicadoresSalto;
    }

    /**
     * @param indicadoresSalto the indicadoresSalto to set
     */
    public void setIndicadoresSalto(String indicadoresSalto) {
        this.indicadoresSalto = indicadoresSalto;
    }

    /**
     * @return the resultadoPorcentagemSalto
     */
    public String getResultadoPorcentagemSalto() {
        return resultadoPorcentagemSalto;
    }

    /**
     * @param resultadoPorcentagemSalto the resultadoPorcentagemSalto to set
     */
    public void setResultadoPorcentagemSalto(String resultadoPorcentagemSalto) {
        this.resultadoPorcentagemSalto = resultadoPorcentagemSalto;
    }

    /**
     * @return the resultadoMedBall
     */
    public String getResultadoMedBall() {
        return resultadoMedBall;
    }

    /**
     * @param resultadoMedBall the resultadoMedBall to set
     */
    public void setResultadoMedBall(String resultadoMedBall) {
        this.resultadoMedBall = resultadoMedBall;
    }

    /**
     * @return the indicadoresMedBall
     */
    public String getIndicadoresMedBall() {
        return indicadoresMedBall;
    }

    /**
     * @param indicadoresMedBall the indicadoresMedBall to set
     */
    public void setIndicadoresMedBall(String indicadoresMedBall) {
        this.indicadoresMedBall = indicadoresMedBall;
    }

    /**
     * @return the resultadoPorcentagemMedBall
     */
    public String getResultadoPorcentagemMedBall() {
        return resultadoPorcentagemMedBall;
    }

    /**
     * @param resultadoPorcentagemMedBall the resultadoPorcentagemMedBall to set
     */
    public void setResultadoPorcentagemMedBall(String resultadoPorcentagemMedBall) {
        this.resultadoPorcentagemMedBall = resultadoPorcentagemMedBall;
    }

    /**
     * @return the resultadoVerlocidade
     */
    public String getResultadoVerlocidade() {
        return resultadoVerlocidade;
    }

    /**
     * @param resultadoVerlocidade the resultadoVerlocidade to set
     */
    public void setResultadoVerlocidade(String resultadoVerlocidade) {
        this.resultadoVerlocidade = resultadoVerlocidade;
    }

    /**
     * @return the indicadoresVerlocidade
     */
    public String getIndicadoresVerlocidade() {
        return indicadoresVerlocidade;
    }

    /**
     * @param indicadoresVerlocidade the indicadoresVerlocidade to set
     */
    public void setIndicadoresVerlocidade(String indicadoresVerlocidade) {
        this.indicadoresVerlocidade = indicadoresVerlocidade;
    }

    /**
     * @return the resultadoPorcentagemVerlocidade
     */
    public String getResultadoPorcentagemVerlocidade() {
        return resultadoPorcentagemVerlocidade;
    }

    /**
     * @param resultadoPorcentagemVerlocidade the
     * resultadoPorcentagemVerlocidade to set
     */
    public void setResultadoPorcentagemVerlocidade(String resultadoPorcentagemVerlocidade) {
        this.resultadoPorcentagemVerlocidade = resultadoPorcentagemVerlocidade;
    }

    /**
     * @return the resultadoAgilidade
     */
    public String getResultadoAgilidade() {
        return resultadoAgilidade;
    }

    /**
     * @param resultadoAgilidade the resultadoAgilidade to set
     */
    public void setResultadoAgilidade(String resultadoAgilidade) {
        this.resultadoAgilidade = resultadoAgilidade;
    }

    /**
     * @return the indicadoresAgilidade
     */
    public String getIndicadoresAgilidade() {
        return indicadoresAgilidade;
    }

    /**
     * @param indicadoresAgilidade the indicadoresAgilidade to set
     */
    public void setIndicadoresAgilidade(String indicadoresAgilidade) {
        this.indicadoresAgilidade = indicadoresAgilidade;
    }

    /**
     * @return the resultadoPorcentagemAgilidade
     */
    public String getResultadoPorcentagemAgilidade() {
        return resultadoPorcentagemAgilidade;
    }

    /**
     * @param resultadoPorcentagemAgilidade the resultadoPorcentagemAgilidade to
     * set
     */
    public void setResultadoPorcentagemAgilidade(String resultadoPorcentagemAgilidade) {
        this.resultadoPorcentagemAgilidade = resultadoPorcentagemAgilidade;
    }

    /**
     * @return the resultadoCorrida
     */
    public String getResultadoCorrida() {
        return resultadoCorrida;
    }

    /**
     * @param resultadoCorrida the resultadoCorrida to set
     */
    public void setResultadoCorrida(String resultadoCorrida) {
        this.resultadoCorrida = resultadoCorrida;
    }

    /**
     * @return the indicadoresCorrida
     */
    public String getIndicadoresCorrida() {
        return indicadoresCorrida;
    }

    /**
     * @param indicadoresCorrida the indicadoresCorrida to set
     */
    public void setIndicadoresCorrida(String indicadoresCorrida) {
        this.indicadoresCorrida = indicadoresCorrida;
    }

    /**
     * @return the resultadoPorcentagemCorrida
     */
    public String getResultadoPorcentagemCorrida() {
        return resultadoPorcentagemCorrida;
    }

    /**
     * @param resultadoPorcentagemCorrida the resultadoPorcentagemCorrida to set
     */
    public void setResultadoPorcentagemCorrida(String resultadoPorcentagemCorrida) {
        this.resultadoPorcentagemCorrida = resultadoPorcentagemCorrida;
    }

    /**
     * @return the resultadoCorrida_6
     */
    public String getResultadoCorrida_6() {
        return resultadoCorrida_6;
    }

    /**
     * @param resultadoCorrida_6 the resultadoCorrida_6 to set
     */
    public void setResultadoCorrida_6(String resultadoCorrida_6) {
        this.resultadoCorrida_6 = resultadoCorrida_6;
    }

    /**
     * @return the indicadoresCorrida_6
     */
    public String getIndicadoresCorrida_6() {
        return indicadoresCorrida_6;
    }

    /**
     * @param indicadoresCorrida_6 the indicadoresCorrida_6 to set
     */
    public void setIndicadoresCorrida_6(String indicadoresCorrida_6) {
        this.indicadoresCorrida_6 = indicadoresCorrida_6;
    }

    /**
     * @return the resultadoPorcentagemCorrida_6
     */
    public String getResultadoPorcentagemCorrida_6() {
        return resultadoPorcentagemCorrida_6;
    }

    /**
     * @param resultadoPorcentagemCorrida_6 the resultadoPorcentagemCorrida_6 to
     * set
     */
    public void setResultadoPorcentagemCorrida_6(String resultadoPorcentagemCorrida_6) {
        this.resultadoPorcentagemCorrida_6 = resultadoPorcentagemCorrida_6;
    }

    /**
     * @return the RCE_COMP2
     */
    public String getValor_Classificacao_RCE_comp_2() {
        return Valor_Classificacao_RCE_comp_2;
    }

    /**
     * @param RCE_COMP2 the RCE_COMP2 to set
     */
    public void setValor_Classificacao_RCE_comp_2(String RCE_COMP2) {
        this.Valor_Classificacao_RCE_comp_2 = RCE_COMP2;
    }

    /**
     * @return the IMC_Sem_2
     */
    public String getIMC_Sem_2() {
        return IMC_Sem_2;
    }

    /**
     * @param IMC_Sem_2 the IMC_Sem_2 to set
     */
    public void setIMC_Sem_2(String IMC_Sem_2) {
        this.IMC_Sem_2 = IMC_Sem_2;
    }

    /**
     * @return the indicadoresIMCSem_1
     */
    public String getIndicadoresIMCSem_1() {
        return indicadoresIMCSem_1;
    }

    /**
     * @param indicadoresIMCSem_1 the indicadoresIMCSem_1 to set
     */
    public void setIndicadoresIMCSem_1(String indicadoresIMCSem_1) {
        this.indicadoresIMCSem_1 = indicadoresIMCSem_1;
    }

    /**
     * @return the indicadoresIMCSem_2
     */
    public String getIndicadoresIMCSem_2() {
        return indicadoresIMCSem_2;
    }

    /**
     * @param indicadoresIMCSem_2 the indicadoresIMCSem_2 to set
     */
    public void setIndicadoresIMCSem_2(String indicadoresIMCSem_2) {
        this.indicadoresIMCSem_2 = indicadoresIMCSem_2;
    }

    /**
     * @return the indicadoresCorrida_6_saude
     */
    public String getIndicadoresCorrida_6_saude() {
        return indicadoresCorrida_6_saude;
    }

    /**
     * @param indicadoresCorrida_6_saude the indicadoresCorrida_6_saude to set
     */
    public void setIndicadoresCorrida_6_saude(String indicadoresCorrida_6_saude) {
        this.indicadoresCorrida_6_saude = indicadoresCorrida_6_saude;
    }

    /**
     * @return the resultadoIMCTab3
     */
    public String getResultadoIMCTab3() {
        return resultadoIMCTab3;
    }

    /**
     * @param resultadoIMCTab3 the resultadoIMCTab3 to set
     */
    public void setResultadoIMCTab3(String resultadoIMCTab3) {
        this.resultadoIMCTab3 = resultadoIMCTab3;
    }

    /**
     * @return the indicadoresIMCTab3
     */
    public String getIndicadoresIMCTab3() {
        return indicadoresIMCTab3;
    }

    /**
     * @param indicadoresIMCTab3 the indicadoresIMCTab3 to set
     */
    public void setIndicadoresIMCTab3(String indicadoresIMCTab3) {
        this.indicadoresIMCTab3 = indicadoresIMCTab3;
    }

    /**
     * @return the resultadoPorcentagemIMCTab3
     */
    public String getResultadoPorcentagemIMCTab3() {
        return resultadoPorcentagemIMCTab3;
    }

    /**
     * @param resultadoPorcentagemIMCTab3 the resultadoPorcentagemIMCTab3 to set
     */
    public void setResultadoPorcentagemIMCTab3(String resultadoPorcentagemIMCTab3) {
        this.resultadoPorcentagemIMCTab3 = resultadoPorcentagemIMCTab3;
    }

    /**
     * @return the resultadoRCEab3
     */
    public String getResultadoRCEab3() {
        return resultadoRCEab3;
    }

    /**
     * @param resultadoRCEab3 the resultadoRCEab3 to set
     */
    public void setResultadoRCEab3(String resultadoRCEab3) {
        this.resultadoRCEab3 = resultadoRCEab3;
    }

    /**
     * @return the indicadoresRCETab3
     */
    public String getIndicadoresRCETab3() {
        return indicadoresRCETab3;
    }

    /**
     * @param indicadoresRCETab3 the indicadoresRCETab3 to set
     */
    public void setIndicadoresRCETab3(String indicadoresRCETab3) {
        this.indicadoresRCETab3 = indicadoresRCETab3;
    }

    /**
     * @return the resultadoPorcentagemRCEab3
     */
    public String getResultadoPorcentagemRCEab3() {
        return resultadoPorcentagemRCEab3;
    }

    /**
     * @param resultadoPorcentagemRCEab3 the resultadoPorcentagemRCEab3 to set
     */
    public void setResultadoPorcentagemRCEab3(String resultadoPorcentagemRCEab3) {
        this.resultadoPorcentagemRCEab3 = resultadoPorcentagemRCEab3;
    }

    /**
     * @return the deficienciaReportada
     */
    public String getDeficienciaReportada() {
        return deficienciaReportada;
    }

    /**
     * @param deficienciaReportada the deficienciaReportada to set
     */
    public void setDeficienciaReportada(String deficienciaReportada) {
        this.deficienciaReportada = deficienciaReportada;
    }

    /**
     * @return the participacaoTestes
     */
    public String getParticipacaoTestes() {
        return participacaoTestes;
    }

    /**
     * @param participacaoTestes the participacaoTestes to set
     */
    public void setParticipacaoTestes(String participacaoTestes) {
        this.participacaoTestes = participacaoTestes;
    }

    /**
     * @return the resultadoV02Ms
     */
    public String getResultadoV02Ms() {
        return resultadoV02Ms;
    }

    /**
     * @param resultadoV02Ms the resultadoV02Ms to set
     */
    public void setResultadoV02Ms(String resultadoV02Ms) {
        this.resultadoV02Ms = resultadoV02Ms;
    }

    /**
     * @return the indicadoresV02Ms
     */
        public String getIndicadoresV02Ms() {
        return indicadoresV02Ms;
    }

    /**
     * @param indicadoresV02Ms the indicadoresV02Ms to set
     */
    public void setIndicadoresV02Ms(String indicadoresV02Ms) {
        this.indicadoresV02Ms = indicadoresV02Ms;
    }

    /**
     * @return the resultadoPorcentagemV02Ms
     */
    public String getResultadoPorcentagemV02Ms() {
        return resultadoPorcentagemV02Ms;
    }

    /**
     * @param resultadoPorcentagemV02Ms the resultadoPorcentagemV02Ms to set
     */
    public void setResultadoPorcentagemV02Ms(String resultadoPorcentagemV02Ms) {
        this.resultadoPorcentagemV02Ms = resultadoPorcentagemV02Ms;
    }

    /**
     * @return the resultadoV02Km
     */
    public String getResultadoV02Km() {
        return resultadoV02Km;
    }

    /**
     * @param resultadoV02Km the resultadoV02Km to set
     */
    public void setResultadoV02Km(String resultadoV02Km) {
        this.resultadoV02Km = resultadoV02Km;
    }

    /**
     * @return the indicadoresV02Km
     */
    public String getIndicadoresV02Km() {
        return indicadoresV02Km;
    }

    /**
     * @param indicadoresV02Km the indicadoresV02Km to set
     */
    public void setIndicadoresV02Km(String indicadoresV02Km) {
        this.indicadoresV02Km = indicadoresV02Km;
    }

    /**
     * @return the resultadoPorcentagemV02Km
     */
    public String getResultadoPorcentagemV02Km() {
        return resultadoPorcentagemV02Km;
    }

    /**
     * @param resultadoPorcentagemV02Km the resultadoPorcentagemV02Km to set
     */
    public void setResultadoPorcentagemV02Km(String resultadoPorcentagemV02Km) {
        this.resultadoPorcentagemV02Km = resultadoPorcentagemV02Km;
    }

    /**
     * @return the resultadoV02Max
     */
    public String getResultadoV02Max() {
        return resultadoV02Max;
    }

    /**
     * @param resultadoV02Max the resultadoV02Max to set
     */
    public void setResultadoV02Max(String resultadoV02Max) {
        this.resultadoV02Max = resultadoV02Max;
    }

    /**
     * @return the indicadoresV02Max
     */
    public String getIndicadoresV02Max() {
        return indicadoresV02Max;
    }

    /**
     * @param indicadoresV02Max the indicadoresV02Max to set
     */
    public void setIndicadoresV02Max(String indicadoresV02Max) {
        this.indicadoresV02Max = indicadoresV02Max;
    }

    /**
     * @return the resultadoPorcentagemV02Max
     */
    public String getResultadoPorcentagemV02Max() {
        return resultadoPorcentagemV02Max;
    }

    /**
     * @param resultadoPorcentagemV02Max the resultadoPorcentagemV02Max to set
     */
    public void setResultadoPorcentagemV02Max(String resultadoPorcentagemV02Max) {
        this.resultadoPorcentagemV02Max = resultadoPorcentagemV02Max;
    }

}
/*


ID	Nº	NOME	
QUANTIDADE TOTAL DE TREINOS
QUANTIDADE DE TREINOS POR ALUNOS
QUANTIDADE DE VEZES COM UNIFORME 
DATA DE NASCIMENTO
GÊNERO	N AVALIACAO	
DATA AVALIACAO	SÉRIE	TURMA	PESO
ALTURA	IMC	Classificacao IMC POEST
CINTURA
Classificacao RCE
ENVERGADURA	FLEXIBILIDADE	CLASSIFICACAO FLEXIBILIDADE
ABDOMINAL
OBSERVACAO ABDOMINAL
CLASSIFICACAO ABDOMINAL	
SALTO 	CLASSIFICACAO SALTO HORIZONTAL	MEDICINIBALL
CLASSIFICACAO MEDICINIBALL
VELOCIDADE
CLASSIFICACAO VELOCIDADE
AGILIDADE
CLASSIFICACAO AGILIDADE
CORRIDA 6 MIN	CLASSIFICACAO 6MIN
1 OBS CALCADO	
2 OBS CAFÉ DA MANHA
3 OBS PERCEPCAO
4 OBS PERCEPCAO
5 OBS PERCEPCAO
6 OBS PERCEPCAO
7 OBS PERCEPCAO

 */

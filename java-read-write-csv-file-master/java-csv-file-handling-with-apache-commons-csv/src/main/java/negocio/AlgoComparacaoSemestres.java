/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import beans.Constantes;
import util.Validacoes;

/**
 *
 * @author FelipeSSCA
 */
public class AlgoComparacaoSemestres {

    private double resultado = 0;
    private String indicador = null;
    private double porcentagem = 0;
    Validacoes validacoes = new Validacoes();

    public void tabelaComparativa(String resultado1, String resultado2, int tipoExercicio) {

        if (validacoes.isNull(resultado2) == false || validacoes.isNull(resultado1) == false) {
            setIndicador(Constantes.NAO_AFERIDO);
            porcentagem = 0;
            resultado = 0;
        } else if (resultado1.equals("0.0") || resultado2.equals("0.0")) {
            setIndicador(Constantes.AUSENTE);
            porcentagem = 0;
            resultado = 0;
        } else if (resultado1.equals("0") || resultado2.equals("0")) {
            setIndicador(Constantes.AUSENTE);
            porcentagem = 0;
            resultado = 0;
        } else if (resultado1.equals("") || resultado2.equals("")) {
            setIndicador(Constantes.AUSENTE);
            porcentagem = 0;
            resultado = 0;
        } else {

            double resultado1conv1 = validacoes.transformarCampoDouble((resultado1));
            double resultado1conv2 = validacoes.transformarCampoDouble(resultado2);

            // negativo 2/ 
            // postivo 1 / 
            //estavel 0 
            if (resultado1conv1 > resultado1conv2) {
                setIndicador(etiquetasIndicadores(tipoExercicio, 2));
                setResultado(resultado1conv1 - resultado1conv2);
                porcentagem = calcPorcentagem(resultado1conv1, resultado1conv2);

            } else if (resultado1conv1 == resultado1conv2) {
                setIndicador(etiquetasIndicadores(tipoExercicio, 0));
                setResultado(0);
            } else {
                setIndicador(etiquetasIndicadores(tipoExercicio, 1));
                setResultado(resultado1conv2 - resultado1conv1);
                porcentagem = calcPorcentagem(resultado1conv2, resultado1conv1);
            }

        }
    }

    /**
     * Indica o label das classificações
     *
     * @param tipoIndicador
     * @param indicador
     * @return
     */
    private String etiquetasIndicadores(int tipoIndicador, int indicador) {

        String etiquetaIndicador = "";

        switch (tipoIndicador) {
            case Constantes.TIPO_ETIQUETA_MODALIDADES_PESO:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_PESO_PERDA;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_PESO_GANHO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_PESO_ESTAVEL;
                }
                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_GERAL:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.INDICADOR_NEGATIVO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.INDICADOR_POSITIVO;
                } else {
                    etiquetaIndicador = Constantes.INDICADOR_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_ALTURA:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ALTURA_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ALTURA_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ALTURA_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_AGILIDADE:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_AGILIDADE_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_AGILIDADE_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_AGILIDADE_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_CINTURA:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_CINTURA_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_CINTURA_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_CINTURA_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_ABDOMINAL:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ABDOMINAL_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ABDOMINAL_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ABDOMINAL_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_FLEXIBILIDADE:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_FLEXIBILIDADE_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_FLEXIBILIDADE_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_FLEXIBILIDADE_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_ENVERGADURA:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ENVERGADURA_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ENVERGADURA_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_ENVERGADURA_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_MEDBALL:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_MEDBALL_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_MEDBALL_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_MEDBALL_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_SALTO:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_SALTO_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_SALTO_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_SALTO_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_VELOCIDADE:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_VELOCIDADE_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_VELOCIDADE_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_VELOCIDADE_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_CORRIDA6:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_CORRIDA6_SAUDE:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_SAUDE_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_SAUDE_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_SAUDE_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_IMC:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_SAUDE_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_SAUDE_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_CORRIDA6_SAUDE_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_RCE:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_RCE_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_RCE_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICAÇÃO_RCE_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_VO_MS:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.INDICADOR_NEGATIVO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.INDICADOR_POSITIVO;
                } else {
                    etiquetaIndicador = Constantes.INDICADOR_ESTAVEL;
                }

                break;
            case Constantes.TIPO_ETIQUETA_MODALIDADES_VO_MAX:
                if (indicador == Constantes.TIPO_ETIQUETA_NEGATIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_V02_DIMINUICAO;
                } else if (indicador == Constantes.TIPO_ETIQUETA_POSITIVO) {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_VO2_AUMENTO;
                } else {
                    etiquetaIndicador = Constantes.ZONA_CLASSIFICACAO_VO2_ESTAVEL;
                }

                break;

        }

        return etiquetaIndicador;

    }

    private double calcPorcentagem(double resultado1, double resultado2) {

        if (resultado1 == resultado2) {
            return 0.0;
        }
        //((V2-V1)/V1 × 100).
        double reultadoPorcentagem = 0;
        reultadoPorcentagem = (resultado1 - resultado2) / resultado1 * 100;
        return reultadoPorcentagem;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @return the indicador
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * @param indicador the indicador to set
     */
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    /**
     * @return the porcentagem
     */
    public double getPorcentagem() {
        return porcentagem;
    }

    /**
     * @param porcentagem the porcentagem to set
     */
    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}

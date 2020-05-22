/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Constantes;

/**
 *
 * @author FelipeSSCA
 */
public class Legendas {
    
   

    public String converteLegendas(String legenda, int numObs) {

        String legendaRetorno = null;
        
        if(legenda==null){}else{

        switch (numObs) {
            case 1:
                if (legenda.equals("S")) {
                    legendaRetorno = Constantes.SAPATO;

                } else if (legenda.equals("T")) {
                    legendaRetorno = Constantes.TENNIS;

                } else {
                    legendaRetorno = Constantes.NAO_AFERIDO;
                }
                break;
            case 2:
                if (legenda.equals("SC")) {
                    legendaRetorno = Constantes.SC;

                } else if (legenda.equals("C")) {
                    legendaRetorno = Constantes.C2;
                } else {
                    legendaRetorno = Constantes.BRANCO;
                }
                break;

            case 3:
                if (legenda.equals("AV")) {
                    legendaRetorno = Constantes.AV;

                } else if (legenda.equals("BD")) {
                    legendaRetorno = Constantes.BD;
                } else if (legenda.equals("C")) {
                    legendaRetorno = Constantes.C;

                } else if (legenda.equals("CA")) {
                    legendaRetorno = Constantes.CA;
                } else if (legenda.equals("CP")) {
                    legendaRetorno = Constantes.CP;

                } else if (legenda.equals("DA")) {
                    legendaRetorno = Constantes.DA;

                } else if (legenda.equals("DCA")) {
                    legendaRetorno = Constantes.DCA;
                } else if (legenda.equals("DCC")) {
                    legendaRetorno = Constantes.DCC;

                } else if (legenda.equals("DCL")) {
                    legendaRetorno = Constantes.DCL;

                } else if (legenda.equals("DE")) {
                    legendaRetorno = Constantes.DE;

                } else if (legenda.equals("DNB")) {
                    legendaRetorno = Constantes.DNB;

                } else if (legenda.equals("DNC")) {
                    legendaRetorno = Constantes.DNC;

                } else if (legenda.equals("DNG")) {
                    legendaRetorno = Constantes.DDB;

                } else if (legenda.equals("DCX")) {
                    legendaRetorno = Constantes.DCX;

                } else if (legenda.equals("DNJ")) {
                    legendaRetorno = Constantes.DNJ;

                } else if (legenda.equals("DNP")) {
                    legendaRetorno = Constantes.DNP;

                } else if (legenda.equals("DO")) {
                    legendaRetorno = Constantes.DO;

                } else if (legenda.equals("DP")) {
                    legendaRetorno = Constantes.DP;

                } else if (legenda.equals("DPA")) {
                    legendaRetorno = Constantes.DPA;

                } else if (legenda.equals("DPÉ")) {
                    legendaRetorno = Constantes.DPE;

                } else if (legenda.equals("DV")) {
                    legendaRetorno = Constantes.DV;

                } else if (legenda.equals("EN")) {
                    legendaRetorno = Constantes.EN;

                } else if (legenda.equals("F")) {
                    legendaRetorno = Constantes.F;
                } else if (legenda.equals("FA")) {
                    legendaRetorno = Constantes.FA;
                } else if (legenda.equals("MC")) {
                    legendaRetorno = Constantes.MC;
                } else if (legenda.equals("MCA")) {
                    legendaRetorno = Constantes.MCA;

                } else if (legenda.equals("ME")) {
                    legendaRetorno = Constantes.ME;
                } else if (legenda.equals("MNE")) {
                    legendaRetorno = Constantes.MNE;

                } else if (legenda.equals("N")) {
                    legendaRetorno = Constantes.N;
                } else if (legenda.equals("NE")) {
                    legendaRetorno = Constantes.NE;
                } else if (legenda.equals("PA")) {
                    legendaRetorno = Constantes.PA;
                } else if (legenda.equals("PD")) {
                    legendaRetorno = Constantes.PD;
                } else if (legenda.equals("S")) {
                    legendaRetorno = Constantes.S;
                } else if (legenda.equals("T")) {
                    legendaRetorno = Constantes.T;
                } else if (legenda.equals("TB")) {
                    legendaRetorno = Constantes.TB;
                } else if (legenda.equals("TP")) {
                    legendaRetorno = Constantes.TP;
                } else {
                    legendaRetorno = Constantes.BRANCO;
                }
                break;

            case 4:
                if (legenda.equals("MF")) {
                    legendaRetorno = Constantes.MF;
                } else if (legenda.equals("DT")) {
                    legendaRetorno = Constantes.DT;

                } else if (legenda.equals("ABP")) {
                    legendaRetorno = Constantes.ABP;

                } else if (legenda.equals("DCT")) {
                    legendaRetorno = Constantes.DCT;

                } else if (legenda.equals("DCL")) {
                    legendaRetorno = Constantes.DCL4;
                } else if (legenda.equals("DCC")) {
                    legendaRetorno = Constantes.DCC4;
                } else if (legenda.equals("NVF")) {
                    legendaRetorno = Constantes.NVF;
                } else if (legenda.equals("DO")) {
                    legendaRetorno = Constantes.DO4;
                } else if (legenda.equals("DA")) {
                    legendaRetorno = Constantes.DA4;
                } else if (legenda.equals("N")) {
                    legendaRetorno = Constantes.N4;
                } else {
                    legendaRetorno = Constantes.BRANCO;

                }
                break;

            case 5:
                if (legenda.equals("F")) {
                    legendaRetorno = Constantes.FEMININO;

                } else {
                    legendaRetorno = Constantes.MASCULINO;
                }
            
        }}

        return legendaRetorno;
    }
    
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import beans.Constantes;

/**
 *
 * @author FelipeSSCA
 */
public class AlgoClassificacao {

    private double resultadoClassificacaoRCE;
    private double resultadoMedBall;
    private double resultadoCalculoIMC;
   
//    private final DecimalFormat formato = new DecimalFormat("#.##");

    /*
    Tabela  classificação desportiva OK 
     */
    public String tabelaMedBall(int idade, String sexo, double arremeco) {

        String resultado = "Não informado";
        
        
        if (arremeco == 0) {
            resultado = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:

                        if (arremeco < 145) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 145 || arremeco <= 159) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 160 || arremeco <= 182) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 183 || arremeco <= 239) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 240) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 7:

                        if (arremeco < 164) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 164 || arremeco <= 179) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 180 || arremeco <= 201) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 202 || arremeco <= 249) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 250) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 8:

                        if (arremeco < 180) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 180 || arremeco <= 199) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 200 || arremeco <= 224) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 225 || arremeco <= 269) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 270) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 9:

                        if (arremeco < 200) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 200 || arremeco <= 219) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 220 || arremeco <= 249) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 250 || arremeco <= 299) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 300) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 10:

                        if (arremeco < 212) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 213 || arremeco <= 239) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 240 || arremeco <= 269) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 270 || arremeco <= 329) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 330) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 11:

                        if (arremeco < 238) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 238 || arremeco <= 260) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 261 || arremeco <= 293) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 294 || arremeco <= 361) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 362) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 12:

                        if (arremeco < 264) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 264 || arremeco <= 296) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 297 || arremeco <= 329) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 330 || arremeco <= 422) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 423) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 13:

                        if (arremeco < 300) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 300 || arremeco <= 339) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 340 || arremeco <= 389) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 390 || arremeco <= 499) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 500) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 14:

                        if (arremeco < 350) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 350 || arremeco <= 399) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 400 || arremeco <= 449) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 450 || arremeco <= 561) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 562) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 15:
                        if (arremeco < 400) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 400 || arremeco <= 439) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 440 || arremeco <= 499) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 500 || arremeco <= 608) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 562) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 16:

                        if (arremeco < 453) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 453 || arremeco <= 499) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 500 || arremeco <= 552) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 553 || arremeco <= 699) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 700) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 17:

                        if (arremeco < 480) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 480 || arremeco <= 520) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 521 || arremeco <= 589) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 590 || arremeco <= 689) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 700) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                /*
            *Mulheres
                 */
            } else {

                switch (idade) {
                    case 6:

                        if (arremeco < 140) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 140 || arremeco <= 149) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 150 || arremeco <= 163) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 164 || arremeco <= 207) {

                            resultado = Constantes.MUITO_BOM;
                        } else if (arremeco >= 208) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 7:

                        if (arremeco < 153) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 153 || arremeco <= 161) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 162 || arremeco <= 179) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 180 || arremeco <= 216) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 217) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 8:

                        if (arremeco < 167) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 167 || arremeco <= 184) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 185 || arremeco <= 199) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 200 || arremeco <= 246) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 247) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 9:

                        if (arremeco < 185) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 185 || arremeco <= 200) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 201 || arremeco <= 225) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 226 || arremeco <= 279) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 280) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 10:

                        if (arremeco < 200) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 200 || arremeco <= 219) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 220 || arremeco <= 244) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 245 || arremeco <= 301) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 302) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 11:

                        if (arremeco < 220) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 220 || arremeco <= 246) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 247 || arremeco <= 275) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 276 || arremeco <= 329) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 330) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 12:

                        if (arremeco < 241) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 241 || arremeco <= 269) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 270 || arremeco <= 299) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 300 || arremeco <= 369) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 370) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 13:

                        if (arremeco < 265) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 265 || arremeco <= 294) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 295 || arremeco <= 322) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 323 || arremeco <= 399) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 400) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 14:

                        if (arremeco < 280) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 280 || arremeco <= 309) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 310 || arremeco <= 343) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 344 || arremeco <= 417) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 418) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 15:

                        if (arremeco < 300) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 300 || arremeco <= 329) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 330 || arremeco <= 359) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 360 || arremeco <= 429) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 430) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 16:

                        if (arremeco < 320) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 320 || arremeco <= 339) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 340 || arremeco <= 369) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 370 || arremeco <= 449) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 450) {
                            resultado = Constantes.EXCELENCA;

                        }

                }
                switch (idade) {
                    case 17:

                        if (arremeco < 310) {
                            resultado = Constantes.FRACO;
                        } else if (arremeco == 310 || arremeco <= 339) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (arremeco == 340 || arremeco <= 374) {
                            resultado = Constantes.BOM;

                        } else if (arremeco == 375 || arremeco <= 440) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (arremeco >= 441) {
                            resultado = Constantes.EXCELENCA;

                        }

                }

            }
        }

        return resultado;

    }

    /*
    Tabela salto OK
     */
    public String tabelaSalto(int idade, String sexo, double salto) {

        String resultado = "Não informado";

        if (salto == 0) {
            resultado = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:

                        if (salto < 105) {

                            resultado = Constantes.FRACO;

                        } else if (salto == 105 || salto <= 114) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 115 || salto <= 127) {
                            resultado = Constantes.BOM;

                        } else if (salto == 128 || salto <= 151) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 152) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (salto < 111) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 111 || salto <= 121) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 122 || salto <= 133) {
                            resultado = Constantes.BOM;

                        } else if (salto == 134 || salto <= 159) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 160) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (salto < 118) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 180 || salto <= 127) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 128 || salto <= 139) {
                            resultado = Constantes.BOM;

                        } else if (salto == 140 || salto <= 165) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 166) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (salto < 129) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 129 || salto <= 139) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 140 || salto <= 151) {
                            resultado = Constantes.BOM;

                        } else if (salto == 152 || salto <= 178) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 179) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (salto < 135) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 135 || salto <= 146) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 146 || salto <= 157) {
                            resultado = Constantes.BOM;

                        } else if (salto == 158 || salto <= 187) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 188) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (salto < 140) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 140 || salto <= 151) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 152 || salto <= 164) {
                            resultado = Constantes.BOM;

                        } else if (salto == 164 || salto <= 191) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 192) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (salto < 149) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 149 || salto <= 159) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 160 || salto <= 173) {
                            resultado = Constantes.BOM;

                        } else if (salto == 174 || salto <= 203) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 204) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (salto < 159) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 159 || salto <= 169) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 170 || salto <= 184) {
                            resultado = Constantes.BOM;

                        } else if (salto == 185 || salto <= 216) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 217) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (salto < 170) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 170 || salto <= 183) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 184 || salto <= 199) {
                            resultado = Constantes.BOM;

                        } else if (salto == 200 || salto <= 230) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 231) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (salto < 180) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 180 || salto <= 193) {
                            resultado = Constantes.RAZOAVEL;
                        } else if (salto == 194 || salto <= 209) {
                            resultado = Constantes.BOM;

                        } else if (salto == 210 || salto <= 242) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 243) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (salto < 186) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 186 || salto <= 199) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 200 || salto <= 214) {
                            resultado = Constantes.BOM;

                        } else if (salto == 215 || salto <= 248) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 249) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (salto < 186) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 186 || salto <= 203) {
                            resultado = Constantes.RAZOAVEL;
                        } else if (salto == 204 || salto <= 219) {
                            resultado = Constantes.BOM;

                        } else if (salto == 220 || salto <= 250) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 251) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                /*
            *Mulheres
                 */
            } else {

                switch (idade) {
                    case 6:

                        if (salto < 90) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 90 || salto <= 100) {
                            resultado = Constantes.RAZOAVEL;
                        } else if (salto == 101 || salto <= 112) {
                            resultado = Constantes.BOM;

                        } else if (salto == 113 || salto <= 143) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 144) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (salto < 94) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 164 || salto <= 105) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 106 || salto <= 115) {
                            resultado = Constantes.BOM;

                        } else if (salto == 116 || salto <= 146) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 147) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (salto < 105) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 105 || salto <= 112) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 113 || salto <= 126) {
                            resultado = Constantes.BOM;

                        } else if (salto == 127 || salto <= 152) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 153) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (salto < 116) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 116 || salto <= 126) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 127 || salto <= 139) {
                            resultado = Constantes.BOM;

                        } else if (salto == 140 || salto <= 165) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 166) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (salto < 123) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 123 || salto <= 133) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 134 || salto <= 145) {
                            resultado = Constantes.BOM;

                        } else if (salto == 146 || salto <= 173) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 174) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (salto < 127) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 127 || salto <= 137) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 138 || salto <= 149) {
                            resultado = Constantes.BOM;

                        } else if (salto == 150 || salto <= 179) {

                            resultado = Constantes.MUITO_BOM;
                        } else if (salto >= 180) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (salto < 130) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 130 || salto <= 140) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 141 || salto <= 154) {
                            resultado = Constantes.BOM;

                        } else if (salto == 155 || salto <= 184) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 185) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (salto < 133) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 133 || salto <= 144) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 145 || salto <= 159) {
                            resultado = Constantes.BOM;

                        } else if (salto == 160 || salto <= 189) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 190) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (salto < 134) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 134 || salto <= 146) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 147 || salto <= 160) {
                            resultado = Constantes.BOM;

                        } else if (salto == 161 || salto <= 198) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 199) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (salto < 135) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 135 || salto <= 147) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 148 || salto <= 162) {
                            resultado = Constantes.BOM;

                        } else if (salto == 163 || salto <= 198) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 199) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (salto < 131) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 131 || salto <= 142) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 143 || salto <= 158) {
                            resultado = Constantes.BOM;

                        } else if (salto == 159 || salto <= 191) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 192) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (salto < 121) {
                            resultado = Constantes.FRACO;
                        } else if (salto == 121 || salto <= 134) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (salto == 135 || salto <= 152) {
                            resultado = Constantes.BOM;

                        } else if (salto == 153 || salto <= 189) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (salto >= 190) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }

            }
        }

        return resultado;

    }

    /*
    Tabela agilidade - OK
     */
    public String tabelaAgilidade(int idade, String sexo, double agilidade) {

        String resultado = "Não informado";

        if (agilidade == 0) {
            resultado = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:

                        if (agilidade <= 6.40) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 6.40 || agilidade <= 7.30) {
                            resultado = Constantes.MUITO_BOM;
                        } else if (agilidade == 7.31 || agilidade <= 7.79) {
                            resultado = Constantes.BOM;
                        } else if (agilidade == 7.80 || agilidade <= 8.19) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 8.19) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (agilidade <= 6.07) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 6.08 || agilidade <= 7.00) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 7.01 || agilidade <= 7.43) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 7.44 || agilidade <= 7.76) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.76) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (agilidade <= 5.97) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.98 || agilidade <= 6.78) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.79 || agilidade <= 7.20) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 7.21 || agilidade <= 7.59) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.59) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (agilidade <= 5.81) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.82 || agilidade <= 6.50) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.51 || agilidade <= 6.89) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.90 || agilidade <= 7.19) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.19) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (agilidade <= 5.58) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.59 || agilidade <= 6.25) {
                            resultado = Constantes.MUITO_BOM;
                        } else if (agilidade == 6.26 || agilidade <= 6.66) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.67 || agilidade <= 7.00) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.00) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (agilidade <= 5.39) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.40 || agilidade <= 6.10) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.11 || agilidade <= 6.50) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.51 || agilidade <= 6.87) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 6.87) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (agilidade <= 5.17) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.18 || agilidade <= 6.00) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.01 || agilidade <= 6.34) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.35 || agilidade <= 6.70) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 6.70) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (agilidade <= 5.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.01 || agilidade <= 5.86) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 5.87 || agilidade <= 6.16) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.17 || agilidade <= 6.53) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 6.54) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (agilidade <= 5.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.01 || agilidade <= 5.69) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 5.70 || agilidade <= 6.00) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.01 || agilidade <= 6.37) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 6.37) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (agilidade <= 4.91) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 4.92 || agilidade <= 5.59) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 5.60 || agilidade <= 5.99) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.00 || agilidade <= 6.26) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 6.26) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (agilidade < 4.90) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 4.91 || agilidade <= 5.42) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 5.43 || agilidade <= 5.75) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 5.76 || agilidade <= 6.10) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade >= 6.11) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (agilidade <= 4.90) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 4.91 || agilidade <= 5.43) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 5.44 || agilidade <= 5.75) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 5.76 || agilidade <= 6.03) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 6.04) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                /*
            *Mulheres
                 */
            } else {

                switch (idade) {
                    case 6:

                        if (agilidade <= 6.58) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 6.59 || agilidade <= 7.66) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 7.67 || agilidade <= 8.26) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 8.27 || agilidade <= 8.68) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 8.68) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (agilidade <= 6.56) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 6.57 || agilidade <= 7.56) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 7.57 || agilidade <= 8.00) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 8.01 || agilidade <= 8.41) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 8.41) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (agilidade <= 6.40) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 6.41 || agilidade <= 7.22) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 7.23 || agilidade <= 7.59) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 7.60 || agilidade <= 7.98) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.98) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (agilidade <= 6.03) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 6.04 || agilidade <= 6.89) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.90 || agilidade <= 7.25) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 7.26 || agilidade <= 7.63) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.63) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (agilidade <= 5.88) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.89 || agilidade <= 6.60) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.61 || agilidade <= 7.00) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 7.01 || agilidade <= 7.35) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.35) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (agilidade <= 5.72) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.73 || agilidade <= 6.49) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.50 || agilidade <= 6.90) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.91 || agilidade <= 7.24) {

                            resultado = Constantes.RAZOAVEL;
                        } else if (agilidade > 7.24) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (agilidade <= 5.63) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.64 || agilidade <= 6.36) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.37 || agilidade <= 6.80) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.81 || agilidade <= 7.17) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.17) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (agilidade <= 5.57) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.58 || agilidade <= 6.28) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.29 || agilidade <= 6.70) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.71 || agilidade <= 7.10) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.10) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (agilidade <= 5.49) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.50 || agilidade <= 6.22) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.23 || agilidade <= 6.68) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.69 || agilidade <= 7.03) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.03) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (agilidade <= 5.33) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.33 || agilidade <= 6.19) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.20 || agilidade <= 6.66) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.67 || agilidade <= 7.00) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.00) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (agilidade <= 5.41) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.42 || agilidade <= 6.15) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.16 || agilidade <= 6.55) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.56 || agilidade <= 6.94) {

                            resultado = Constantes.RAZOAVEL;
                        } else if (agilidade > 6.94) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (agilidade <= 5.54) {
                            resultado = Constantes.EXCELENCA;
                        } else if (agilidade == 5.55 || agilidade <= 6.22) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (agilidade == 6.23 || agilidade <= 6.58) {
                            resultado = Constantes.BOM;

                        } else if (agilidade == 6.59 || agilidade <= 7.00) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (agilidade > 7.00) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }

            }
        }

        return resultado;

    }

    /*
    /*
    Tabela corrida 6- OK
     */
    public String tabelaCorridaResistencia6Min(int idade, String sexo, double corrida) {

        String resultado = "Não informado";

        if (corrida == 0) {
            resultado = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:

                        if (corrida < 690) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 690 || corrida <= 740) {
                            resultado = Constantes.RAZOAVEL;
                        } else if (corrida == 741 || corrida <= 780) {
                            resultado = Constantes.BOM;
                        } else if (corrida == 781 || corrida <= 878) {
                            resultado = Constantes.MUITO_BOM;
                        } else if (corrida >= 879) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (corrida < 735) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 735 || corrida <= 785) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 786 || corrida <= 824) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 825 || corrida <= 923) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 924) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (corrida < 773) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 773 || corrida <= 825) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 826 || corrida <= 878) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 879 || corrida <= 1009) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1010) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (corrida < 845) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 845 || corrida <= 899) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 900 || corrida <= 965) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 966 || corrida <= 1096) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1097) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (corrida < 880) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 881 || corrida <= 941) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 942 || corrida <= 1009) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1010 || corrida <= 1157) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1158) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (corrida < 915) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 915 || corrida <= 977) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 978 || corrida <= 1049) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1050 || corrida <= 1189) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1190) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (corrida < 965) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 965 || corrida <= 1029) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1030 || corrida <= 1109) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1110 || corrida <= 1254) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1255) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (corrida < 983) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 984 || corrida <= 1082) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1083 || corrida <= 1158) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1159 || corrida <= 1319) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1320) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (corrida < 1068) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 1069 || corrida <= 1134) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1135 || corrida <= 1209) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1210 || corrida <= 1371) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1372) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (corrida < 1120) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 1121 || corrida <= 1186) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1187 || corrida <= 1261) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1262 || corrida <= 1434) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1435) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (corrida < 1150) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 1151 || corrida <= 1219) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1220 || corrida <= 1288) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1289 || corrida <= 1505) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1506) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (corrida < 1156) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 1156 || corrida <= 1219) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1220 || corrida <= 1288) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1289 || corrida <= 1505) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1506) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                /*
            *Mulheres
                 */
            } else {

                switch (idade) {
                    case 6:

                        if (corrida < 612) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 612 || corrida <= 640) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 641 || corrida <= 680) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 681 || corrida <= 831) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 832) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (corrida < 652) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 652 || corrida <= 682) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 683 || corrida <= 729) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 730 || corrida <= 851) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 852) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (corrida < 700) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 700 || corrida <= 734) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 735 || corrida <= 777) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 778 || corrida <= 874) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 875) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (corrida < 750) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 750 || corrida <= 789) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 790 || corrida <= 840) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 841 || corrida <= 965) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 966) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (corrida < 783) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 783 || corrida <= 831) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 832 || corrida <= 883) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 884 || corrida <= 1026) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1027) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (corrida < 822) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 822 || corrida <= 867) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 868 || corrida <= 919) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 920 || corrida <= 1042) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1043) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (corrida < 855) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 856 || corrida <= 900) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 901 || corrida <= 957) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 958 || corrida <= 1080) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1081) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (corrida < 887) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 887 || corrida <= 934) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 935 || corrida <= 996) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 997 || corrida <= 1128) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1129) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (corrida < 920) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 920 || corrida <= 966) {
                            resultado = Constantes.RAZOAVEL;
                        } else if (corrida == 967 || corrida <= 1023) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1024 || corrida <= 1163) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1163) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (corrida < 955) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 955 || corrida <= 999) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1000 || corrida <= 1043) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1044 || corrida <= 1204) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1205) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (corrida < 970) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 970 || corrida <= 1009) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1010 || corrida <= 1054) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1055 || corrida <= 1155) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1156) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (corrida < 982) {
                            resultado = Constantes.FRACO;
                        } else if (corrida == 982 || corrida <= 1022) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida == 1023 || corrida <= 1062) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 1063 || corrida <= 1206) {

                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida >= 1207) {
                            resultado = Constantes.EXCELENCA;

                        }
                        break;

                }

            }
        }

        return resultado;

    }

    public String tabelaCorridaResistencia6MinSaude(int idade, String sexo, double corrida) {
        String resultadoSaude = Constantes.NAO_AFERIDO;

        if (corrida == 0) {
            resultadoSaude = Constantes.AUSENTE;
        } else {
            //Genero Masculino 
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:
                        if (corrida < 675) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 675) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 7:
                        if (corrida < 730) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 730) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 8:
                        if (corrida < 768) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 768) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 9:
                        if (corrida < 820) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 820) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 10:
                        if (corrida < 856) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 856) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 11:
                        if (corrida < 930) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 930) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 12:
                        if (corrida < 966) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 966) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 13:
                        if (corrida < 995) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 995) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 14:
                        if (corrida < 1060) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1060) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 15:
                        if (corrida < 1130) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1130) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 16:
                        if (corrida < 1190) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1190) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }

                switch (idade) {
                    case 17:
                        if (corrida < 1190) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1190) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
            }

            //Genero Feminino
            if (sexo.equals(Constantes.FEMININO)) {

                switch (idade) {
                    case 6:
                        if (corrida < 630) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 630) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 7:
                        if (corrida < 683) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 683) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 8:
                        if (corrida < 715) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 715) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 9:
                        if (corrida < 745) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 745) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 10:
                        if (corrida < 790) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 790) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 11:
                        if (corrida < 840) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 840) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 12:
                        if (corrida < 900) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 900) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 13:
                        if (corrida < 940) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 940) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 14:
                        if (corrida < 985) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 985) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 15:
                        if (corrida < 1005) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1005) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }
                switch (idade) {
                    case 16:
                        if (corrida < 1070) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1070) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }

                switch (idade) {
                    case 17:
                        if (corrida < 1110) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_RISCO;
                        } else if (corrida == 1110) {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_SEM_ALTERA;
                        } else {
                            resultadoSaude = Constantes.CORRIDA_6M_SAUDE_DIMINUICAO;
                        }
                        break;
                }

            }
        }
        return resultadoSaude;

    }

    /*
    Tabela corrida 20- ok
     */
    public String tabelaCorridaResistencia20Min(int idade, String sexo, double corrida) {

        String resultado = "Não informado";

        if (corrida == 0) {
            resultado = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
        
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:

                        if (corrida <= 3.72) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.73 || corrida <= 4.20) {
                            resultado = Constantes.MUITO_BOM;
                        } else if (corrida == 4.21 || corrida <= 4.53) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.54 || corrida <= 4.80) {
                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.80) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (corrida <= 3.65) {
                            resultado = Constantes.EXCELENCA;

                        } else if (corrida == 3.66 || corrida <= 4.12) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 4.13 || corrida <= 4.42) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.43 || corrida <= 4.62) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.62) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (corrida <= 3.50) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.51 || corrida <= 4.00) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 4.01 || corrida <= 4.21) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.22 || corrida <= 4.47) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.47) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (corrida <= 3.15) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.16 || corrida <= 3.88) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.89 || corrida <= 4.09) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.10 || corrida <= 4.31) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.31) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (corrida < 3.07) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.08 || corrida <= 3.74) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.75 || corrida <= 3.98) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.99 || corrida <= 4.15) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.15) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (corrida < 3.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.01 || corrida <= 3.62) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.63 || corrida <= 3.86) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.87 || corrida <= 4.03) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.03) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (corrida <= 3.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.01 || corrida <= 3.50) {
                            resultado = Constantes.MUITO_BOM;
                        } else if (corrida == 3.51 || corrida <= 3.74) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.75 || corrida <= 3.96) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 3.96) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (corrida <= 3.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.01 || corrida <= 3.37) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.38 || corrida <= 3.60) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.61 || corrida <= 3.81) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 3.81) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (corrida <= 2.90) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 2.91 || corrida <= 3.23) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.24 || corrida <= 3.46) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.47 || corrida <= 3.67) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 3.67) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (corrida <= 2.87) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 2.88 || corrida <= 3.16) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.17 || corrida <= 3.38) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.39 || corrida <= 3.60) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 3.60) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (corrida <= 2.78) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 2.79 || corrida <= 3.12) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.13 || corrida <= 3.31) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.32 || corrida <= 3.50) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 3.50) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (corrida < 2.72) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 2.73 || corrida <= 3.12) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.13 || corrida <= 3.30) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.31 || corrida <= 3.53) {

                            resultado = Constantes.RAZOAVEL;
                        } else if (corrida > 3.53) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                /*
            *Mulheres
                 */
            } else {

                switch (idade) {
                    case 6:

                        if (corrida <= 4.01) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 4.02 || corrida <= 4.54) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 4.55 || corrida <= 4.83) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.84 || corrida <= 5.11) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 5.11) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 7:

                        if (corrida <= 3.90) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.91 || corrida <= 4.47) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 4.48 || corrida <= 4.77) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.78 || corrida <= 5.07) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 5.07) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 8:

                        if (corrida <= 3.87) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.88 || corrida <= 4.27) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 4.28 || corrida <= 4.53) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.54 || corrida <= 4.75) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.75) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 9:

                        if (corrida <= 3.55) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.56 || corrida <= 4.00) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 4.01 || corrida <= 4.28) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.29 || corrida <= 4.54) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.54) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 10:

                        if (corrida <= 3.43) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.44 || corrida <= 3.97) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.98 || corrida <= 4.16) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.17 || corrida <= 4.41) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.41) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 11:

                        if (corrida <= 3.29) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.30 || corrida <= 3.87) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.87 || corrida <= 4.09) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.10 || corrida <= 4.31) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.31) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 12:

                        if (corrida <= 3.07) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.08 || corrida <= 3.78) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.79 || corrida <= 4.00) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.01 || corrida <= 4.25) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.25) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 13:

                        if (corrida <= 3.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.01 || corrida <= 3.71) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.71 || corrida <= 3.98) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.99 || corrida <= 4.19) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.19) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 14:

                        if (corrida <= 3.00) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.01 || corrida <= 3.70) {
                            resultado = Constantes.MUITO_BOM;
                        } else if (corrida == 3.71 || corrida <= 3.97) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 3.98 || corrida <= 4.21) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.21) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 15:

                        if (corrida <= 3.05) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.05 || corrida <= 3.72) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.73 || corrida <= 4.00) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.01 || corrida <= 4.25) {

                            resultado = Constantes.RAZOAVEL;
                        } else if (corrida > 4.25) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 16:

                        if (corrida < 3.24) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.25 || corrida <= 3.70) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.71 || corrida <= 4.00) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.01 || corrida <= 4.23) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.23) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }
                switch (idade) {
                    case 17:

                        if (corrida <= 3.16) {
                            resultado = Constantes.EXCELENCA;
                        } else if (corrida == 3.17 || corrida <= 3.79) {
                            resultado = Constantes.MUITO_BOM;

                        } else if (corrida == 3.80 || corrida <= 4.07) {
                            resultado = Constantes.BOM;

                        } else if (corrida == 4.08 || corrida <= 4.32) {

                            resultado = Constantes.RAZOAVEL;

                        } else if (corrida > 4.32) {
                            resultado = Constantes.FRACO;

                        }
                        break;

                }

            }
        }

        return resultado;

    }

    /*
    Tabela  classificação Saúde
     */
    public String tabelaIMC(int idade, String sexo, double imc) {

        String resultadoIMC = "Não aferido";

        if (imc == 0) {
            resultadoIMC = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:
                        if (imc <= 17.7) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 7:
                        if (imc <= 17.8) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 8:
                        if (imc <= 19.2) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 9:
                        if (imc <= 19.3) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 10:
                        if (imc <= 20.7) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 11:
                        if (imc <= 22.1) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 12:
                        if (imc <= 22.2) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 13:
                        if (imc <= 22) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 14:
                        if (imc <= 22.2) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 15:
                        if (imc <= 23) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 16:
                        if (imc <= 24) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 17:
                        if (imc <= 25.4) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;
                }

            }
            /*
        *Genero Feminino
             */
            if (sexo.equals(Constantes.FEMININO)) {

                switch (idade) {
                    case 6:
                        if (imc < 17) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 7:
                        if (imc < 17.1) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 8:
                        if (imc < 18.2) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 9:
                        if (imc < 19.1) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;
                    case 10:
                        if (imc < 20.9) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 11:
                        if (imc < 22.3) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 12:
                        if (imc < 22.6) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 13:
                        if (imc < 22) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 14:
                        if (imc < 22) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 15:
                        if (imc < 22.4) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 16:
                        if (imc < 24) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;

                    case 17:
                        if (imc < 24) {
                            resultadoIMC = Constantes.IMC_SAUDAVEL;
                        } else {

                            resultadoIMC = Constantes.IMC_RISCO;
                        }
                        break;
                }

            }

        }

        return resultadoIMC;

    }

    /*
    Tabela  classificação Flexibilidade
     */
    public String tabelaFlexibilidade(int idade, String sexo, double flex) {

        String resultadoFlexibilidade = "Não aferido";

        if (flex == 0) {
            resultadoFlexibilidade = Constantes.AUSENTE;
        } else {

            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:
                        if (flex < 29.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 7:
                        if (flex < 29.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 8:
                        if (flex < 29.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 9:
                        if (flex < 29.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 10:
                        if (flex < 29.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 11:
                        if (flex < 27.8) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 12:
                        if (flex < 24.7) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 13:
                        if (flex < 23.1) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 14:
                        if (flex < 22.9) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 15:
                        if (flex < 24.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 16:
                        if (flex < 25.7) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 17:
                        if (flex < 25.7) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;
                }

            }
            /*
        *Genero Feminino
             */
            if (sexo.equals(Constantes.FEMININO)) {

                switch (idade) {
                    case 6:
                        if (flex < 21.4) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 7:
                        if (flex < 21.4) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 8:
                        if (flex < 21.4) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 9:
                        if (flex < 21.4) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 10:
                        if (flex < 23.5) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 11:
                        if (flex < 23.5) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 12:
                        if (flex < 23.5) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 13:
                        if (flex < 23.5) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 14:
                        if (flex < 24.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 15:
                        if (flex < 24.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 16:
                        if (flex < 24.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;

                    case 17:
                        if (flex < 24.3) {
                            resultadoFlexibilidade = Constantes.FLEX_RISCO;
                        } else {

                            resultadoFlexibilidade = Constantes.FLEX_SAUDAVEL;
                        }
                        break;
                }

            }

        }

        return resultadoFlexibilidade;

    }

    //calcular IMC , e converter em CM
    public Double calculoIMC(double peso, double altura) {
        double alturaM = 0;
        double imc = 0;

        if (peso == 0 || altura == 0) {
            imc = 0;
        } else {
            alturaM = altura / 100;

            imc = peso / (alturaM * alturaM);

        }
        setResultadoCalculoIMC(imc);
        return imc;

    }

    // abdomem resistencia 
    public String classificacaoAbdominal(int idade, String sexo, double abdomem) {

        String resultadoClassificacaoAbdomem = "Não aferido";

        if (abdomem == 0) {
            resultadoClassificacaoAbdomem = Constantes.AUSENTE;
        } else {
            /*
        *Genero Masculino 
             */
            if (sexo.equals(Constantes.MASCULINO)) {

                switch (idade) {
                    case 6:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

                switch (idade) {
                    case 7:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

                switch (idade) {
                    case 8:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

                switch (idade) {
                    case 9:
                        if (abdomem < 22) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

                switch (idade) {
                    case 10:
                        if (abdomem < 22) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 11:
                        if (abdomem < 25) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

                switch (idade) {
                    case 12:
                        if (abdomem < 30) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

                switch (idade) {
                    case 13:
                        if (abdomem < 35) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 14:
                        if (abdomem < 35) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 15:
                        if (abdomem < 35) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 16:
                        if (abdomem < 40) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 17:
                        if (abdomem < 40) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

            }
            /*
        *Genero Feminino
             */
            if (sexo.equals(Constantes.FEMININO)) {
                
                switch (idade) {
                    case 6:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 7:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 8:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 9:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 10:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 11:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 12:
                        if (abdomem < 20) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                }
                switch (idade) {
                    case 13:
                        if (abdomem < 23) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 14:
                        if (abdomem < 23) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 15:
                        if (abdomem < 23) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 16:
                        if (abdomem < 23) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }
                switch (idade) {
                    case 17:
                        if (abdomem < 23) {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_RISCO;
                        } else {
                            resultadoClassificacaoAbdomem = Constantes.SAUDE_SAUDAVEL;
                        }
                        break;
                }

            }

        }

        return resultadoClassificacaoAbdomem;

    }

    // classificacao RCE
    public String classificacaoRCE(double cintura, double estatura) {

        String classificacao = null;

        double resultadoParc = 0;

        if (cintura == 0 || estatura == 0) {

            classificacao = Constantes.AUSENTE;
            setResultadoClassificacaoRCE(0);
        } else {
            resultadoParc = cintura / estatura;

            setResultadoClassificacaoRCE(resultadoParc);

            if (getResultadoClassificacaoRCE() >= 0.5) {
                classificacao = Constantes.SAUDE_RISCO;

            } else if (getResultadoClassificacaoRCE() == 0) {
                classificacao = Constantes.AUSENTE;
            } else {
                classificacao = Constantes.SAUDE_SAUDAVEL;
            }
        }

        return classificacao;
    }

    // classificacao 
    /**
     * @return the resultadoClassificacaoRCE
     */
    public double getResultadoClassificacaoRCE() {
        return resultadoClassificacaoRCE;
    }

    /**
     * @param resultadoClassificacaoRCE the resultadoClassificacaoRCE to set
     */
    public void setResultadoClassificacaoRCE(double resultadoClassificacaoRCE) {
        this.resultadoClassificacaoRCE = resultadoClassificacaoRCE;
    }

    /**
     * @return the resultadoMedBall
     */
    public double getResultadoMedBall() {
        return resultadoMedBall;
    }

    /**
     * @param resultadoMedBall the resultadoMedBall to set
     */
    public void setResultadoMedBall(double resultadoMedBall) {
        this.resultadoMedBall = resultadoMedBall;
    }

    /**
     * @return the resultadoCalculoIMC
     */
    public double getResultadoCalculoIMC() {
        return resultadoCalculoIMC;
    }

    /**
     * @param resultadoCalculoIMC the resultadoCalculoIMC to set
     */
    public void setResultadoCalculoIMC(double resultadoCalculoIMC) {
        this.resultadoCalculoIMC = resultadoCalculoIMC;
    }

}

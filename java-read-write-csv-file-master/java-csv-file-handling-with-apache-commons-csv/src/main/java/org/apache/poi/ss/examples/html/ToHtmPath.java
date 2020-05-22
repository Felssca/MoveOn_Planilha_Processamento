/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.poi.ss.examples.html;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kabelera
 */
public class ToHtmPath {
    
     public static void main(String[] args) throws IOException,Exception {
        
       
        lancar();
        
        

    }
    
    public static void lancar(){
    
    String xlsxFile = "F://TFCIC//TFCIC//Tabelas_dados_CSV//xsl_out//TFCIC_OUT.xlsx";
    String htmlFile = "F://TFCIC//TFCIC//Tabelas_dados_CSV//xsl_out//7_1_GV_2017.html";

        try {
            FileWriter fw = new FileWriter(htmlFile);
            org.apache.poi.ss.examples.html.ToHtml.create(xlsxFile, new PrintWriter(fw));
        } catch (IOException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        } 
    }
    
}

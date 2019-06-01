/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.lang.annotation.Target;
import java.util.Scanner;

/**
 *
 * @author Allan Cassiano
 */
public class Assinatura {
      

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {        
        MontaAssinatura ouvinte = new MontaAssinatura("QualidadeVideo","Preco","QuantidadeTransmissao");
    }
}

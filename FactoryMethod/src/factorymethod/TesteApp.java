/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Allan
 */

public class TesteApp {
    public static void main(String args[]) {
        FactoryVeiculo factory = new FactoryVeiculo();      
        int qtde = 5;
        String cm  = "SOL";        
        factory.getVeiculo(qtde, cm.trim());
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Aluno
 */
public class Preco implements iPreco {
    


    @Override
    public double getPreco(String plano) {

        if (plano.equals("B")) {
            return 21.90;
        } else if (plano.equals("P")) {
            return 32.90;
        } else if (plano.equals("I")) {
            return 45.90;
        }
        return 0;

    }
    
}

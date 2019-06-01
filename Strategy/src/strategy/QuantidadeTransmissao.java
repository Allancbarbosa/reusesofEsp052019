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
public class QuantidadeTransmissao implements iPreparadorNumeroTransmissoes{
    
    @Override
    public int getTransmissao(String plano) {

        if (plano.equals("B")) {
            return 1;
        } else if (plano.equals("P")) {
            return 2;
        } else if (plano.equals("I")) {
            return 4;
        }
        return 0;

    }
    
}

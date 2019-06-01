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
public class QualidadeVideo implements iContentTransformer {

    @Override
    public String getQtde(String plano) {

        if (plano.equals("B")) {
            return "Simples";
        } else if (plano.equals("P")) {
            return "HD";
        } else if (plano.equals("I")) {
            return "UltraHD";
        }
        return null;

    }
}

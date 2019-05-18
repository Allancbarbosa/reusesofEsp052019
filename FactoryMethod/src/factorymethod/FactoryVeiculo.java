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
class FactoryVeiculo {

    public Veiculo getVeiculo(int qtde, String cm) {

        if (qtde <= 2) {
            return new Tesla();
        }

        if (qtde > 2) {
            if (qtde <= 5) {
                if (cm.equals("SOL")) {
                    return new Escort();
                }
            }
        }

        if (qtde > 2) {
            if (qtde <= 5) {
                if (cm.equals("CHUVA")) {
                    return new Opala();
                }
            }
        }

        if (qtde > 5 || qtde <= 20) {
            return new Van();
        }

        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Aluno
 */
public class Cebola extends DecoratorAdd {
    double preco = 0;
    public Cebola(Pratos pratos) {
        super(pratos);
        this.preco = pratos.getPreco();
    }

    @Override
    public double getPreco() {
        return 1 + preco;
    }

}

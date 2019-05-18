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
abstract public class DecoratorAdd implements Pratos {
      
    private final Pratos prato;
    public DecoratorAdd(Pratos pratos) {
        this.prato = pratos;
    }
    
    /**
     *
     * @return
     */
    @Override
     abstract public double getPreco();
}

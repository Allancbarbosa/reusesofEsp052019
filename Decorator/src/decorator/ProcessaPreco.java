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
public class ProcessaPreco {

    public static void main(String args[]) {
        PratoA a = new PratoA();
        System.out.println(a.getPreco());
        PratoB b = new PratoB();
        System.out.println(b.getPreco());       
        Pratos o = new Ovo(a);
        o = new Ovo(o);
        System.out.println(o.getPreco());
        Pratos c = new Cebola(a);
        System.out.println(c.getPreco());
    }
}

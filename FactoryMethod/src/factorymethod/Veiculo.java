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
public abstract class Veiculo {
    public String tipo;
}

class Tesla extends Veiculo {
    public Tesla() {
        System.out.println("Tesla");
    }
}

class Escort extends Veiculo {
    public Escort() {
        System.out.println("Escort");
    }
}

class Opala extends Veiculo {
    public Opala() {
        System.out.println("Opala");
    }
}

class Van extends Veiculo {
    public Van() {
        System.out.println("Van");
    }
}

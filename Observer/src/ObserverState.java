
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// Classe observadora "Balança"

class ObserverState implements IObserver {

    double tempAnt = 0;

    @Override
    public void update(double temp) {
        if (temp != tempAnt) {
            this.tempAnt = temp;
            System.out.println("Notificando Nova Temperatura :" + temp);           
        }

    }
}

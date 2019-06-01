
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class main {
 double temAnt = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ObserverState Os = new ObserverState();
//        Os.update();

        final Random random = new Random();
       

        new Thread() {
            public void run() {
                while (true) {                    
                    
                    if (random.nextInt(10) == 5) {
                        break;
                    }
                    SubjectState temp = new SubjectState(0);
                    temp.setTemp(random.nextInt(10));
                    try {
                        sleep(1000);//Para por 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

}

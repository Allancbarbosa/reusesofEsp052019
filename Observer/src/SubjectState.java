
import java.util.ArrayList;
import java.util.List;

public class SubjectState implements IObservable {
       private List observers = new ArrayList();
       private double temp;
        double TempAnt;
 
       public SubjectState(double temp) {
            this.temp = temp;
       }
 
public void setTemp(double temp) {
        this.temp = temp;       
        this.notifyObservers();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
       
    }

    @Override
    public void notifyObservers() { 
       
        ObserverState up = new ObserverState();  
        up.update(temp);
       
    }
}


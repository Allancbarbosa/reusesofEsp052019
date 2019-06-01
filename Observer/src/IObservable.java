/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public interface IObservable {

    public void registerObserver(IObserver observer);

    public void removeObserver(IObserver observer);

    public void notifyObservers();

}

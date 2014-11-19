/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;
//import java.util.Scanner;

/**
 *
 * @author mikaeade
 */
public abstract class Player extends Observable implements Serializable, Runnable {

    public ArrayList<Observer> observers = new ArrayList<Observer>();
    public Boolean trainingDone = false;

    private String name = null;
    private Integer scoredGoals = 0;
    private Integer number; // pelaajan numero
    protected String harjoistusOhjelma;
    protected String harjoitusAikaTaulu;
    protected Integer harjoitusAika;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(Integer scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public void setPelaaOttelu() {

    }

    public Boolean getPelaaOttelu() {

        return true;
    }

    abstract void setHarjoitusOhjelma();

    abstract void setHarjoitusOhjelma(String ohjelma);

    abstract String getHarjoitusOhjelma();

    abstract void setHarjoitusAikaTaulu();

    void setHarjoitusAikaTaulu(int aika) {
    Timer timer = new Timer();    
        timer.schedule(new TimerTask() {
            public void run() {
                setHarjoitusDone(timer);
            } 
        }, aika * 1000);
    }

    public void setHarjoitusDone(Timer timer){
        //timer.cancel();
        this.trainingDone = true;     
        notifyObservers(this, trainingDone);
    }
    
    

    abstract Integer getHarjoitusAikaTaulu();

    @Override
    public String toString() {

        return ("------------------------------\n"
                + "Name :  " + getName() + "\n"
                + "Number :  " + getNumber() + "\n"
                + "Training  " + this.trainingDone.toString() + "\n");
     }

    public void notifyObservers(Observable observable, Boolean trainingDone) {
        System.out.println("'Player' -> I'll notify my manager, training has ended");
        for (Observer ob : observers) {
            ob.update(observable, trainingDone);
        }
    }

    public void registerObserver(Observer observer) {
        boolean flag = false;
        for(Observer observe: observers)
        {
            if(observe.equals(observer))
                flag = true;     
        }   
        if(!(flag))
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.util.Scanner;

/**
 *
 * @author mikaeade
 */
public abstract class Player {
    
    private Scanner scan = new Scanner(System.in);
    private String name;
    private Integer scoredGoals;
    protected String harjoistusOhjelma;
    protected String harjoitusAikaTaulu;
    protected Integer harjoitusAika;

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

    abstract void setPelaaOttelu();
    abstract String getPelaaOttelu();
    abstract void setHarjoitusOhjelma();
    abstract void setHarjoitusOhjelma(String ohjelma);
    abstract String getHarjoitusOhjelma();
    abstract void setHarjoitusAikaTaulu();
    abstract void setHarjoitusAikaTaulu(Integer aika);
    abstract Integer getHarjoitusAikaTaulu();

    @Override
    public String toString(){
        
        return(" Name :  " + getName() + "\n" +
               " Goals;  " + getScoredGoals() + "\n"); 
        
    }
    
}

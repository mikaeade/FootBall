/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

/**
 *
 * @author mikaeade
 */
public abstract class Player {
    
    private String name;
    private Integer scoredGoals;
    //private String harjoistusOhjelma;
    // private String harjoitusAikaTaulu;

    public String getNimi() {
        return name;
    }

    public void setNimi(String name) {
        this.name = name;
    }

    public Integer getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(Integer scoredGoals) {
        this.scoredGoals = scoredGoals;
    }


    
    abstract void harjoitusOhjelma();
    abstract void harjoitusAikaTaulu();

}

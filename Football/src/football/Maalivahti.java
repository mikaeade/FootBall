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

public class Maalivahti extends Player {

    //-----Player initial data ---------
    
    @Override
    public void setHarjoitusOhjelma() {
        harjoistusOhjelma = "pitkiä lenkkejä";
    }
    
    @Override
    public void setHarjoitusOhjelma(String ohjelma) {
        harjoistusOhjelma = "ohjelma";
    }
    
    @Override
    public String getHarjoitusOhjelma() {
        return this.harjoistusOhjelma;
    }

    @Override
    public void setHarjoitusAikaTaulu() {
        
        // joku Timer() hässäkkä        
    }  
    public void setHarjoitusAikaTaulu(Integer harjoitusAika) {
        
        this.harjoitusAika = harjoitusAika;
        System.out.println("Aseta aika timerille");
        // joku Timer() hässäkkä        
    }  
    @Override
    public Integer getHarjoitusAikaTaulu() {
        System.out.println("HarjoitusAikaTaulu maalivahti, alkaa nyt");
        // joku Timer() hässäkkä   
        return this.harjoitusAika;
    }  
 
    
    @Override 
    public String toString(){
        return(super.toString() + 
               "Goals:  " + getScoredGoals() + "\n" +
               "Practices: " + getHarjoitusOhjelma() + "\n"
                );
        
    }
    
    
}

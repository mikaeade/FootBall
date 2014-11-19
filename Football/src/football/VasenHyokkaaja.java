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

/**
 *
 * @author mikaeade
 */
public class VasenHyokkaaja extends Player {

    //-----Player initial data ---------
    @Override
    public void setHarjoitusOhjelma() {
        harjoistusOhjelma = "Juoksua Juoksua, JUOKSE!!!! PRKL";
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
        // tähän joku helvetin observer hässäkkä 
        // joku Timer() hässäkkä        
    }

    @Override
    public Integer getHarjoitusAikaTaulu() {
        System.out.println("HarjoitusAikaTaulu vasenhyökkääjä, alkaa nyt");
        // joku Timer() hässäkkä   
        return this.harjoitusAika;
    }

    @Override
    public String toString() {
        return (super.toString()
                + "Goals:  " + getScoredGoals() + "\n"
                + "Practices: " + getHarjoitusOhjelma() + "\n");

    }
}


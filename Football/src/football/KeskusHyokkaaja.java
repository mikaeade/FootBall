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
public class KeskusHyokkaaja extends Player {
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
        
        // joku Timer() hässäkkä        
    }  
    @Override
    public void setHarjoitusAikaTaulu(Integer harjoitusAika) {
        
        this.harjoitusAika = harjoitusAika;
        System.out.println("Aseta aika timerille");
        // joku Timer() hässäkkä        
    }  
    @Override
    public Integer getHarjoitusAikaTaulu() {
        System.out.println("HarjoitusAikaTaulu vasenhyökkääjä, alkaa nyt");
        // joku Timer() hässäkkä   
        return this.harjoitusAika;
    }  
 
    
    //------------Player when playing a game ----------------
    
    
    @Override
    void setPelaaOttelu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPelaaOttelu() {
        
        return "";
    }
    
    
    @Override
    public void setScoredGoals(Integer scoredGoals) {
        super.setScoredGoals(scoredGoals); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getScoredGoals() {
        return super.getScoredGoals(); //To change body of generated methods, choose Tools | Templates.
    }
}

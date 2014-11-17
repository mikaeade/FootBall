/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * KoosteLuokka
 *
 * @author mikaeade
 */
public class Team {

    List<Player> players = new ArrayList<Player>();
    Scanner scan = new Scanner(System.in);

    public void addPlayer() {

        System.out.println("Anna pelipaikka");
        System.out.println("1. VasenHyokkääjä");
        System.out.println("2. KeskuHyökkääjä");
        System.out.println("3. OikeaHyökkääjä");
        System.out.println("4  Maalivahti");
        System.out.println("5. VasenPuolustaja");
        System.out.println("6. OikeaPuolustaja");

        int valinta = scan.nextInt();
        valitsePeliPaikka(valinta);

}

public void valitsePeliPaikka(int pelipaikka)
    {
        switch(pelipaikka){
        case 1: 
            VasenHyokkaaja vh = new VasenHyokkaaja();
            
            vh.setNimi("Mika");
            vh.setScoredGoals(1);
            vh.harjoitusAikaTaulu();
            vh.harjoitusOhjelma();
            players.add(vh);
            
       //     jatka tästä, jossain pitää lukea pelaajan nimi ja muut tiedot
            
                
        case 2:
         
        case 3:
        case 4:
        case 5:    
            




    }

    }



    
    public void removePlayer(){
    
    };
    
    public void trainPlayer(){
    
    };
    
    
    
}

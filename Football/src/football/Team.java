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

        // jokaiselle pelaajalle oma numero
        
        System.out.println("Anna pelipaikka");
        System.out.println("1. VasenHyokkääjä");
        System.out.println("2. KeskuHyökkääjä");
        System.out.println("3. OikeaHyökkääjä");
        System.out.println("4  Maalivahti");
        System.out.println("5. VasenPuolustaja");
        System.out.println("6. OikeaPuolustaja");

        int chosen = scan.nextInt();
        addPlayerName(chosen);

    }

    public void addPlayerName(int gamePlace) {
        System.out.println("Anna pelaajan Nimi: ");
        String name = scan.next();
        System.out.println("Anna pelaajan Numero: ");
        Integer numero = scan.nextInt();
        
        
        switch (gamePlace) {
            case 1:{
                VasenHyokkaaja player = new VasenHyokkaaja();
                player.setName(name);
                player.setHarjoitusOhjelma();
                player.setHarjoitusAikaTaulu();
                //vh.setPlayerNumber();
                //
                //
                players.add(player);
            }
            break;
            case 2:{
                
                KeskusHyokkaaja player = new KeskusHyokkaaja();
                player.setName(name);
                player.setHarjoitusOhjelma();
                player.setHarjoitusAikaTaulu();
                players.add(player);
            }   
                break;
            /*    
             case 3:
             OikeaHyokkaaja oh = new OikeaHyokkaaja();
             break;
             case 4:
             Maalivahti mv = new Maalivahti();
             break;
             case 5:  
             VasenPuolustaja vp = new VasenPuolustaja();
             break;
             case 6:
             OikeaPuolustaja op = new OikeaPuolustaja();
             break;
             */
            default:

                System.out.println("Väärä valinta");
        }
    }

    public void removePlayer() {

    }
    
    public void listPlayer() {
        
        System.out.println("---- List of all Player");
        
        
    }
    
    
    public void trainPlayer() {

    }


}

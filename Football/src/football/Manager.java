/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.io.Serializable;
import java.util.Observer;
import java.util.Scanner;

/**
 *
 * @author mikaeade
 */
public class Manager implements Observer, Serializable{

    Team team = new Team();

    private static Manager instance = null;
    private Manager() { }
 
    public static synchronized Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }
 
    public void startProgram(){   
        managerMenu();
    }

    private void managerMenu() {
        System.out.println("---- FootBall ---- ");
        printManagerMenu();
    }

    private void printManagerMenu() {

        int valinta = -1;
        while (valinta != 6) {
            System.out.println(
                    "Valitse mitä teet:\n"
                    + "1. Lisää pelaaja\n"
                    + "2. Poista pelaaja\n"
                    + "3. Listaa pelaajat\n"
                    + "4. Harjoita pelaajaa\n"
                    + "5. Peluuta pelaajaa\n"
                    + "6. Poistu\n"
            );
            Scanner scan = new Scanner(System.in);
            valinta = scan.nextInt();
            
            switch (valinta) {
                case 1:
                    team.addPlayer();
                    break;
                case 2:
                    team.removePlayer();
                    break;
                case 3:
                    team.listPlayer();
                    break;
                case 4:
                    team.trainPlayer();
                    break;
                case 5:
                    team.gamePlayer();
                    break;
                case 6:
                    System.out.println("Se on moro");
                    team.savePlayersToFile();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Väärä valinta");
            }
        }
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof Player) {
           
            System.out.println("'Manager' -> Hmmm: " +  ((Player)o).getName() + " has performed his training ");
        } else {
            System.out.println("Joku ihme hässäkkä");
        }
    }
}

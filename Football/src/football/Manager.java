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
public class Manager {

    Team team = new Team();
    Scanner scan = new Scanner(System.in);

    public Manager() {

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
                    + "6. Poistu\n"
            );

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
             /*        
                 case 4:
               
                 team.harjoittele();
                 case 5:
                 team.pelaaPeli();
                 */
                default:
            }
        }

    }

}

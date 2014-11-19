/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.util.List;
import java.util.Random;

/**
 *
 * @author mikaeade
 */
public class Game {

    private int team1Goals;
    private int team2Goals;

    public void setPlay() {

        // arvotaan kahden joukkueen tulossa 
        Random rn = new Random();

        team1Goals = rn.nextInt(5) + 1;
        team2Goals = rn.nextInt(5) + 1;

        if (team1Goals > team2Goals) {
            System.out.println("Voitettiiin: " + team1Goals + " : " + team2Goals);
        } else if (team1Goals == team2Goals) {

            System.out.println("Tasapeli: " + team1Goals + " : " + team2Goals);
        } else {
            System.out.println("Hävittiin: " + team1Goals + " : " + team2Goals);
        }
    }

    public Integer getHomeTeamGoals() {
        return team1Goals;
    }

    public Integer getVisitorTeamGoals() {
        return team2Goals;
    }
    
    public Integer getGoalScorer(int sizeOfTeam){
        Random rn = new Random();
        Integer scorer  = rn.nextInt(sizeOfTeam);
        if(scorer > sizeOfTeam)
            scorer = sizeOfTeam;
        return scorer; 
    
    }
}

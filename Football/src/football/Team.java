/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.audio.AudioPlayer.player;

/**
 * KoosteLuokka
 *
 * @author mikaeade
 */
public class Team implements Serializable {

    List<Player> players = new ArrayList<Player>();

    public Team() {
        try {
            // Lataa taulukkoon pelaajat
            LoadPlayersFromFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Team.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addPlayer() {

        // jokaiselle pelaajalle oma numero
        System.out.println("Anna pelipaikka");
        System.out.println("1. VasenHyokkääjä");
        System.out.println("2. KeskusHyökkääjä");
        System.out.println("3. OikeaHyökkääjä");
        System.out.println("4  Maalivahti");
        System.out.println("5. VasenPuolustaja");
        System.out.println("6. OikeaPuolustaja");

        Scanner scan_1 = new Scanner(System.in);
        scan_1.reset();
        Integer chosen = scan_1.nextInt();
        addPlayerName(chosen);
    }

    private void addPlayerName(Integer gamePlace) {
        Scanner scan_2 = new Scanner(System.in);
        System.out.println("Anna pelaajan Nimi: ");
        String name = scan_2.next();
        //String name = scan.nextLine();
        System.out.println("Anna pelaajan Numero: ");
        Integer numero = scan_2.nextInt();

        Player player = null;
        switch (gamePlace) {
            case 1:
                player = new VasenHyokkaaja();
                break;
            case 2:
                player = new KeskusHyokkaaja();
                break;
            case 3:
                player = new OikeaHyokkaaja();
                break;
            case 4:
                player = new Maalivahti();
                break;
            case 5:
                player = new VasenPuolustaja();
                break;
            case 6:
                player = new OikeaPuolustaja();
                break;
            default:
                System.out.println("Väärä valinta");
                System.exit(1);
        }
        if (player != null) {
            player.setName(name);
            player.setNumber(numero);
            player.setHarjoitusOhjelma();
            player.setHarjoitusAikaTaulu();
            players.add(player);
            // manager on singleton kysytään managerin instanssi!!
            player.registerObserver(Manager.getInstance());

        }
    }

    public void removePlayer() {
        Scanner scan = new Scanner(System.in);
        listPlayer();
        System.out.println("Anna erotettavan pelaajan Numero: ");
        Integer valinta = scan.nextInt();
        int index = -1;
        for (Player player : players) {
            if (player.getNumber().equals(valinta)) {
                index = players.indexOf(player);
            }
        }
        if (index >= 0) {
            players.remove(index);
        }
    }

    public void listPlayer() {

        System.out.println("---- List all Player ----");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void trainPlayer() {
        // listaa pelaajat ja voi valita numerolla ketä harjoittaa
        Scanner scan = new Scanner(System.in);
        listPlayer();
        System.out.println("Anna harjoitusta tarvitsevan pelaajan Numero: ");
        int index = -1;
        Integer valinta = scan.nextInt();
        for (Player player : players) {
            if (player.getNumber().equals(valinta)) {
                index = players.indexOf(player);
            }
        }
        if (index >= 0) {
            // manager on singleton kysytään managerin instanssi!!
            // players.get(index).registerObserver(Manager.getInstance());
            scan = new Scanner(System.in);
            System.out.println("Anna harjoituksen kesto: ");
            valinta = scan.nextInt();
            players.get(index).setHarjoitusAikaTaulu(valinta);
        }
    }

    public void gamePlayer() {
        Game game = new Game();
        game.setPlay();
        int totalGoals, index;
        //arvo maalintekijät
        for (int i = 0; i < game.getHomeTeamGoals(); i++) {
            // hae pelaajan indeksi, (random arvottu )
            index = game.getGoalScorer(players.size());
            totalGoals = ((players.get(index)).getScoredGoals()) + 1;
            (players.get(index)).setScoredGoals(totalGoals);
            System.out.println((players.get(index).getName() + " : scored a goal in the match"));
        }

    }

    public void LoadPlayersFromFile() throws IOException, ClassNotFoundException {

        File file = new File("/Users/mikaeade/Documents/Football2.txt");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(new File("/Users/mikaeade/Documents/Football2.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            players = (ArrayList) ois.readObject();
        }
    }

    public void savePlayersToFile() {

        File file = new File("/Users/mikaeade/Documents/Football2.txt");
        if (file.exists()) {
            file.delete();
        }
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(players);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Team.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}

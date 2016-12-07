/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omlympic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author benjamin
 */
public class Olympic {

    String line;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        new Olympic().fileRead();
    }

    public void fileRead() throws FileNotFoundException, IOException {
        File file = new File("Pairs.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Player[] players = new Player[20];
        while ((line = reader.readLine()) != null) {
            Player player1 = new Player();
            Player player2 = new Player();
            player1.setName(line);
            line = reader.readLine();
            player2.setName(line);
            line = reader.readLine();
            player1.setCountry(line);
            player2.setCountry(line);
            line = reader.readLine();
            player1.setScores(this.scoresConverter(line));
            line = reader.readLine();
            player2.setScores(this.scoresConverter(line));
            System.out.println(player1);
            System.out.println(player2);
        }

    }

    private double[] scoresConverter(String rawScores) {
        String[] rowScore = rawScores.split(" ");
        double[] scores = new double[rawScores.length()];
        for (int x = 0; x < 8; x++) {
            scores[x] = Double.parseDouble(rowScore[x]);
        }
        return scores;
    }

}

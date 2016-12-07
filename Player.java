/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omlympic;

/**
 *
 * @author benjamin
 */
public class Player {

    private String name, country;
    private double[] scores = new double[8];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String toString() {

        return "Player[name:"
                + name + ", country:" + country + ", " + scores + "]";
    }
}

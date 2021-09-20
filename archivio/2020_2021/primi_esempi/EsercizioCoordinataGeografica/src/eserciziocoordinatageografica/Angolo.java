/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziocoordinatageografica;

/**
 *
 * @author Alessandro Bugatti
 */
public class Angolo {
    
    private int gradi;
    private int primi;
    private double secondi; 

    public Angolo() {
    }
    
    public Angolo(int gradi, int primi, double secondi) {
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }
    
    public int getGradi() {
        return gradi;
    }

    public void setGradi(int gradi) {
        this.gradi = gradi;
    }

    public int getPrimi() {
        return primi;
    }

    public void setPrimi(int primi) {
        this.primi = primi;
    }

    public double getSecondi() {
        return secondi;
    }

    public void setSecondi(double secondi) {
        this.secondi = secondi;
    }

    @Override
    public String toString() {
        return "Angolo{" + "gradi=" + gradi + ", primi=" + primi + ", secondi=" + secondi + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_15_mattiateriaca;
import java.util.ArrayList;
/**
 *
 * @author itismeucci
 */
public class Viaggio {
    private String titolo;
    private double costo;
    private ArrayList<Giorno> gita;

    public Viaggio(String titolo, double costo) {
        this.titolo = titolo;
        this.costo = costo;
        this.gita = new ArrayList();
    }

    public String getTitolo() {
        return titolo;
    }

    public double getCosto() {
        return costo;
    }

    public ArrayList<Giorno> getGita() {
        return gita;
    }
    
    
    
}

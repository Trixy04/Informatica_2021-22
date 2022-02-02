/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_3;

import java.util.ArrayList; // import the ArrayList class

/**
 *
 * @author itismeucci
 */
public class Dipendente {
    
    private String nome;
    private String cognome;
    private double stipendio;
    private int matricola;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public int getMatricola() {
        return matricola;
    }
    
    
    
    //SET

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    
    
    //COSTRUTTORE
    public Dipendente() {
        this.nome = "";
        this.cognome = "";
        this.stipendio = 0;
        this.matricola = 0;
    }

    public Dipendente(String nome, String cognome, double stipendio, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
        this.matricola = matricola;
    }
    
    
    

    

    

    
            
            
    
}

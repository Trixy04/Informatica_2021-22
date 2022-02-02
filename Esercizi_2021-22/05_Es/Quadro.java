/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_5;

/**
 *
 * @author itismeucci
 */
public class Quadro {
    
    private String nomeQuadro;
    private int anno;
    private String autore;
    private double prezzo;

    //COSTRUTTORE
    public Quadro(String nomeQuadro, int anno, String autore, double prezzo) {
        this.nomeQuadro = nomeQuadro;
        this.anno = anno;
        this.autore = autore;
        this.prezzo = prezzo;
    }
    
    public Quadro(){
        this.nomeQuadro = "";
        this.anno = 0;
        this.autore = "";
        this.prezzo = 0;
    }
    
    //GET
    public String getNomeQuadro() {
        return nomeQuadro;
    }

    public int getAnno() {
        return anno;
    }

    public String getAutore() {
        return autore;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    //SET

    public void setNomeQuadro(String nomeQuadro) {
        this.nomeQuadro = nomeQuadro;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
   
    
    
    
}

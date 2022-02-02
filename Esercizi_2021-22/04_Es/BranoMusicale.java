/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_4;

/**
 *
 * @author itismeucci
 */
public class BranoMusicale {
    
    private String titoloBrano;
    private String autore;
    private String genere;
    private int anno;
    private int durata;

    //COSTRUTTORE

    public BranoMusicale() {
        this.titoloBrano = "";
        this.autore = "";
        this.genere = "";
        this.anno = 0;
        this.durata = 0;
    }
    
    
    public BranoMusicale(String titoloBrano, String autore, String genere, int anno, int durata) {
        this.titoloBrano = titoloBrano;
        this.autore = autore;
        this.genere = genere;
        this.anno = anno;
        this.durata = durata;
        
    }

    //GET
    public String getTitoloBrano() {
        return titoloBrano;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public int getAnno() {
        return anno;
    }

    public int getDurata() {
        return durata;
    }
    
    //SET 

    public void setTitoloBrano(String titoloBrano) {
        this.titoloBrano = titoloBrano;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
    
    
    
    
}

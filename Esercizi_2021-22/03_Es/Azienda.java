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
public class Azienda {
    
    private String nomeAzienda;
    private String indirizzoAzienda;
    private double fatturato;
    private ArrayList<Dipendente> dipendentiAzienda;

    //GET
    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public String getIndirizzoAzienda() {
        return indirizzoAzienda;
    }

    public double getFatturato() {
        return fatturato;
    }

    public ArrayList<Dipendente> getDipendentiAzienda() {
        return dipendentiAzienda;
    }
    
    //COSTRUTTORE
    public Azienda() {
        this.nomeAzienda = "";
        this.indirizzoAzienda = "";
        this.fatturato = 0;
        this.dipendentiAzienda= new ArrayList();
    }
    
    //SET
    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public void setIndirizzoAzienda(String indirizzoAzienda) {
        this.indirizzoAzienda = indirizzoAzienda;
    }

    public void setFatturato(double fatturato) {
        this.fatturato = fatturato;
    }
    
    public boolean addDipendente(Dipendente d1){
        return dipendentiAzienda.add(d1);
        
    }
    
    public void stampa(){
        for(int i = 0; i < dipendentiAzienda.size(); i++){
            System.out.println(dipendentiAzienda.get(i).getNome());
            System.out.println(dipendentiAzienda.get(i).getCognome());
            System.out.println(dipendentiAzienda.get(i).getStipendio());
            System.out.println(dipendentiAzienda.get(i).getMatricola());
            
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

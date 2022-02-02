/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocalcio;

/**
 *
 * @author Mattia
 */
public class Calciatore {
    private String nome;
    private String cognome;
    private String squadra;
    private int totGoal;
    private int valMercato;
    private int numPartite;
    
    //METODO COSTRUTTORE
    public Calciatore (){
        
        this.nome = "";
        this.cognome = "";
        this.squadra = "";
        this.totGoal = 0;
        this.valMercato = 0;
        this.numPartite = 0;
        
    }
    
    //GET
    public String getNome(){
        return nome;
    }
    public String getCogome(){
        return cognome;
    }
    public String getSquadra(){
        return squadra;
    }
    public int getTotGoal(){
        return totGoal;
    }
    public int getValMercato(){
        return valMercato;
    }
    public int getNumPartite(){
        return numPartite;
    }
    
    //SET

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public void setTotGoal(int totGoal) {
        this.totGoal = totGoal;
    }

    public void setValMercato(int valMercato) {
        this.valMercato = valMercato;
    }

    public void setNumPartite(int numPartite) {
        this.numPartite = numPartite;
    }
    

    
}

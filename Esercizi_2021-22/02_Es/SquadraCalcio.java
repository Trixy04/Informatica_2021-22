/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocalcio;
import java.util.ArrayList;

/**
 *
 * @author Mattia
 */
public class SquadraCalcio {
    
    private String nomeSquadra;
    private String presidente;
    private String allenatore;
    private String città;
    private double capitaleInziziale;
    private int puntiCampionato;
    private ArrayList<Calciatore> rosaCalciatori; //ARRAY GIOCATORI SQUADRA
    
    //GET
    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public String getPresidente() {
        return presidente;
    }

    public String getAllenatore() {
        return allenatore;
    }

    public String getCittà() {
        return città;
    }

    public double getCapitaleInziziale() {
        return capitaleInziziale;
    }

    public int getPuntiCampionato() {
        return puntiCampionato;
    }
    
    //SET
    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public void setAllenatore(String allenatore) {
        this.allenatore = allenatore;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setCapitaleInziziale(double capitaleInziziale) {
        this.capitaleInziziale = capitaleInziziale;
    }

    public void setPuntiCampionato(int puntiCampionato) {
        this.puntiCampionato = puntiCampionato;
    }
    
    
    //COSTRUTTORE
    public SquadraCalcio() {
        this.nomeSquadra = "";
        this.presidente = "";
        this.allenatore = "";
        this.città = "";
        this.capitaleInziziale = 0;
        this.puntiCampionato = 0;
        this.rosaCalciatori= new ArrayList();
    }
    
    //ADD
    public boolean addGiocatore(Calciatore nomeCalciatore){
       return rosaCalciatori.add(nomeCalciatore);
    }
    
    //METODO STAMPA
    public void stampa(){
        for(int i = 0; i < rosaCalciatori.size(); i++){
            System.out.println(rosaCalciatori.get(i).setNome());
        }
    }
    
        
         
    }
    
    
    
    
    


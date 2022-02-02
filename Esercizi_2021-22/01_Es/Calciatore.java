/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calciatore;

/**
 *
 * @author itismeucci
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
        
        nome = "";
        cognome = "";
        squadra = "";
        totGoal = 0;
        valMercato = 0;
        numPartite = 0;
        
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
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCognome(String cognome){
        this.nome = nome;
    }
    public void setSquadra(String squadra){
        this.squadra = squadra;
    }
    public void setTotGoal(int totGoal){
        this.totGoal = totGoal;
    }
    public void setValMercato(int valMercato){
        this.valMercato = valMercato;
    }
    public void setNumPartite(int numPartite){
        this.numPartite = numPartite;
    }
    
    //
    public void partitaDisputata(int goalFatti){
    
    numPartite =+ 1;
    totGoal =+ goalFatti;
    valMercato = valMercato + (1/(valMercato * 100));
    
    }
    
    public float mediaGoalpartita(){
        
    float media = totGoal / numPartite; 
    return media;
    }
    
    public void StampaInformazioni(){
        
        System.out.println("Nome calciatore: " + nome);
        System.out.println("Cognome calciatore: " + cognome);
        System.out.println("Squadra del calciatore: " + squadra);
        System.out.println("Goal totali del calciatore: " + totGoal); 
        System.out.println("Valore di mercato del calciatore: " + valMercato);
        System.out.println("Partite giocate dal calciatore: " + numPartite);
        System.out.println("Media goal calciatore: " + mediaGoalpartita()); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_16_mattiateriaca;

/**
 *
 * @author itismeucci
 */
public abstract class Riparazione {
    private String dataRiparazione;
    private Chiamata c;
    private String nomeTecnico;
    private String descProdotto;
    private String descIntervento;
    private double costoMateriale;
    private double tempoImpiegato;
    private String numPratica;

    public Riparazione(String dataRiparazione, Chiamata c, String nomeTecnico, String descProdotto, String descIntervento, double costoMateriale, double tempoImpiegato, String numPratica) {
        this.dataRiparazione = dataRiparazione;
        this.c = new Chiamata(dataRiparazione, nomeTecnico, descIntervento);
        this.nomeTecnico = nomeTecnico;
        this.descProdotto = descProdotto;
        this.descIntervento = descIntervento;
        this.costoMateriale = costoMateriale;
        this.tempoImpiegato = tempoImpiegato;
        this.numPratica = numPratica;
    }
    
    public abstract double Spesa();

    public String getDataRiparazione() {
        return dataRiparazione;
    }

    public Chiamata getC() {
        return c;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public String getDescProdotto() {
        return descProdotto;
    }

    public String getDescIntervento() {
        return descIntervento;
    }

    public double getCostoMateriale() {
        return costoMateriale;
    }

    public double getTempoImpiegato() {
        return tempoImpiegato;
    }

    public String getNumPratica() {
        return numPratica;
    }

    public void setDataRiparazione(String dataRiparazione) {
        this.dataRiparazione = dataRiparazione;
    }

    public void setC(Chiamata c) {
        this.c = c;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public void setDescProdotto(String descProdotto) {
        this.descProdotto = descProdotto;
    }

    public void setDescIntervento(String descIntervento) {
        this.descIntervento = descIntervento;
    }

    public void setCostoMateriale(double costoMateriale) {
        this.costoMateriale = costoMateriale;
    }

    public void setTempoImpiegato(double tempoImpiegato) {
        this.tempoImpiegato = tempoImpiegato;
    }

    public void setNumPratica(String numPratica) {
        this.numPratica = numPratica;
    }
    
    
    
    
}

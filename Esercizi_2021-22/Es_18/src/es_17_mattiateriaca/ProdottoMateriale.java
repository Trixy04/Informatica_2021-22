/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_17_mattiateriaca;

/**
 *
 * @author itismeucci
 */
public abstract class  ProdottoMateriale extends ProdottoGenerico{
    private double larghezza;
    private double altezza;
    private double profondita;
    private double peso;

    public ProdottoMateriale(double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        super(prezzoAcquisto, prezzoVendita, iva, descrizione);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
        this.peso = peso;
    }

    public ProdottoMateriale(double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto) {
        super(prezzoAcquisto);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
        this.peso = peso;
    }

    public ProdottoMateriale(double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto, double prezzoVendita) {
        super(prezzoAcquisto, prezzoVendita);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getProfondita() {
        return profondita;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }
    
    public double calcolaVolume(){
        double volume;
        volume = larghezza * profondita * altezza;
        return volume;
    }
    
    public double calcolaSuperficieCmq(){
        double superficie;
        superficie = larghezza * profondita;
        return superficie;
    }
    
    public double calcolaSuperficieMq(){
        double superficie;
        superficie = (larghezza * profondita)/10000;
        return superficie;
    }

    @Override
    public String toString() {
        return "ProdottoMateriale{" + "larghezza=" + larghezza + ", altezza=" + altezza + ", profondita=" + profondita + ", peso=" + peso + '}';
    }
    
    
}

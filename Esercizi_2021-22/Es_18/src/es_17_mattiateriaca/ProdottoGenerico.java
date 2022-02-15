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
public abstract class ProdottoGenerico {
    private double prezzoAcquisto;
    private double prezzoVendita;
    private int iva;
    private String descrizione;
    private static int generatoreCodice = 0;
    private int codiceProdotto;

    
    public int generaCodice(){
        return generatoreCodice++;
    }
    
    public ProdottoGenerico(double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.iva = iva;
        this.descrizione = descrizione;
        this.codiceProdotto = generaCodice();
    }
    
    public ProdottoGenerico(double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = 0;
        this.iva = 0;
        this.descrizione = "Inserisci la descrizione";
        this.codiceProdotto = generaCodice();
    }
    
    public ProdottoGenerico(double prezzoAcquisto, double prezzoVendita) {
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.iva = 0;
        this.descrizione = "Inserisci la descrizione";
        this.codiceProdotto = generaCodice();
    }
    
    public double getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(double prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public double getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(double prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    //SU PREZZO ACQUISTO
    public double incasso(){
        double tot;
        tot = prezzoAcquisto + (iva * prezzoAcquisto/100);
        return tot;
    }
    
    public double incassoSconto(double sconto){
        double tot;
        tot = prezzoAcquisto + (iva * prezzoAcquisto/100) - (sconto*prezzoAcquisto/100);
        return tot;
    }
    
    //SU PREZZO VENDITA 
    public double ricavo(){
        double tot;
        tot = prezzoVendita - prezzoAcquisto + (iva * prezzoAcquisto/100);
        return tot;
    }
    
    public double ricavoSconto(double sconto){
        double tot;
        tot = prezzoVendita - prezzoAcquisto + (iva * prezzoAcquisto/100) - (sconto*prezzoAcquisto/100);
        return tot;
    }

    @Override
    public String toString() {
        return "ProdottoGenerico{" + "prezzoAcquisto=" + prezzoAcquisto + ", prezzoVendita=" + prezzoVendita + ", iva=" + iva + ", descrizione=" + descrizione + '}';
    }
    
    
}

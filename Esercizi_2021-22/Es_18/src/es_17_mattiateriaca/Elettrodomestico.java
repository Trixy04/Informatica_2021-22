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
public class Elettrodomestico extends ProdottoMateriale{
    private String classeEnergetica;
    private boolean daIncasso;

    public Elettrodomestico(String classeEnergetica, boolean daIncasso, double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto, prezzoVendita, iva, descrizione);
        this.classeEnergetica = classeEnergetica;
        this.daIncasso = daIncasso;
    }

    public Elettrodomestico(String classeEnergetica, boolean daIncasso, double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto);
        this.classeEnergetica = classeEnergetica;
        this.daIncasso = daIncasso;
    }

    public Elettrodomestico(String classeEnergetica, boolean daIncasso, double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto, double prezzoVendita) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto, prezzoVendita);
        this.classeEnergetica = classeEnergetica;
        this.daIncasso = daIncasso;
    }

    public boolean isDaIncasso() {
        return daIncasso;
    }

    public void setDaIncasso(boolean daIncasso) {
        this.daIncasso = daIncasso;
    }

    public String getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(String classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }
    
    
    
}

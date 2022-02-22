/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_19_mattiateriaca;

/**
 *
 * @author itismeucci
 */
public class Pazienti {
    private String nome;
    private String cognome;
    private String codFiscale;
    private boolean figli;
    
    private Gravita g;
    private Reparto r;
    private Stanze s;
    
    private int durataRicovero;

    public Pazienti(int durataRicovero, String nome, String cognome, String codFiscale, boolean figli, Gravita g, Reparto r, Stanze s) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFiscale = codFiscale;
        this.figli = figli;
        this.g = g;
        this.r = r;
        this.s = s;
        this.durataRicovero = durataRicovero;
    }

    Pazienti() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Stanze getS() {
        return s;
    }

    public void setS(Stanze s) {
        this.s = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public boolean isFigli() {
        return figli;
    }

    public void setFigli(boolean figli) {
        this.figli = figli;
    }

    public Gravita getG() {
        return g;
    }

    public void setG(Gravita g) {
        this.g = g;
    }

    public Reparto getR() {
        return r;
    }

    public void setR(Reparto r) {
        this.r = r;
    }
    
    
}

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
public class Infermieri extends Personale{
    private Reparto r;

    public Infermieri(Reparto r, String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale, matricola);
        this.r = r;
    }

    Infermieri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reparto getR() {
        return r;
    }

    public void setR(Reparto r) {
        this.r = r;
    }

    
    
    
}

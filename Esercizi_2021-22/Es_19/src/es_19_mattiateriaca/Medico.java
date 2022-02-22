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
public class Medico extends Personale{

    public Medico(String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale, matricola);
    }

    Medico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

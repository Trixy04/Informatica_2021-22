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
public class Es_19_MattiaTeriaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Degenze listaDegenze = new Degenze("Careggi");
        Medico m = new Medico();
        Pazienti p = new Pazienti();
        Infermieri i = new Infermieri();
        Ricoveri r = new Ricoveri(m, p, i);
    }
    
}

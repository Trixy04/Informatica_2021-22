/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocalcio;

/**
 *
 * @author Mattia
 */
public class EsercizioCalcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SquadraCalcio s1 = new SquadraCalcio();
        Calciatore c1 = new Calciatore();
        
        s1.setNomeSquadra("Roma");
        s1.setAllenatore("Morhino");
        
        c1.setNome("Bho");
        
        s1.addGiocatore(c1);
        
        s1.stampa();
        
        
        
        
    }
    
}

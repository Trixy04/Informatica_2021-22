/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_15_mattiateriaca;
import java.util.ArrayList;
/**
 *
 * @author itismeucci
 */
public class Giorno {
    private int numeroOrdine;
    private String luogo;
    private String descrizione;

    public Giorno(int numeroOrdine, String luogo, String descrizione) {
        this.numeroOrdine = numeroOrdine;
        this.luogo = luogo;
        this.descrizione = descrizione;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getDescrizione() {
        return descrizione;
    }
    
    
}

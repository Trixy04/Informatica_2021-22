/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_15_mattiateriaca;

/**
 *
 * @author itismeucci
 */
public class ViaggioGruppi extends Giorno{
    private int numMax;
    private int numMin;

    public ViaggioGruppi(int numMax, int numMin, int numeroOrdine, String luogo, String descrizione) {
        super(numeroOrdine, luogo, descrizione);
        this.numMax = numMax;
        this.numMin = numMin;
    }
    
    
    
    
}

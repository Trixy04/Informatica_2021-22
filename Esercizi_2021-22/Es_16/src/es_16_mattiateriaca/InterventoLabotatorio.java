/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_16_mattiateriaca;

/**
 *
 * @author itismeucci
 */
public class InterventoLabotatorio extends Riparazione{
    private String dataRitiro;
    private static double fixTaxMIN;

    public InterventoLabotatorio(String dataRitiro, String dataRiparazione, Chiamata c, String nomeTecnico, String descProdotto, String descIntervento, String numPratica, double costoMateriale, double tempoImpiegato) {
        super(dataRiparazione, c, nomeTecnico, descProdotto, descIntervento, costoMateriale, tempoImpiegato, numPratica);
        this.dataRitiro = dataRitiro;
        this.fixTaxMIN = 1.5;
    }
    
    @Override
    public double Spesa(){
        double tot = 0;
        tot = getCostoMateriale() + (getTempoImpiegato() * fixTaxMIN);
        return tot;
    }
    
    
}

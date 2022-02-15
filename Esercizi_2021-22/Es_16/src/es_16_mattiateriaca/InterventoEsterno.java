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
public class InterventoEsterno extends Riparazione{
    private String indirizzoCliente;
    private double distanzaSede;
    private static double fixTaxKM;
    private static double fixTaxMIN;

    public InterventoEsterno(String indirizzoCliente, double distanzaSede, String dataRiparazione, Chiamata c, String nomeTecnico, String descProdotto, String descIntervento, String numPratica, double costoMateriale, double tempoImpiegato, double fixTaxKM, double fixtaxMIN) {
        super(dataRiparazione, c, nomeTecnico, descProdotto, descIntervento, costoMateriale, tempoImpiegato, numPratica);
        this.indirizzoCliente = indirizzoCliente;
        this.distanzaSede = distanzaSede;
        this.fixTaxKM = 1.5;
        this.fixTaxMIN = 1.2;
    }
    
    @Override
    public double Spesa(){
        double tot = 0;
        tot = getCostoMateriale() + (getTempoImpiegato() * fixTaxMIN) + (distanzaSede * fixTaxKM);
        return tot;
    }
}

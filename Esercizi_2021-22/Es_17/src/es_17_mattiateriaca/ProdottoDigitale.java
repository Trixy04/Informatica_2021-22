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
public abstract class ProdottoDigitale extends ProdottoGenerico{
    
    private double dimensioneByte;
    private String processoRichiesto;
    private String ramRichiesta;

    public ProdottoDigitale(double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        super(prezzoAcquisto, prezzoVendita, iva, descrizione);
        this.dimensioneByte = dimensioneByte;
        this.processoRichiesto = processoRichiesto;
        this.ramRichiesta = ramRichiesta;
    }

    public ProdottoDigitale(double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto) {
        super(prezzoAcquisto);
        this.dimensioneByte = dimensioneByte;
        this.processoRichiesto = processoRichiesto;
        this.ramRichiesta = ramRichiesta;
    }

    public ProdottoDigitale(double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto, double prezzoVendita) {
        super(prezzoAcquisto, prezzoVendita);
        this.dimensioneByte = dimensioneByte;
        this.processoRichiesto = processoRichiesto;
        this.ramRichiesta = ramRichiesta;
    }

    public String getRamRichiesta() {
        return ramRichiesta;
    }

    public void setRamRichiesta(String ramRichiesta) {
        this.ramRichiesta = ramRichiesta;
    }

    public double getDimensioneByte() {
        return dimensioneByte;
    }

    public void setDimensioneByte(double dimensioneByte) {
        this.dimensioneByte = dimensioneByte;
    }

    public String getProcessoRichiesto() {
        return processoRichiesto;
    }

    public void setProcessoRichiesto(String processoRichiesto) {
        this.processoRichiesto = processoRichiesto;
    }

    @Override
    public String toString() {
        return "ProdottoDigitale{" + "dimensioneByte=" + dimensioneByte + ", processoRichiesto=" + processoRichiesto + ", ramRichiesta=" + ramRichiesta + '}';
    }
    
    
    
    
    
}

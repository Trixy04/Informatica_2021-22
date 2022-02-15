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
public class LibroDigitale extends ProdottoDigitale{
    private String formato;

    public LibroDigitale(String formato, double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        super(dimensioneByte, processoRichiesto, ramRichiesta, prezzoAcquisto, prezzoVendita, iva, descrizione);
        this.formato = formato;
    }

    public LibroDigitale(String formato, double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto) {
        super(dimensioneByte, processoRichiesto, ramRichiesta, prezzoAcquisto);
        this.formato = formato;
    }

    public LibroDigitale(String formato, double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto, double prezzoVendita) {
        super(dimensioneByte, processoRichiesto, ramRichiesta, prezzoAcquisto, prezzoVendita);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
     
}

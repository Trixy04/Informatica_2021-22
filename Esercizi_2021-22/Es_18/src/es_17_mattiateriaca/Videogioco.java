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
public class Videogioco extends ProdottoDigitale{
    private int qtaGiocatori;
    private String descrizioneGioco;

    public Videogioco(int qtaGiocatori, String descrizioneGioco, double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        super(dimensioneByte, processoRichiesto, ramRichiesta, prezzoAcquisto, prezzoVendita, iva, descrizione);
        this.qtaGiocatori = qtaGiocatori;
        this.descrizioneGioco = descrizioneGioco;
    }

    public Videogioco(int qtaGiocatori, String descrizioneGioco, double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto) {
        super(dimensioneByte, processoRichiesto, ramRichiesta, prezzoAcquisto);
        this.qtaGiocatori = qtaGiocatori;
        this.descrizioneGioco = descrizioneGioco;
    }

    public Videogioco(int qtaGiocatori, String descrizioneGioco, double dimensioneByte, String processoRichiesto, String ramRichiesta, double prezzoAcquisto, double prezzoVendita) {
        super(dimensioneByte, processoRichiesto, ramRichiesta, prezzoAcquisto, prezzoVendita);
        this.qtaGiocatori = qtaGiocatori;
        this.descrizioneGioco = descrizioneGioco;
    }

    public String getDescrizioneGioco() {
        return descrizioneGioco;
    }

    public void setDescrizioneGioco(String descrizioneGioco) {
        this.descrizioneGioco = descrizioneGioco;
    }

    public int getQtaGiocatori() {
        return qtaGiocatori;
    }

    public void setQtaGiocatori(int qtaGiocatori) {
        this.qtaGiocatori = qtaGiocatori;
    }
    
    
}

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
public class LibroCartaceo extends ProdottoMateriale implements ILibro{
    private boolean copertinaRigida;
    private String descrizioneRilegatura;
    private Autore autore;
    private String genere;
    private int numPagine;
    private String casaEditrice;

    public LibroCartaceo(boolean copertinaRigida, String descrizioneRilegatura, String nome, String cognome, String genere, int numPagine, String casaEditrice, double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto, double prezzoVendita, int iva, String descrizione) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto, prezzoVendita, iva, descrizione);
        this.copertinaRigida = copertinaRigida;
        this.descrizioneRilegatura = descrizioneRilegatura;
        this.autore = new Autore(nome, cognome);
        this.genere = genere;
        this.numPagine = numPagine;
        this.casaEditrice = casaEditrice;
    }

    public LibroCartaceo(boolean copertinaRigida, String descrizioneRilegatura, String nome, String cognome, String genere, int numPagine, String casaEditrice, double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto);
        this.copertinaRigida = copertinaRigida;
        this.descrizioneRilegatura = descrizioneRilegatura;
        this.autore = new Autore(nome, cognome);
        this.genere = genere;
        this.numPagine = numPagine;
        this.casaEditrice = casaEditrice;
    }

    public LibroCartaceo(boolean copertinaRigida, String descrizioneRilegatura, String nome, String cognome, String genere, int numPagine, String casaEditrice, double larghezza, double altezza, double profondita, double peso, double prezzoAcquisto, double prezzoVendita) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto, prezzoVendita);
        this.copertinaRigida = copertinaRigida;
        this.descrizioneRilegatura = descrizioneRilegatura;
        this.autore = new Autore(nome, cognome);
        this.genere = genere;
        this.numPagine = numPagine;
        this.casaEditrice = casaEditrice;
    }

    public String getDescrizioneRilegatura() {
        return descrizioneRilegatura;
    }

    public void setDescrizioneRilegatura(String descrizioneRilegatura) {
        this.descrizioneRilegatura = descrizioneRilegatura;
    }

    public boolean isCopertinaRigida() {
        return copertinaRigida;
    }

    public void setCopertinaRigida(boolean copertinaRigida) {
        this.copertinaRigida = copertinaRigida;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    @Override
    public Autore getAutore() {
        return autore; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPagine() {
       return numPagine;
    }

    @Override
    public String getCasaEditrice() {
        return casaEditrice;
    }

    @Override
    public String getGenere() {
        return genere;
    }
    
    
}

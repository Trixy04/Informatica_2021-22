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
public class Chiamata {
    private String dataArrivo;
    private String nomeCognome;
    private String recTelefono;

    public Chiamata(String dataArrivo, String nomeCognome, String recTelefono) {
        this.dataArrivo = dataArrivo;
        this.nomeCognome = nomeCognome;
        this.recTelefono = recTelefono;
    }

    public String getDataArrivo() {
        return dataArrivo;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public String getRecTelefono() {
        return recTelefono;
    }
    
    
    

    
}

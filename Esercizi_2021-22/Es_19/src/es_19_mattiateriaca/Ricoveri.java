/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_19_mattiateriaca;
/**
 *
 * @author itismeucci
 */
public class Ricoveri {
    private Medico medico;
    private Pazienti paziente;
    private Infermieri infermiere;

    public Ricoveri(Medico medico, Pazienti paziente, Infermieri infermiere) {
        this.medico = medico;
        this.paziente = paziente;
        this.infermiere = infermiere;
    }

    public Infermieri getInfermiere() {
        return infermiere;
    }

    public void setInfermiere(Infermieri infermiere) {
        this.infermiere = infermiere;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Pazienti getPaziente() {
        return paziente;
    }

    public void setPaziente(Pazienti paziente) {
        this.paziente = paziente;
    }

    
}

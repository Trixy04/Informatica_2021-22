/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_19_mattiateriaca;
import java.util.ArrayList;
/**
 *
 * @author itismeucci
 */
public class Degenze {
    private String nomeOspedale;
    private ArrayList<Ricoveri> degenze;

    public Degenze(String nomeOspedale) {
        this.nomeOspedale = nomeOspedale;
        this.degenze = new ArrayList();
    }

    public ArrayList<Ricoveri> getDegenze() {
        return degenze;
    }

    public void setDegenze(ArrayList<Ricoveri> degenze) {
        this.degenze = degenze;
    }

    public String getNomeOspedale() {
        return nomeOspedale;
    }

    public void setNomeOspedale(String nomeOspedale) {
        this.nomeOspedale = nomeOspedale;
    }
    
    public int research(String codFiscale){
        for(int i = 0; i < degenze.size(); i++){
            if(degenze.get(i).getPaziente().getCodFiscale().equals(codFiscale)){
                return -1;
            }else{
                return i;
            }
        }
        return -1;
    }
    
    public boolean addRicovero(Ricoveri r){
        if(research(r.getPaziente().getCodFiscale()) == -1){
            degenze.add(r);
            return true;
        }
        return false;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_16_mattiateriaca;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author itismeucci
 */
public class Laboratorio implements Comparable<Object>{
    private ArrayList<Riparazione> listaRiparazioni;
    private String indirizzoLab;
    private String nomeLab;

    public Laboratorio(String indirizzoLab, String nomeLab) {
        this.indirizzoLab = indirizzoLab;
        this.nomeLab = nomeLab;
        this.listaRiparazioni = new ArrayList();
    }
    
    public int research(String pratica){
        for(int i = 0; i < listaRiparazioni.size(); i ++){
            if(listaRiparazioni.get(i).getNumPratica().equals(pratica))
                return i;
        }
        return -1;
    }
    
    public boolean addRiparazione(Riparazione r){
        if(research(r.getNumPratica()) == -1){
            listaRiparazioni.add(r);
            return true;
        }
        return false;
    }
    
    public boolean modificaTempi(String pratica, double tempo, double costo){
        if(research(pratica) != -1){
            listaRiparazioni.get(research(pratica)).setCostoMateriale(costo);
            listaRiparazioni.get(research(pratica)).setTempoImpiegato(tempo);
            return true;
        }
        return false;
    }
    
    public double totCostoAllRiparazioni(){
        double totale = 0;
        InterventoEsterno out;
        InterventoLabotatorio in;
        for(int i = 0; i < listaRiparazioni.size(); i++){
            if(listaRiparazioni.get(i) instanceof InterventoEsterno){
                out = (InterventoEsterno)listaRiparazioni.get(i);
                totale = totale + out.Spesa();
            }else{
                in = (InterventoLabotatorio)listaRiparazioni.get(i);
                totale = totale + in.Spesa();
            }
        }
        return totale;
    }
    
    public double calcolaSpesaGiorno(String giorno){
        double totale = 0;
        InterventoEsterno out;
        InterventoLabotatorio in;
        for(int i = 0; i < listaRiparazioni.size(); i++){
            if(listaRiparazioni.get(i).getDataRiparazione().equals(giorno)){
                if(listaRiparazioni.get(i) instanceof InterventoEsterno){
                out = (InterventoEsterno)listaRiparazioni.get(i);
                totale = totale + out.Spesa();
            }else{
                in = (InterventoLabotatorio)listaRiparazioni.get(i);
                totale = totale + in.Spesa();
            }
            }
        }
        return totale;
    }
    
    public ArrayList elencoInterventi(){
        ArrayList<Riparazione> lista = new ArrayList();
    
   

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es_5;

import java.util.ArrayList;

/**
 *
 * @author itismeucci
 */
public class GalleriaArte {
    
    private String nomeGalleria;
    private String indirizzo;
    private ArrayList<Quadro> collezione;
    
    //COSTRUTTORE
    public GalleriaArte(String nomeGalleria, String indirizzo, ArrayList<Quadro> collezione) {
        this.nomeGalleria = nomeGalleria;
        this.indirizzo = indirizzo;
        this.collezione = new ArrayList();
    }
    
    public GalleriaArte(){
        this.nomeGalleria = "";
        this.indirizzo = "";
    }
    
    //GET
    public String getNomeGalleria() {
        return nomeGalleria;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Quadro> getCollezione() {
        return collezione;
    }
    
    
    
    //METODI
    public boolean aggiungiQuadro (Quadro q){
        
        if(ricercaQuadro(q) == false){
            collezione.add(q);
                return true;
        }    
        return false;       
    }
    
    public boolean ricercaQuadro(Quadro q){
        
        for(int i = 0; i < collezione.size(); i++){
            if(collezione.get(i).getNomeQuadro().equals(q.getNomeQuadro())){
                return true;
            }
        }
        return false;
    }
    
    public int prezzoQuadro(int anno){
        
        int conta = 0;
        for(int i = 0; i < collezione.size(); i++){
            if(collezione.get(i).getAnno()> anno){
            conta += collezione.get(i).getPrezzo();
        }
        }
        return conta;
    }
    
    public int quadriAutore(String cognomeAutore){
        
        int contaQuadri = 0;
        for(int i = 0; i < collezione.size(); i++){
            if(collezione.get(i).getAutore().equals(cognomeAutore)){
                contaQuadri++;
            }
        }
        return contaQuadri;
    }
    
    public ArrayList<Quadro> prezzoCompreso(String autore, int p){
        
        ArrayList<Quadro> c1 = new ArrayList();
        
        for(int i = 0; i < collezione.size(); i++){
            if(collezione.get(i).getAutore().equals(autore)){
                if(collezione.get(i).getPrezzo() < p){
                    c1.add(collezione.get(i));
                }
            }
        }
        return c1;
    }
}
    
    /*
    
    public Quadro quadroPiuVecchio(){
        
        Quadro q1 = collezione.get(0);
        
        for(int i = 0; i < collezione.size(); i++){
            if(q1.getAnno() < collezione.get(i).getAnno()){
                else if(e)
                q1 = collezione.get(i).
            }
        }
    }
    
    
}

*/

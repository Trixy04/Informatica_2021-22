/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package es_4;

/**
 *
 * @author itismeucci
 */

import java.util.ArrayList;

public class CDAudio {
    
    private String nomeCd;
    ArrayList<BranoMusicale> playlist;
    ArrayList<BranoMusicale> braniGenere;

    //COSTRUTTORE
    public CDAudio() {
        playlist = new ArrayList();
        this.nomeCd = "";
    }
    
    //METODI
    public boolean aggiungiBrano(BranoMusicale brano){
        
        if(search(brano.getTitoloBrano()) == null){
            playlist.add(brano);
            return true;
        }
        
        return false;
    }
    
     public boolean cancellaBrano(String titolo){
        
         BranoMusicale b1 = search(titolo);
         
         if(b1 == null){
             return false;
         }
         
        playlist.remove(b1); //RIMOZIONE
        return true;
    }
     
    public BranoMusicale search(String titolo){
         
        for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getTitoloBrano().equals(titolo))
                return playlist.get(i);
        }
        
        return null;
    }
    
    public void modificaBrano(BranoMusicale nuovoBrano){
        
        BranoMusicale b2 = search(nuovoBrano.getTitoloBrano());
        
        b2.setAnno(nuovoBrano.getAnno());
        b2.setAutore(nuovoBrano.getAutore());
        b2.setDurata(nuovoBrano.getDurata());
        b2.setGenere(nuovoBrano.getGenere());
     
    }
    
    public int contaBrani(int anno){
        
        int contaBraniAnni = 0;
        
        for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getAnno() == anno){
                contaBraniAnni++;
            }
        } 
        return contaBraniAnni;
    }
    
    public int contaBrani(String autore){
        
        int contaBraniAutore = 0;
        
        for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getAutore().equals(autore)){
                contaBraniAutore++;
            }
        }
         return contaBraniAutore;
    }
    
    public BranoMusicale maxDurata(){
        
        BranoMusicale b3 = playlist.get(0);
        
        for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getDurata() > b3.getDurata()){
                b3 = playlist.get(i);
            }
        }
        return b3;
    }
    
    public ArrayList<BranoMusicale> braniGenere(String genere){
        
        ArrayList<BranoMusicale> braniGenere = new ArrayList();
        
       for(int i = 0; i < playlist.size(); i++){
            if(playlist.get(i).getGenere().equals(genere)){
                braniGenere.add(playlist.get(i));
            }
        }
        return braniGenere;
          
    }
    
    public CDAudio unisciCD(CDAudio cd){
        
    }
    
    public CDAudio braniComuni(CDAudio cd){
        
    }
    
    
    
    
    
}

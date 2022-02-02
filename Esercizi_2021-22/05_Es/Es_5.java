/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es_5;

import java.util.ArrayList;


/**
 *
 * @author itismeucci
 */
public class Es_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Quadro q1 = new Quadro();
        Quadro q2 = new Quadro();
        Quadro q3 = new Quadro();
        
        GalleriaArte c1 = new GalleriaArte();
        
        //ASSEGNA
        q1.setAutore("Picazzo");
        q1.setAnno(1937);
        q1.setNomeQuadro("Guernica");
        q1.setPrezzo(104000000);
        
        q2.setAutore("Picazzo");
        q2.setAnno(1936);
        q2.setNomeQuadro("NonLoSo");
        q2.setPrezzo(1205000);
        
        q3.setAutore("Picazzo");
        q3.setAnno(1938);
        q3.setNomeQuadro("BHO");
        q3.setPrezzo(85036);
        
        c1.aggiungiQuadro(q1);
        c1.aggiungiQuadro(q2);
        c1.aggiungiQuadro(q3);

        //METODI
        System.out.println(c1.prezzoQuadro(1937));
    }
    
}

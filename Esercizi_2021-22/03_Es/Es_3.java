/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es_3;

/**
 *
 * @author itismeucci
 */
import java.util.Scanner;  // Import the Scanner class

public class Es_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int scelta;
        String appoggio;
        Azienda a1 = new Azienda();
        Menu stampa1 = new Menu();
        Dipendente dip;
        Scanner input = new Scanner(System.in);
        
        
        
        dip = new Dipendente("Mario", "Rossi", 1300, 1011);
        a1.addDipendente(dip);
        
        a1.stampa();
    }
}
  
        
    

    

   
        
        
    
    
  
    
    
   
    
   
    
    


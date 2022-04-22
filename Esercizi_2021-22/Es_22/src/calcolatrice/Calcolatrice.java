/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;

import javax.swing.JFrame;

/**
 *
 * @author itismeucci
 */
public class Calcolatrice
{  
    public static void main(String[] args){
        
      CalcolatriceFinestra calc = new CalcolatriceFinestra("Calc");
      calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      calc.setSize(500,500);
      calc.setVisible(true);
    }
    
}

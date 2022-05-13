/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_mattiateriaca;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author itismeucci
 */
public class StampaApp_GUI extends JFrame{
     private JFrame frame;
    private Container contenitore;
    private JLabel esitoL;
    
    public StampaApp_GUI(String x){
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.esitoL = new JLabel(x);
        
        this.frame.setTitle("Lista Appuntamenti");
        this.contenitore.setLayout(new FlowLayout());
        
        this.frame.pack();
        this.frame.setSize(200, 90);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.frame.setResizable(false);
        
        this.frame.add(this.contenitore);
        this.esitoL.setPreferredSize(new Dimension(200, 40));
        this.contenitore.add(this.esitoL);
        
        this.esitoL.setHorizontalAlignment(SwingConstants.CENTER);
        this.frame.setVisible(false);
    }
    
    public JFrame getFrame(){
        return this.frame;
    }
}

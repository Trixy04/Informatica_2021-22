/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_mattiateriaca;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author itismeucci
 */
public class Home_GUI extends JFrame{
    private JFrame frame;
    private Container contenitore;
    private JLabel titoloL;
    private JButton inserisciB;
    private JButton rimuoviB;
    private Inserimento_GUI insGui;
    private Rimuovi_GUI rimGui;
    
    public Home_GUI(){
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.titoloL = new JLabel("Benvenuto nella Home del programma");
        this.inserisciB = new JButton("Inserisci");
        this.rimuoviB = new JButton("Rimuovi");
        this.insGui = new Inserimento_GUI();
        this.rimGui = new Rimuovi_GUI();
        
        
        this.contenitore.setLayout(new FlowLayout());
        this.frame.setTitle("Home");
        
        this.frame.pack();
        this.frame.setSize(250, 120);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        
        this.inserisciB.addActionListener((e) -> {
            this.insGui.getFrame().setVisible(true);
        });
        
        this.rimuoviB.addActionListener((ae) -> {
            this.rimGui.getFrame().setVisible(true);
        });
        
        this.frame.add(this.contenitore);
        this.titoloL.setPreferredSize(new Dimension(250, 40));
        this.contenitore.add(this.titoloL);
        this.contenitore.add(this.rimuoviB);
        this.contenitore.add(this.inserisciB);
        
        this.titoloL.setHorizontalAlignment(SwingConstants.CENTER);
        this.frame.setVisible(true);
    }
}

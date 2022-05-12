/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificagui_4b;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Mattia
 */
public class Home_GUI extends JFrame{
    
    private JFrame frame;
    private Container contenitore;
    private JLabel titolo;
    private JButton inserisci;
    private JButton ricerca;
    private Inserimento_GUI ins;
    
    public Home_GUI(){
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.contenitore.setLayout(new FlowLayout());
        this.titolo = new JLabel("Benvenuto nella Home del programma");
        this.ricerca = new JButton("Ricerca");
        this.inserisci = new JButton("Inserisci");
        this.ins = new Inserimento_GUI();
        
        this.frame.pack();
        this.frame.setSize(300, 100);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setResizable(false);
        
        this.frame.setTitle("Home");
        
        this.inserisci.addActionListener((e) -> {
            this.ins.getFrame().setVisible(true);
        });
        
        this.frame.add(this.contenitore);
        this.contenitore.add(titolo);
        this.titolo.setPreferredSize(new Dimension(frame.getX(), 20));
        this.titolo.setHorizontalAlignment(SwingConstants.CENTER);
        this.contenitore.add(ricerca);
        this.contenitore.add(inserisci);
    }
    
}

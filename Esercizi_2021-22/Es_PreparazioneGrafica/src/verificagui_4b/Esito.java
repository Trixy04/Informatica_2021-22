/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificagui_4b;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Mattia
 */
public class Esito extends JFrame{
    private JFrame frame;
    private Container contenitore;
    private JLabel label;
    
    
    public Esito(String l){
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.contenitore.setLayout(new FlowLayout());
        this.label = new JLabel(l);
        
        this.frame.pack();
        this.frame.setSize(200, 80);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.frame.setVisible(false);
        this.frame.setResizable(false);
        
        this.frame.add(contenitore);
        this.contenitore.add(label);
        
        this.label.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    public JFrame getFrame(){
        return frame;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_mattiateriaca;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author itismeucci
 */
public class Inserimento_GUI extends JFrame{
    private JFrame frame;
    private Container contenitore;
    private JLabel titoloL;
    private JLabel dataL;
    private JLabel oraL;
    private JLabel cfL;
    private JLabel motL;
    private JLabel spazio;
    private JTextField dataTx;
    private JTextField oraTx;
    private JTextField cfTx;
    private JTextArea motTx;
    private JButton confB;
    private JButton annB;
    private Esito esitGui;
    private Appuntamento app;
    
    public Inserimento_GUI(){
        
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.titoloL = new JLabel("Benvenuto nella pagina di inserimento");
        this.dataL = new JLabel("Data:               ");
        this.oraL = new JLabel("Ora:                ");
        this.cfL = new JLabel("Cod. Fiscale: ");
        this.motL = new JLabel("Descrizione:  ");
        this.motTx = new JTextArea("");
        this.dataTx = new JTextField("");
        this.oraTx = new JTextField("");
        this.cfTx = new JTextField("");
        this.annB = new JButton("Annulla");
        this.confB = new JButton("Conferma");
        this.spazio = new JLabel("");
        
        this.frame.setTitle("Inserimento");
        this.contenitore.setLayout(new FlowLayout());
        
        this.frame.pack();
        this.frame.setSize(300, 280);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.frame.setResizable(false);
        
        this.confB.addActionListener((ae) -> {
            if(confCampi() == false){
                this.esitGui = new Esito("Tutti i campi sono OBBLIGATORI");
                this.esitGui.getFrame().setVisible(true);
            }else{
                this.app = new Appuntamento(this.oraTx.getText(), this.dataTx.getText(), this.cfTx.getText(), this.motTx.getText());
                if(Agenda.addAppuntamento(app) == true){
                    this.esitGui = new Esito("Inserito; app. di oggi: " + Agenda.contaApp(this.dataTx.getText()));
                    this.esitGui.getFrame().setVisible(true);
                }else{
                    this.esitGui = new Esito("Inserimento NON avvenuto");
                    this.esitGui.getFrame().setVisible(true);
                }
                svuotaCampi();
            }
        });
        
        this.annB.addActionListener((ae) -> {
            this.frame.dispose();
        });
        
        this.frame.add(this.contenitore);
        this.titoloL.setPreferredSize(new Dimension(300, 40));
        this.contenitore.add(this.titoloL);
        
        this.oraL.setLabelFor(this.oraTx);
        this.contenitore.add(this.oraL);
        this.oraTx.setPreferredSize(new Dimension(180, 22));
        this.contenitore.add(this.oraTx);
        
        this.dataL.setLabelFor(this.dataTx);
        this.contenitore.add(this.dataL);
        this.dataTx.setPreferredSize(new Dimension(180, 22));
        this.contenitore.add(this.dataTx);
        
        this.cfL.setLabelFor(this.cfTx);
        this.contenitore.add(this.cfL);
        this.cfTx.setPreferredSize(new Dimension(180, 22));
        this.contenitore.add(this.cfTx);
        
        this.motL.setLabelFor(this.motTx);
        this.contenitore.add(this.motL);
        this.motTx.setPreferredSize(new Dimension(180, 50));
        this.contenitore.add(this.motTx);
        
        this.spazio.setPreferredSize(new Dimension(300, 22));
        this.contenitore.add(this.spazio);
        
        this.contenitore.add(this.annB);
        this.contenitore.add(this.confB);
        
        this.titoloL.setHorizontalAlignment(SwingConstants.CENTER);
        this.frame.setVisible(false);
    }
    
    public JFrame getFrame(){
        return this.frame;
    }

    public boolean confCampi(){
        if((this.oraTx.getText().equals("") || this.dataTx.getText().equals("")) || this.cfTx.getText().equals("") || this.motTx.getText().equals("")){
            return false;
        }
        return true;
    }
    
    public void svuotaCampi(){
        this.oraTx.setText("");
        this.dataTx.setText("");
        this.motTx.setText("");
        this.cfTx.setText("");
    }
}

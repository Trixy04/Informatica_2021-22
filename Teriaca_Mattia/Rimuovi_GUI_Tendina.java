/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_mattiateriaca;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import sun.font.FontScaler;

/**
 *
 * @author itismeucci
 */
public class Rimuovi_GUI_Tendina extends JFrame{
    private JFrame frame;
    private Container contenitore;
    private JLabel titoloL;
    private JLabel dataL;
    private JLabel oraL;
    private JComboBox dataTx;
    private JComboBox oraTx;
    private JButton rimuoviB;
    private JLabel spazio;
    private Esito esitGui;
    
    public Rimuovi_GUI_Tendina(String x){
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.titoloL = new JLabel("Benvenuto nella pagina di rimozione");
        this.dataL = new JLabel("Data: ");
        this.oraL = new JLabel("Ora:   ");
        this.rimuoviB = new JButton("Rimuovi");
        this.spazio = new JLabel("");
        this.dataTx = new JComboBox();
        this.dataTx = new JComboBox();
        insComboBoxdata();
        insOraComboBox(x);
        
        
        this.frame.setTitle("Rimozione");
        this.contenitore.setLayout(new FlowLayout());
        this.spazio.setPreferredSize(new Dimension(300, 30));
        
        this.frame.pack();
        this.frame.setSize(250, 210);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.frame.setResizable(false);
        
        this.titoloL.setFont(new Font(Font.MONOSPACED, Font.BOLD, 10));
        
        /*this.rimuoviB.addActionListener((ae) -> {
            if(Agenda.removeAppuntamento(this.dataTx.getText(), this.oraTx.getText()) == true){
                this.esitGui = new Esito("Rimozione avvenuta");
                this.esitGui.getFrame().setVisible(true);
                this.oraTx.setText("");
                this.dataTx.setText("");
            }else if(this.dataTx.getText().equals("") || this.oraTx.getText().equals("")){
                this.esitGui = new Esito("Campo OBBLIGATORIO");
                this.esitGui.getFrame().setVisible(true);
                this.oraTx.setText("");
                this.dataTx.setText("");
            }else{
                this.esitGui = new Esito("Paziente non trovato");
                this.esitGui.getFrame().setVisible(true);
                this.oraTx.setText("");
                this.dataTx.setText("");
            }
        });*/
        
        this.frame.add(this.contenitore);
        this.titoloL.setPreferredSize(new Dimension(250, 40));
        this.contenitore.add(this.titoloL);
        
        this.dataL.setLabelFor(this.dataTx);
        this.contenitore.add(this.dataL);
        this.dataTx.setPreferredSize(new Dimension(180, 22));
        this.contenitore.add(this.dataTx);
        
        /*this.oraL.setLabelFor(this.oraTx);
        this.contenitore.add(this.oraL);
        this.oraTx.setPreferredSize(new Dimension(180, 22));
        this.contenitore.add(this.oraTx);*/
        
        this.contenitore.add(this.spazio);
        
        this.rimuoviB.setPreferredSize(new Dimension(80, 22));
        this.contenitore.add(this.rimuoviB);
        
        this.titoloL.setHorizontalAlignment(SwingConstants.CENTER);
        this.frame.setVisible(false);
    }
    
    public JFrame getFrame(){
        return this.frame;
    }
    
   public void insComboBoxdata(){
       for(int i = 0; i < Agenda.agenda.size(); i++){
            this.dataTx.addItem(Agenda.agenda.get(i).getData());
        }
   }
   
   public void insOraComboBox(String x){
       for(int i = 0; i < Agenda.agenda.size(); i++){
            if(Agenda.agenda.get(i).getData().equals(x)){
                this.oraTx.addItem(Agenda.agenda.get(i).getOra());
            }
        }
   }
   
   public JComboBox getDataTx(){
       return this.dataTx;
   }

}

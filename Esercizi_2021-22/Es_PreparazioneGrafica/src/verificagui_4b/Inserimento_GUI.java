package verificagui_4b;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mattia
 */
public class Inserimento_GUI extends JFrame{
    private JFrame frame;
    private Container contenitore;
    private JLabel titolo;
    private JLabel lNome;
    private JLabel lNumero;
    private JLabel lTempo;
    private JTextField nome;
    private JTextField numero;
    private JTextField tempo;
    private JButton conferma;
    private JButton annulla;
    private Atleta p;
    private BaseDati_Gare gare;
    private Esito esito;
    
    public Inserimento_GUI(){
        this.frame = new JFrame();
        this.contenitore = this.getContentPane();
        this.titolo = new JLabel("Benvenuto nella pagina di inserimento");
        this.nome = new JTextField();
        this.numero = new JTextField();
        this.tempo = new JTextField();
        this.lNome = new JLabel("Nome:     ");
        this.lNumero = new JLabel("Numero: ");
        this.lTempo = new JLabel("Tempo:   ");
        this.conferma = new JButton("Conferma");
        this.annulla = new JButton("Annulla");
        this.gare = new BaseDati_Gare();
        
        
        this.titolo.setPreferredSize(new Dimension(300, 20));
        
        this.frame.setTitle("Inserimento");
        this.contenitore.setLayout(new FlowLayout());
        
        this.frame.pack();
        this.frame.setSize(280, 200);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.frame.setVisible(false);
        this.frame.setResizable(false);
        
        this.frame.add(this.contenitore);
        this.contenitore.add(this.titolo);
        this.titolo.setPreferredSize(new Dimension(280, 22));
        this.titolo.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.contenitore.add(lNome);
        this.lNome.setLabelFor(this.nome);
        this.contenitore.add(this.nome);
        this.nome.setPreferredSize(new Dimension(180, 25));
        
        this.contenitore.add(lNumero);
        this.lNumero.setLabelFor(this.numero);
        this.contenitore.add(this.numero);
        this.numero.setPreferredSize(new Dimension(180, 25));
        
        this.contenitore.add(lTempo);
        this.lTempo.setLabelFor(this.tempo);
        this.contenitore.add(this.tempo);
        this.tempo.setPreferredSize(new Dimension(180, 25));
        
        this.contenitore.add(this.annulla);
        this.contenitore.add(this.conferma);
                
        this.annulla.addActionListener((e) -> {
            this.frame.dispose();
        });
        
        this.conferma.addActionListener((e) -> {
            this.p = new Atleta(nome.getText(), tempo.getText(), numero.getText());
            if((this.nome.getText().equals("") || this.numero.getText().equals("")) || this.tempo.getText().equals("")){
                this.esito = new Esito("Tutti i campi sono obbligatori");
                this.esito.getFrame().setVisible(true);
            }else if(this.gare.inserisciAtleta(p) == true){
                this.esito = new Esito("Inserimento avvenuto");
                this.esito.getFrame().setVisible(true);
            }
            
                
            
        });
    }
    
    public JFrame getFrame(){
        return this.frame;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificagui_4b;

/**
 *
 * @author Mattia
 */
public class Atleta {
    private String nome;
    private String tempo;
    private String numero;

    public Atleta(String nome, String tempo, String numero) {
        this.nome = nome;
        this.tempo = tempo;
        this.numero = numero;
    }
    
    public Atleta() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
}

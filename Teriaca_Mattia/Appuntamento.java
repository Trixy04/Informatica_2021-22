/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_mattiateriaca;

/**
 *
 * @author itismeucci
 */
public class Appuntamento {
    private String ora;
    private String data;
    private String cf;
    private String des;

    public Appuntamento(String ora, String data, String cf, String des) {
        this.ora = ora;
        this.data = data;
        this.cf = cf;
        this.des = des;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    
    
}

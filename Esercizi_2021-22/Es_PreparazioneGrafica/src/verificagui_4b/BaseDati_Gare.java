/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificagui_4b;
import java.util.ArrayList;
/**
 *
 * @author Mattia
 */
public class BaseDati_Gare {
    
    private ArrayList<Atleta> gareLista;

    public BaseDati_Gare() {
        this.gareLista = new ArrayList();
    }
    
    public boolean inserisciAtleta(Atleta a1){
        gareLista.add(a1);
        return true;
    }
    
    
    
}

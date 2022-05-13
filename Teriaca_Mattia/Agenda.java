/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica_mattiateriaca;
import java.util.ArrayList;
/**
 *
 * @author itismeucci
 */
public class Agenda {
    static ArrayList<Appuntamento> agenda = new ArrayList();
    
    public static boolean addAppuntamento(Appuntamento a){
        if(research(a.getOra()) == -1){
            agenda.add(a);
            return true;
        }
        return false;
    }
    
    
    public static boolean removeAppuntamento(String data, String ora){
        if(research(ora) != -1){
            if(agenda.get(research(ora)).getData().equals(data)){
                agenda.remove(research(ora));
                return true;
            }     
        }
        return false;
    }
    
    public static int research(String ora){
        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getOra().equals(ora))
                return i;
        }
        return -1;
    }
    
    public static int contaApp(String data){
        int conta = 0;
        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getData().equals(data))
                conta++;
        }
        return conta;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package calciatore;

import java.util.Scanner;

public class ClassMain {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        //VARIABILE APPOGGIO
        String appoggio;
        int intAppoggio;
        int scelta;
        double doubleAppoggio;
        
        Calciatore c1 = new Calciatore();
        Calciatore c2 = new Calciatore();
        Calciatore c3 = new Calciatore();
        Calciatore c4 = new Calciatore();
        
        System.out.println("Inserisci il numero del calciatore da inserire 1-4: ");
        scelta = scanner.nextInt();
        
        switch(scelta){
            
            case 1: 
                System.out.print("Inserisci il nome del calciatore: ");
                appoggio = scanner.nextLine();
                c1.setNome(appoggio);
        
                System.out.println("Inserisci il cognome del calciatore: ");
                appoggio = scanner.nextLine();
                c1.setCognome(appoggio);
        
                System.out.println("Inserisci la squadra del calciatore: ");
                appoggio = scanner.nextLine();
                c1.setSquadra(appoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c1.setNumPartite(intAppoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c1.setTotGoal(intAppoggio);

                System.out.println("Inserisci il valore di mercato del calciatore: ");
                intAppoggio = scanner.nextInt();
                c1.setValMercato(intAppoggio);

                System.out.println("Inserisci il delle partite giocate dal calciatore: ");
                intAppoggio = scanner.nextInt();
                c1.setNumPartite(intAppoggio);
                
                break;
                
            case 2:
                System.out.println("Inserisci il nome del calciatore: ");
                appoggio = scanner.nextLine();
                c2.setNome(appoggio);

                System.out.println("Inserisci il cognome del calciatore: ");
                appoggio = scanner.nextLine();
                c2.setCognome(appoggio);

                System.out.println("Inserisci la squadra del calciatore: ");
                appoggio = scanner.nextLine();
                c2.setSquadra(appoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c2.setNumPartite(intAppoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c2.setTotGoal(intAppoggio);

                System.out.println("Inserisci il valore di mercato del calciatore: ");
                intAppoggio = scanner.nextInt();
                c2.setValMercato(intAppoggio);

                System.out.println("Inserisci il delle partite giocate dal calciatore: ");
                intAppoggio = scanner.nextInt();
                c2.setNumPartite(intAppoggio);
                
                break;
                
            case 3:
                System.out.println("Inserisci il nome del calciatore: ");
                appoggio = scanner.nextLine();
                c3.setNome(appoggio);

                System.out.println("Inserisci il cognome del calciatore: ");
                appoggio = scanner.nextLine();
                c3.setCognome(appoggio);

                System.out.println("Inserisci la squadra del calciatore: ");
                appoggio = scanner.nextLine();
                c3.setSquadra(appoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c3.setNumPartite(intAppoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c3.setTotGoal(intAppoggio);

                System.out.println("Inserisci il valore di mercato del calciatore: ");
                intAppoggio = scanner.nextInt();
                c3.setValMercato(intAppoggio);

                System.out.println("Inserisci il delle partite giocate dal calciatore: ");
                intAppoggio = scanner.nextInt();
                c3.setNumPartite(intAppoggio);
                
                break;
                
            case 4:
                System.out.println("Inserisci il nome del calciatore: ");
                appoggio = scanner.nextLine();
                c4.setNome(appoggio);

                System.out.println("Inserisci il cognome del calciatore: ");
                appoggio = scanner.nextLine();
                c4.setCognome(appoggio);

                System.out.println("Inserisci la squadra del calciatore: ");
                appoggio = scanner.nextLine();
                c4.setSquadra(appoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c4.setNumPartite(intAppoggio);

                System.out.println("Inserisci il totale dei goal del calciatore: ");
                intAppoggio = scanner.nextInt();
                c4.setTotGoal(intAppoggio);

                System.out.println("Inserisci il valore di mercato del calciatore: ");
                intAppoggio = scanner.nextInt();
                c4.setValMercato(intAppoggio);

                System.out.println("Inserisci il delle partite giocate dal calciatore: ");
                intAppoggio = scanner.nextInt();
                c4.setNumPartite(intAppoggio);
                
                break;
            
        }
        
        
        
        
        
        
        
        
        
        
    }
}

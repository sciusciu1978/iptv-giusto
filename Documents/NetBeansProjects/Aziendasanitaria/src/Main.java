import java.util.Scanner;
import java.util.ArrayList;
public class Main {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        AziendaSanitaria azienda=new AziendaSanitaria();
        /*Medico m=azienda.aggiungiMedico(13,"Mario","Rossi"); //medico inserito nell'array
            azienda.aggiungiPaziente(345675, azienda.aggiungiMedico(15,"Mario", "Rao"),"Marco","Noriello");
            azienda.aggiungiPaziente(345679, azienda.aggiungiMedico(13,"Mario", "Rossi"),"Marco","Nori");
           azienda.aggiungiPaziente(545, azienda.aggiungiMedico(13,"Mario", "Rossi"),"Mattia","Nocera");
            azienda.aggiungiPaziente(546, azienda.aggiungiMedico(13,"Mario", "Rossi"),"Luca","Bianchi");
           // azienda.stampaLista(azienda.listaMedici());
           azienda.aggiungiPaziente(5436, azienda.aggiungiMedico(213,"Marco", "Ranucci"),"Maria","Noriello");
            azienda.aggiungiPaziente(305679, azienda.aggiungiMedico(113,"Mario", "Rossietto"),"Antonio","Noriel");
           azienda.aggiungiPaziente(5485, azienda.aggiungiMedico(113,"Mario", "Rossietto"),"Mara","Bianchi");
            azienda.aggiungiPaziente(5432, azienda.aggiungiMedico(213,"Marco", "Ranucci"),"Lucia","Bianchetto");
           azienda.statMedico();*/
            String parolaMenu;
        do {  
            System.out.println("MENU AZIENDA SANITARIA");
            System.out.println("***********************");
            System.out.println("1- Aggiungi medico in archivio");
            System.out.println("2- Aggiungi paziente in archivio");
            System.out.println("3- Stampa lista medici in archivio");
            System.out.println("4- Stampa pazienti per singolo medico");
            System.out.println("5- Stampa statistiche medici");
            System.out.println("6- Fine");
            parolaMenu=input.nextLine();
            switch (parolaMenu){
               case "1" : System.out.println("Digita nome");
                          String nome=input.nextLine();
                          System.out.println("Digita cognome");
                          String cognome=input.nextLine();
                          System.out.println("Digita codice interno");
                          int codiceInterno=input.nextInt();
                          azienda.aggiungiMedico(codiceInterno, nome, cognome);
                          break;
               case "2" :System.out.println("Digita nome");
                          String nome1=input.nextLine();
                          System.out.println("Digita cognome");
                          String cognome1=input.nextLine();
                          System.out.println("Digita codice interno");
                          int codiceInterno1=input.nextInt();
                          System.out.println("Digita nome medico paziente");
                          String nomeMedicoPaziente=input.next();
                          System.out.println("Digita cognome medico paziente");
                          String cognomeMedicoPaziente=input.next();
                          System.out.println("Digita codice medico paziente");
                          int codiceinternoMedicoPaziente=input.nextInt();
                         azienda.aggiungiPaziente(codiceInterno1,azienda.aggiungiMedico(codiceinternoMedicoPaziente, nomeMedicoPaziente, cognomeMedicoPaziente), nome1, cognome1);
                         break;
               case "3" : System.out.println(azienda.listaMedici());break;
               case "4" : System.out.println("Digita codice interno medico");
                          int codiceInterno3=input.nextInt();
                          azienda.listaMedico(codiceInterno3);
                          break;
                                  
               case "5" : azienda.statMedico();break;
               //default: System.out.println("Scelta errata.");
                          
                          
                    }
                
        } while (!parolaMenu.equals("6"));
                    
    }
}


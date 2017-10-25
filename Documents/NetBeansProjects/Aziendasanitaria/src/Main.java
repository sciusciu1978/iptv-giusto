
import java.util.ArrayList;



public class Main {

   
    public static void main(String[] args) {
        AziendaSanitaria azienda=new AziendaSanitaria();
        //Medico m=azienda.aggiungiMedico(13,"Mario","Rossi"); //medico inserito nell'array
            azienda.aggiungiPaziente(345675, azienda.aggiungiMedico(15,"Mario", "Rao"),"Marco","Noriello");
            azienda.aggiungiPaziente(345679, azienda.aggiungiMedico(13,"Mario", "Rossi"),"Marco","Nori");
           azienda.aggiungiPaziente(545, azienda.aggiungiMedico(13,"Mario", "Rossi"),"Mattia","Nocera");
            azienda.aggiungiPaziente(546, azienda.aggiungiMedico(13,"Mario", "Rossi"),"Luca","Bianchi");
           // azienda.stampaLista(azienda.listaMedici());
           azienda.aggiungiPaziente(5436, azienda.aggiungiMedico(213,"Marco", "Ranucci"),"Maria","Noriello");
            azienda.aggiungiPaziente(305679, azienda.aggiungiMedico(113,"Mario", "Rossietto"),"Antonio","Noriel");
           azienda.aggiungiPaziente(5485, azienda.aggiungiMedico(113,"Mario", "Rossietto"),"Mara","Bianchi");
            azienda.aggiungiPaziente(5432, azienda.aggiungiMedico(213,"Marco", "Ranucci"),"Lucia","Bianchetto");
           
           azienda.statMedico();
                    
    }
}


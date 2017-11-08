
import java.util.Date;


public class Main {

  
    public static void main(String[] args) {
        GestioneIptv iptv =new GestioneIptv();
        
        iptv.aggiungiServer("Vision", "Skype");
        iptv.aggiungiServer("Newlook", "Skype");
        iptv.aggiungiServer("Falcon", "Skype");
        iptv.aggiungiServer("Dvs", "Skype"); 
        
        iptv.aggiungiNuovoAbbonato("Vision", 10, "347/5634390", "FiglioLuca", "Amico giovanni");
        iptv.aggiungiNuovoAbbonato("Vision", 12, "347/5634390", "Luca", "");
        iptv.aggiungiNuovoAbbonato("Newlook", 10, "347/5634390", "Giovanni", "");
        
        
        iptv.aggiungiPagamento("Luca", 10);
        iptv.aggiungiPagamento("Luca", 5);
        iptv.stampaPagamenti("Luca");
        iptv.stampaDebito("Luca");
        
        
        
      
    }
        
       
    
    
}

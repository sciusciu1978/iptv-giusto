
public class Main {

  
    public static void main(String[] args) {
        GestioneIptv iptv =new GestioneIptv();
        Server server=new Server("Vision","Skype: Il corvo");
        iptv.aggiungiNuovoAbbonato(server,10, "347/5634390", "FiglioLuca","Amico giovanni", 0);
       iptv.aggiungiNuovoAbbonato(server,10, "347/5634890", "AmicoGiovanni","Amico giovanni", 0);
        iptv.aggiungiNuovoAbbonato(server,10, "347/5634690", "FiglioMarco","Amico giovanni", 0);
        iptv.aggiungiNuovoAbbonato(server,10, "347/5654430", "FiglioDavide","Amico giovanni", 0);
        iptv.aggiungiNuovoAbbonato(server,10, "347/5778890", "CuginoCiatu","Amico giovanni", 0);
        iptv.aggiungiNuovoAbbonato(server,10, "347/2322390", "CiccioCiatu","Amico munzone", 0);
        iptv.aggiungiNuovoAbbonato(server,10, "347/5658530", "MarioFabry","Amico giovanni", 0);
        iptv.aggiungiNuovoAbbonato(server,10, "345/5648765", "GiovanniAldo","Amico giacomo", 0);
        
       //iptv.stampaAbbonati();
        
        /*iptv.debitoPagare("FiglioDavide",10);
        iptv.stampaDebiti();
        iptv.debitoSaldare("FiglioDavide",5); 
        iptv.stampaDebiti();*/
        //System.out.println(server);
        iptv.rimuoviabbonato("FiglioLuca");
        System.out.println("****************");
        iptv.stampaAbbonati();
        System.out.println("****************");
        System.out.println(server);
        System.out.println("****************");
        iptv.stampaUtentiRimossi();
    }
    
}

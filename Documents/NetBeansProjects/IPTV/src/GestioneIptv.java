import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestioneIptv { 
    ArrayList<Server> server= new ArrayList<Server>();
    ArrayList<Abbonato> abbonatiRimossi= new ArrayList<Abbonato>();
  
    HashMap<Abbonato,Double> debitiCorrenti = new HashMap<Abbonato,Double>();
    
    public void aggiungiNuovoAbbonato(String server,double prezzoMensile, String numeroTelefono,String username, String annotazioni){
        //Abbonato abbonato1=null;
        Server srv=cercaServer(server);
        if(srv!=null){
        srv.aggiungiNuovoAbbonato(prezzoMensile, numeroTelefono, username, annotazioni);
        }
        else {
            System.out.println("Il server non esiste");
        }
       
    }
    
    public void aggiungiServer(String nome, String contatto){
        Server srv = new Server(nome, contatto);
        server.add(srv);
    }
    
    private Server cercaServer(String nome){
        Server ret=null;
        for(Server srv : server){
            if(srv.getNomeServer().equals(nome)){
                ret=srv;
            }
        }
        return ret;
    }
    
    public void rimuoviabbonato(String username){
        boolean controllo=false;
        for(Server srv : server){
            if(srv.rimuoviAbbonato(username)==true){
                controllo=true;
            }
        }
        if(controllo!=true){
            System.out.println("Abbonato non esistente");
        }
    }
    public void pulisciRimossi(){
        abbonatiRimossi.clear();
    }
    /*
    public void debitoPagare(String username,double mensilita){//ammontare dei debiti mensili
        Abbonato abb=null;
        for(Server srv : server){
            if(abb==null)
            abb=srv.cercaAbbonato(username);
            
        }
        if(abb==null){
        
            System.out.println("Username non trovato");
        }
        else{
            double debito=abb.getDebitoCorrente()+mensilita;
            abb.setDebitoCorrente(debito);
        }
       
    }
    public void debitoSaldare(String username,double mensilita){//quando pagano scala i debiti
        for (Abbonato abbonato : abbonati) {
            if(abbonato.getUsername().equalsIgnoreCase(username)){
                 double pagamento=debitiCorrenti.get(abbonato);
       debitiCorrenti.put(abbonato,new Double(pagamento-mensilita));
            }
        }
      
    }
    */
    
    public void aggiungiPagamento(String username, double importo){
        Abbonato abb=null;
        for(Server srv : server){
            if(abb==null)
            abb=srv.cercaAbbonato(username);
            
        }
        if(abb==null){
            System.out.println("Usernare non esistente");
        }
        else{
            abb.aggiungiPagamento(importo);
        }
        
    }
    
    public void stampaAbbonati(){ //tutti gli abbonati, distinti per server
        for (Server srv : server) {
            System.out.println(srv.getNomeServer()+":");
            srv.stampaAbbonati();
        }
    }
    public void stampaDebiti(){
        /*
        for (Map.Entry<Abbonato, Double> entry : debitiCorrenti.entrySet()) {
            Abbonato key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key.getUsername()+" - Debito residuo: "+value);
        }*/
        for (Server srv : server) {
            System.out.println(srv.getNomeServer()+":");
            srv.stampaDebiti();
        }
        
    }
    public void stampaDebito(String username){
        Abbonato abb=null;
        for(Server srv : server){
            if(abb==null)
            abb=srv.cercaAbbonato(username);
            
        }
        if(abb==null){
            System.out.println("Usernare non esistente");
        }
        else{
            System.out.println(abb.debito());
        }
    }
    public void stampaUtentiRimossi(){
        for (Abbonato abbonato : abbonatiRimossi) {
            System.out.println("Username: "+abbonato.getUsername());
            
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestioneIptv implements Serializable{ 
    ArrayList<Server> server= new ArrayList<Server>();
    ArrayList<Abbonato> abbonatiRimossi= new ArrayList<Abbonato>();
  
    HashMap<Abbonato,Double> debitiCorrenti = new HashMap<Abbonato,Double>();
    
    
    public void aggiungiNuovoAbbonato(String server,double prezzoMensile, String numeroTelefono,String username, String annotazioni) throws MiaException{
        //Abbonato abbonato1=null;
        Server srv=cercaServer(server);
        if(srv!=null){
        srv.aggiungiNuovoAbbonato(prezzoMensile, numeroTelefono, username, annotazioni);
        }
        else {
            //System.out.println("Il server non esiste");
            throw new MiaException("Il server non esiste");
        }
       
    }
    
    public void aggiungiServer(String nome, String contatto) throws MiaException{
        if(cercaServer(nome) == null){
        Server srv = new Server(nome, contatto);
        server.add(srv);
        }
        else{
            throw new MiaException("Server gia' esistente");
        }
    }
    
    private Server cercaServer(String nome){
        Server ret=null;
        for(Server srv : server){
            if(srv.getNomeServer().equalsIgnoreCase(nome)){
                ret=srv;
            }
        }
        return ret;
    }
    
    public String contattoServer(String nomesrv){
        //restiruisce il contatto di un server cercato altrimenti exception
        return cercaServer(nomesrv).getContattoSocial();
    }
    
    public void rimuoviabbonato(String username) throws MiaException{
        boolean controllo=false;
        for(Server srv : server){
            if(srv.rimuoviAbbonato(username)==true){
                controllo=true;
            }
        }
        if(controllo!=true){
            //System.out.println("Abbonato non esistente");
            throw new MiaException("Abbonato non esistente");
        }
    }
    public void pulisciRimossi(){
        abbonatiRimossi.clear();
    }
    
    
    public void aggiungiPagamento(String username, double importo) throws MiaException{
        Abbonato abb=null;
        for(Server srv : server){
            if(abb==null)
            abb=srv.cercaAbbonato(username);
            
        }
        if(abb==null){
            //System.out.println("Usernare non esistente");
            throw new MiaException("Username non esistente");
        }
        else{
            abb.aggiungiPagamento(importo);
        }
        
    }
    
    public void stampaAbbonati(){ //tutti gli abbonati, distinti per server
        for (Server srv : server) {
            if(srv.getNumeroAbbServer()>0){
            System.out.println(srv.getNomeServer()+":");
            srv.stampaAbbonati();
            }
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
            //System.out.println(srv.getNomeServer()+":");
            srv.stampaDebiti();
        }
        
    }
    public void stampaDebito(String username) throws MiaException{
        Abbonato abb=null;
        for(Server srv : server){
            if(abb==null)
            abb=srv.cercaAbbonato(username);
            
        }
        if(abb==null){
            //System.out.println("Usernare non esistente");
            throw new MiaException("Username non esistente");
        }
        else{
            System.out.println(abb.debito());
        }
    }
    
    public void stampaPagamenti(String username) throws MiaException{
        Abbonato abb=null;
        for(Server srv : server){ //cerco l'abbonato fra i server
            if(abb==null)
                abb=srv.cercaAbbonato(username);
        }
        if(abb==null){
            //System.out.println("Usernare non esistente");
            throw new MiaException("Username non esistente");
        }
        else{
            abb.stampaPagamenti();
        }
        
    }
    
    public void stampaUtentiRimossi(){
        for (Abbonato abbonato : abbonatiRimossi) {
            System.out.println("Username: "+abbonato.getUsername());
            
        }
    }
    
    public void rimuoviServer(String server){
            this.server.remove(cercaServer(server));
        }
    }

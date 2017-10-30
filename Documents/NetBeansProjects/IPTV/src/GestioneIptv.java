import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestioneIptv {
    ArrayList<Abbonato> abbonati= new ArrayList<Abbonato>();
    ArrayList<Abbonato> abbonatiRimossi= new ArrayList<Abbonato>();
  
    HashMap<Abbonato,Double> debitiCorrenti = new HashMap<Abbonato,Double>();
    
    public void aggiungiNuovoAbbonato(Server server,double prezzoMensile, String numeroTelefono,String username, String annotazioni,double deditoCorrente){
        //Abbonato abbonato1=null;
        int contatore=0;
        for (Abbonato abbonato : abbonati) {
             
            if(abbonato.getUsername().equalsIgnoreCase(username)){
                //abbonato1=abbonato;
                contatore=1;
               }
            }
        if(contatore!=1){
      
            Abbonato abbonato2= new Abbonato(server,prezzoMensile, numeroTelefono,username, annotazioni,deditoCorrente);
            abbonati.add(abbonato2);
            
              //prezzi.put(abbonato2,new Double(prezzoMensile));
               debitiCorrenti.put(abbonato2,new Double(deditoCorrente)); 
        }
        else{
            System.out.println("Username gia' registrato");
        }
    }
    
    public void rimuoviabbonato(String username){
        for (Abbonato abbonato : abbonati) {
            if (abbonato.getUsername().equalsIgnoreCase(username)) {
                Abbonato rimosso= abbonato;
                abbonati.remove(abbonato);
                
                abbonatiRimossi.add(rimosso);
            }
               else{
                System.out.println("Abbonato non trovato!");
               }
        }
    }
    public void pulisciRimossi(){
        abbonatiRimossi.clear();
    }
    public void debitoPagare(String username,double mensilita){//ammontare dei debiti mensili
        Abbonato abbonato1=null;
        for (Abbonato abbonato : abbonati) {
            if(abbonato.getUsername().equalsIgnoreCase(username)){
              double debito=debitiCorrenti.get(abbonato);
       debitiCorrenti.put(abbonato,new Double(debito+mensilita));
       abbonato1=abbonato;
            }
        }
        if(abbonato1==null){
        
            System.out.println("Username non trovato");
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
    public void stampaAbbonati(){
        for (Abbonato abbonato : abbonati) {
           System.out.println(abbonato);
        }
    }
    public void stampaDebiti(){
        for (Map.Entry<Abbonato, Double> entry : debitiCorrenti.entrySet()) {
            Abbonato key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key.getUsername()+" - Debito residuo: "+value);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




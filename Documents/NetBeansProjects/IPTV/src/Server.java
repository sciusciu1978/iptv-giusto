 import java.util.ArrayList;
public class Server {
    private String nomeServer;
    private String contattoSocial;
    private ArrayList<Abbonato> abbonati;
    

    public Server(String nomeServer, String contattoSocial) {
        this.nomeServer = nomeServer;
        this.contattoSocial = contattoSocial;
        abbonati=new ArrayList<Abbonato>();
    }

    public int getNumeroAbbServer() {
        return abbonati.size();
    }

    public void aggiungiNuovoAbbonato(double prezzoMensile, String numeroTelefono,String username, String annotazioni){
        int contatore=0;
        for (Abbonato abbonato : abbonati) {
             
            if(abbonato.getUsername().equalsIgnoreCase(username)){
                //abbonato1=abbonato;
                contatore=1;
                //new abbonato
               }
            }
        if(contatore!=1){ //non esiste
      
            Abbonato abbonato2= new Abbonato(prezzoMensile, numeroTelefono,username, annotazioni);
            abbonati.add(abbonato2);
        }
        else{
            System.out.println("Username gia' registrato");
        }
    }
    
    public void stampaAbbonati(){
        for (Abbonato abbonato : abbonati) {
           System.out.println(abbonato);
        }
    }
    
    public boolean rimuoviAbbonato(String username){
        Abbonato abbonato1=null;
        for (Abbonato abbonato : abbonati) {
            if (abbonato.getUsername().equalsIgnoreCase(username)) {
                abbonato1=abbonato;
            }
        }
        if(abbonato1!=null){
           abbonati.remove(abbonato1);
                //abbonatiRimossi.add(abbonato1);
           return true;
        }
        else{
            return false;
        }
    }
    
    public Abbonato cercaAbbonato(String username){
        Abbonato abbonato1=null;
        for (Abbonato abbonato : abbonati) {
            if (abbonato.getUsername().equalsIgnoreCase(username)) {
                abbonato1=abbonato;
            }
        }
        return abbonato1;
    }
    
    public void stampaDebiti(){
         for (Abbonato abbonato : abbonati) {
             if(abbonato.debito()>0){
           System.out.println(abbonato.getUsername()+": "+abbonato.debito());
             }
        }
    }

    public String getNomeServer() {
        return nomeServer;
    }

    public void setNomeServer(String nomeServer) {
        this.nomeServer = nomeServer;
    }

    public String getContattoSocial() {
        return contattoSocial;
    }

    public void setContattoSocial(String contattoSocial) {
        this.contattoSocial = contattoSocial;
    }
    public void stampaServer(){
        
    }
    public String toString(){
        return nomeServer+'\n'+"Contatto Social: "+contattoSocial+" - Numero abbonati "+getNumeroAbbServer();
    } 
}

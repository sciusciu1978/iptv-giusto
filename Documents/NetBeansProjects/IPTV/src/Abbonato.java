
public class Abbonato { 
    double prezzoMensile;
    String numeroTelefono;
    String username;
    String annotazioni;
    double debitoCorrente;
    Server server;

    public Abbonato(Server server,double prezzoMensile, String numeroTelefono, String username, String annotazioni,double debitoCorrente) {
        this.prezzoMensile = prezzoMensile;
        this.numeroTelefono = numeroTelefono;
        this.username = username;
        this.annotazioni = annotazioni;
        this.debitoCorrente=debitoCorrente;
        this.server=server;
    }
public Server getServer(){
    return server;
}
public double getDebitoCorrente() {
        return debitoCorrente;
    }

    public void setDebitoCorrente(double debitoCorrente) {
        this.debitoCorrente = debitoCorrente;
    }

    public double getPrezzoMensile() {
        return prezzoMensile;
    }

    public void setPrezzoMensile(double prezzoMensile) {
        this.prezzoMensile = prezzoMensile;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public String toString(){
        return "Username "+username+" - Numero telefono: "+numeroTelefono+" - Debito corrente: "+debitoCorrente+'\n'+"Annotazioni: "+annotazioni+'\n'+"*************************";
                
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAnnotazioni() {
        return annotazioni;
    }

    public void setAnnotazioni(String annotazioni) {
        this.annotazioni = annotazioni;
    }
    
    

   
    

    
    
    
}


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Abbonato implements Serializable{ 
    double prezzoMensile;
    String numeroTelefono;
    String username;
    String annotazioni;
    //double debitoCorrente;
    Date iscrizione;
    ArrayList<Pagamento> pagamenti;

    public Abbonato(double prezzoMensile, String numeroTelefono, String username, String annotazioni) {
        this.prezzoMensile = prezzoMensile;
        this.numeroTelefono = numeroTelefono;
        this.username = username;
        this.annotazioni = annotazioni;
        //this.debitoCorrente=debitoCorrente;
        this.iscrizione=new Date();
        this.pagamenti=new ArrayList<Pagamento>();
    }
/*
public double getDebitoCorrente() {
        return debitoCorrente;
    }

    public void setDebitoCorrente(double debitoCorrente) {
        this.debitoCorrente = debitoCorrente;
    }
*/
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
        return "Username "+username+" - Numero telefono: "+numeroTelefono+" - Debito corrente: "+debito()+'\n'+"Annotazioni: "+annotazioni+'\n'+"*************************";
                
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
    
    public void aggiungiPagamento(double importo){
        Pagamento p=new Pagamento(importo);
        pagamenti.add(p);
    }
    public void stampaPagamenti(){
        for(Pagamento p : pagamenti){
            System.out.println(p);
        }
    }
    public double totalePagamenti(){
        double somma=0;
        for(Pagamento p : pagamenti){
            somma=somma+p.getImporto();
        }
        return somma;
    }
    
    public double debito(){
        // (mesi di iscrizione * rata mensile) - tot pagamenti = tot debiti
        Date oggi=new Date();
        int mesi=((oggi.getYear()-iscrizione.getYear())*12) + oggi.getMonth() - iscrizione.getMonth() +1;//  5/5/2017    2/2/2018    (2018-2017)*12 + 2 - 5 = 9
        double totale=(mesi*getPrezzoMensile())-totalePagamenti();
        if(totale>0){
            return totale;
        }
        else{
            return 0;
        }
    }

   
    

    
    
    
}

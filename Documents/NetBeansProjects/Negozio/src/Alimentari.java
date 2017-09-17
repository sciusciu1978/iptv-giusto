
public class Alimentari extends Prodotti {
    Data datascadenza;

    public Alimentari(String codiceBarre, String descrizione, double prezzo,int giorno,int mese,int anno) {
        super(codiceBarre, descrizione, prezzo);
        datascadenza= new Data(giorno,mese,anno);
        
        
    }
    public void ApplicaSconto(){
        
    }
            
}

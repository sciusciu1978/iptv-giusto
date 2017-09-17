
public class NonAlimentari extends Prodotti{
    String materiale;

    public NonAlimentari(String codiceBarre, String descrizione, double prezzo,String materiale ) {
        super(codiceBarre, descrizione, prezzo);
        this.materiale = materiale;
    }
    
    public void ApplicaSconto(){
        if(materiale.equalsIgnoreCase("carta") ||materiale.equalsIgnoreCase("plastica") || materiale.equalsIgnoreCase("vetro") ) //controllo
        {
             double sconto= prezzo*10/100;
             prezzo=prezzo-sconto;
        }
    }
}

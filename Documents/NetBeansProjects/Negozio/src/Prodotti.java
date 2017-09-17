
import java.util.Objects;


public class Prodotti {
    
    String codiceBarre;
    String descrizione;
    double prezzo;

    public Prodotti(String codiceBarre, String descrizione, double prezzo) {
        this.codiceBarre = codiceBarre;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public void ApplicaSconto()
    {
        double sconto= prezzo*5/100;
        prezzo=prezzo-sconto;
        //prezzo=prezzo*95/100;
    }

    @Override
    public String toString() {
        return "Prodotti{" + "codiceBarre=" + codiceBarre + ", descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //stesso oggetto
            return true;
        }
        if (obj == null) { //puntatore null
            return false;
        }
        Prodotti other = (Prodotti) obj;
        if (this.codiceBarre.equals(other.codiceBarre)) { // oggetti diversi, confronto i valori degli attributi
            return true;
        }
        else{
            return false;
        }
        //se il codice a barre dell'oggetto passato corrisponde a quello di this allora gli oggetti sono uguali, ritorna true
    }
    
    
}

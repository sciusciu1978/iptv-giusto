
import java.io.Serializable;
import java.util.Date;

public class Pagamento implements Serializable{
    private Date data;
    private double importo;
    
    public Pagamento(double importo){
        data=new Date();
        this.importo=importo;
    }

    public Date getData() {
        return data;
    }

    public double getImporto() {
        return importo;
    }

    @Override
    public String toString() {
        return "Pagamento: " + data + ", importo=" + importo;
    }
    
}

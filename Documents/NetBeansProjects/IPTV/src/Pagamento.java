
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominatore
 */
public class Pagamento {
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

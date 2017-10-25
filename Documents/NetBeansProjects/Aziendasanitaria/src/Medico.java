
public class  Medico extends Persona  {
     private int numeroInterno;

    public Medico(int numeroInterno, String nome, String cognome) {
        super(nome, cognome);
        this.numeroInterno = numeroInterno;
    }

        
    public int getCodice(){
        return numeroInterno;
    }
    public String toString(){
        return getNome()+" "+getCognome()+" "+getCodice();
    }
    
    
}

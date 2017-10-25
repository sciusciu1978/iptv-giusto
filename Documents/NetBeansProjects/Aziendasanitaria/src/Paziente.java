
public class Paziente extends Persona{
    private int numeroTesseraS;
    private Persona MedicoCurante;

    public Paziente(int numeroTesseraS, Persona medicoCurante, String nome, String cognome) {
        super(nome, cognome);
        this.numeroTesseraS = numeroTesseraS;
        this.MedicoCurante = medicoCurante;
    }
    
    public Persona getMedicoCurante() {
        return MedicoCurante;
    }

  
    public int getCodice(){
         return numeroTesseraS;
     }

    @Override
    public String toString() {
        String info=getNome()+" "+getCognome()+" - "+"Numero Tessera: "+getCodice()+" - "+"Medico curante: "+getMedicoCurante().getNome()+" "+getMedicoCurante().getCognome();
        return info;
    }
      

   
    
    
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AziendaSanitaria {
    ArrayList<Persona> pazienti = new ArrayList<Persona>();
    ArrayList<Persona> medici = new ArrayList<Persona>();
    HashMap<Medico, Integer> hashMap =new HashMap<Medico,Integer>();
    
 public Persona aggiungiMedico(int numeroInterno, String nome, String cognome){
     //Medico medico3=new Medico(numeroInterno, nome, cognome);
     Persona medico=null; //variabile di salvataggio
     for (Persona medico1 :medici) {
         
         if(medico1.getCodice()==numeroInterno){ //se lo trova lo salva
               medico=medico1;
         }
    } 
    if(medico==null){ //controllo la variabile
        //creaiamo il medico
        Persona m=new Medico(numeroInterno, nome, cognome);
        medici.add(m);
        return m;
    }
    else{
        //System.out.println("Medico gia' esistente");
        return medico;
    }
    //return medico;
 }
    public Persona aggiungiPaziente(int numeroTesseraS, Persona medicoCurante, String nome, String cognome){
        Persona p=null;
        for (Persona paziente1 : pazienti) {
            if(paziente1.getCodice()==numeroTesseraS){
                
                p=paziente1;
                
            }
        }
        if(p != null){
            System.out.println("Paziente gia' registrato");
            return p;
        }
        else{
                Paziente paziente= new Paziente (numeroTesseraS, medicoCurante,nome,cognome);
                pazienti.add(paziente);
                return paziente;
        }
        
        
    }
    public ArrayList<Persona> listaMedico(int codice){
        ArrayList<Persona> pazienti= new ArrayList<Persona>();
        for (Persona paziente : this.pazienti) {
            if(((Paziente)paziente).getMedicoCurante().getCodice()==codice){
                pazienti.add(paziente);
            }
        }
        return pazienti;
    }
    
    
    public void stampaLista(ArrayList<Persona> persone){
        for (Persona persona : persone) {
            System.out.println(persona);
        }
  
    }
    public ArrayList<Persona> listaMedici(){
        //ArrayList<Persona> m = medici;
        return medici;
    }
    public void statMedico(){
        
        for (Persona medico : medici) {
            Medico medico1=(Medico) medico;
            hashMap.put(medico1,new Integer(0));
        
          for (Persona paziente1 : pazienti) {
            Paziente paz=(Paziente) paziente1;
            if(paz.getMedicoCurante()== medico1 ){
                int contatore=hashMap.get(medico1);
                hashMap.put(medico1, new Integer(contatore+1));
            }
          }
        }
        System.out.println(hashMap);
        int valore=0;
        Medico medicomax = null;
        
        for (Map.Entry<Medico, Integer> giro : hashMap.entrySet()) {
            Medico medico = giro.getKey();
            Integer value = giro.getValue();
            if(value>valore){
                valore=value;
                medicomax=medico;
            }
            
        }
        System.out.println("Il medico con piu' pazienti è: "+medicomax.getNome()+" "+medicomax.getCognome());
        
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

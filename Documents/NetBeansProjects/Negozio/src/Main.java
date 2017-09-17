
public class Main {

   
    public static void main(String[] args) {
        Prodotti prod1= new Prodotti("0017890", "bla", 12);
        NonAlimentari prod2 = new NonAlimentari("0017890", "carne", 5, "plastica");
        
        System.out.println(prod1);
        prod1.ApplicaSconto();
        System.out.println(prod1);
        
        System.out.println(prod2);
        prod2.ApplicaSconto();
        System.out.println(prod2);
    }
    
}

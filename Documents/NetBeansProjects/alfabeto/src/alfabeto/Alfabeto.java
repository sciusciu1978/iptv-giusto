
package alfabeto;


public class Alfabeto {

   
    public static void main(String[] args) {
        int indice=0;
        for (char primaLettera = 'a'; indice<26; primaLettera++) {
            
            System.out.println(primaLettera);
             System.out.println(Character.toUpperCase(primaLettera));
            indice++;
        }
    }
    
}

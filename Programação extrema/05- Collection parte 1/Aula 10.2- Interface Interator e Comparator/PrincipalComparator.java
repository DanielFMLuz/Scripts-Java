import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComparator {
    public static void main(String[] args) {
        
        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giuliana");
        listaNome.add("Jujuba");

        System.out.println("Elementos antes da ordenação: ");

        for (int i=0; i<listaNome.size(); i++)
            System.out.println(listaNome.get(i));

        Comparator<String> comparator = Collections.reverseOrder();

        Collections.sort(listaNome, comparator);

        System.out.println("Elementos depois da ordenação: ");
        
        for(String nome: listaNome){
            System.out. println(nome);
        }
    }
}
import java.util.Iterator;
import java.util.TreeSet;

public class Principal{
    public static void main(String[] args) {
        TreeSet<String> listaNome = new TreeSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giuliana");
        listaNome.add("Oswaldo");
        listaNome.add("Giuliana");
        
        Iterator<String> iterator = listaNome.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
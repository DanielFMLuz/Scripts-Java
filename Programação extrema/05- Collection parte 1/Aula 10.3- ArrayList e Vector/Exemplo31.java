import java.util.ArrayList;
import java.util.List;

public class Exemplo31 {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giuliana");
        
        System.out.println("Antes");
        
        for(String nome: listaNome){
            System.out. println(nome);
        }
        
        listaNome.remove(0);
        
        System.out.println();
        System.out.println("Depois");

        for(String nome: listaNome){
            System.out. println(nome);
        }
    }
}

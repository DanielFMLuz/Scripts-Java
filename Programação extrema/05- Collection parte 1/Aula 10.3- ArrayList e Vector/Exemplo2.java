import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giuliana");
        
        System.out.println();
        
        for(String nome: listaNome){
            System.out. println(nome);
        }
    }
}

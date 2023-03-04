import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> listaNome = new LinkedList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giuliana");
        listaNome.add(0,"Luck");
        
        System.out.println("Antes");

        for (String nome: listaNome){
            System.out.println(nome);
        }

        listaNome.set(1, "Jujuba");
        
        System.out.println();

        System.out.println("Depois");
        
        for(String nome: listaNome){
            System.out. println(nome);
        }
    }
}
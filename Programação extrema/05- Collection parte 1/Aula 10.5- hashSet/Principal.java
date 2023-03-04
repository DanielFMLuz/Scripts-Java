import java.util.HashSet;

public class Principal{
    public static void main(String[] args) {
        HashSet<String> listaNome = new HashSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giuliana");
        listaNome.add("Oswaldo");
        listaNome.add("Giuliana");
        
        for (String nome: listaNome){
            System.out.println(nome);
        }

    }
}
import java.util.LinkedHashMap;

public class Exemplo1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("vava", "Oswaldo");
        listaNomes.put("gisa", "Gisele");
        listaNomes.put("gi", "Giovanna");
        listaNomes.put("giu", "Giulianna");

        System.out.println("LinkedHashMap1: " + listaNomes);


        LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
        novaListaNomes.put("jubis", "Jujuba");

        System.out.println("Nova LinkedHashMap: " + novaListaNomes);
    }
}

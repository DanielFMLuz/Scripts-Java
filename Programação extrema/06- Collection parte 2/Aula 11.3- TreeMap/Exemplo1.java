import java.util.TreeMap;

public class Exemplo1 {
    public static void main(String[] args) {
        TreeMap<String, String> mapaNomes = new TreeMap<>();
        mapaNomes.put("vava", "Oswaldo");
        mapaNomes.put("gisa", "Gisele");
        mapaNomes.put("gi", "Giovanna");
        mapaNomes.put("giu", "Giulianna");

        System.out.println("TreeMap de nomes: " + mapaNomes);

        System.out.println("Chaves: " + mapaNomes.keySet());
        System.out.println("Valores: " + mapaNomes.values());
        System.out.println("Chave/valor: " + mapaNomes.entrySet());
    }
}

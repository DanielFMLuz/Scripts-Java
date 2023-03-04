import java.util.HashMap;

public class Exemplo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> linguagensProgramação = new HashMap<>();
        linguagensProgramação.put(1, "C++");
        linguagensProgramação.put(2, "Java");
        linguagensProgramação.put(3, "Cobol");
        System.out.println("Conteúdo do hasMap: " + linguagensProgramação);

        String valor = linguagensProgramação.get(2);
        System.out.println("Elemento da chave 2: " + valor);
    }
}

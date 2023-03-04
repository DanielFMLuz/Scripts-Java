import java.util.HashMap;

public class Exemplo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> linguagensProgramação = new HashMap<>();
        linguagensProgramação.put(1, "C++");
        linguagensProgramação.put(2, "Java");
        linguagensProgramação.put(3, "Cobol");
        System.out.println("Conteúdo do hasMap: " + linguagensProgramação);

        System.out.println("Chaves: " + linguagensProgramação.keySet());
        System.out.println("Valores: " + linguagensProgramação.values());
        System.out.println("Chave/valor: " + linguagensProgramação.entrySet());
    }
}

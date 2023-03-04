import java.util.Hashtable;

public class Exemplo3 {
    public static void main(String[] args) {
        Hashtable<Integer, String> linguagensProgramação = new Hashtable<>();
        linguagensProgramação.put(1, "C++");
        linguagensProgramação.put(2, "Java");
        linguagensProgramação.put(3, "Cobol");
        System.out.println("Conteúdo do hasTable: " + linguagensProgramação);

        String valor = linguagensProgramação.get(2);
        System.out.println("Elemento 2 " + valor);
        
    }
}

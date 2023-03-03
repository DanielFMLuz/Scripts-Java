import java.util.Scanner;

public class AulaExemplo05 {
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in);
        String nome; //Classe

        System.out.println("Digite seu nome: ");
        nome = teclado.next();

        System.out.println("Aluno " + nome);

    //-------------------------------------------------------------------------------

        int[] nota = {9,10,8}; // new int[3];

        for(int i: nota)
            System.out.println(i);

    }
}

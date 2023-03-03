import java.util.Scanner;

public class AulaExemplo02Exercício {
    public static void main(String[] args) {
        
        double nota1 = 9.0;
        double nota2 = 10;

        double media;

        media = (nota1 + nota2)/2;

        System.out.println(media);

        //----------------------------------------------------------------------------------

        int valor = 15;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor:");
        valor = teclado.nextInt();

        System.out.println(valor/2);
        System.out.println(valor%2);

    }
}

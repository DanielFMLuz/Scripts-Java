import java.util.Scanner;

public class AulaExemplo04ExercícioFor {
    public static void main(String[] args) {
        
        double nota1, nota2, media;
        Scanner input = new Scanner(System.in);
        
        for(int na=1; na<=2; na++) {

        System.out.println("Aluno" + na);
        System.out.println("Diagite a nota 1: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a nota2: ");
        nota2 = input.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("Média: " + media); 
        }
    }
}

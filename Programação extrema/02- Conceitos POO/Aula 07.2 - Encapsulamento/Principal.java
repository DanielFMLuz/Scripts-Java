public class Principal {
    public static void main(String[] args) {
        Aluno1 aluno = new Aluno1();

        aluno.setNome("Daniel");
        aluno.teste = 9;
        aluno.prova = 8;

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());
    }
}

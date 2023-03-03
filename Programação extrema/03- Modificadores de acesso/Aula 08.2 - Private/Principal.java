import discentes2.AlunoSuperior;

public class Principal{
    public static void main(String[] args) {
        AlunoSuperior aluno = new AlunoSuperior();

        aluno.setNome("Daniel");
        aluno.setTeste(9);
        aluno.setProva(10);

        System.out.println(aluno.getMedia());
    }
}
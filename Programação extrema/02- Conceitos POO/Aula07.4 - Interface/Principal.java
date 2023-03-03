public class Principal {
    public static void main(String[] args) {

        EnsinoMedio alunoEM = new EnsinoMedio();
        EnsinoSuperior alunoES = new EnsinoSuperior();

        alunoEM.nome = "josé";
        alunoEM.teste = 8;
        alunoEM.prova = 9;

        System.out.println("Aluno do Ensino Médio: ");
        System.out.println("Nome: " + alunoEM.nome);
        System.out.println("Média: " + alunoEM.getMedia());

        alunoES.nome = "Thiago";
        alunoES.teste = 8;
        alunoES.prova = 9;

        System.out.println("Aluno do Ensino Médio: ");
        System.out.println("Nome: " + alunoES.nome);
        System.out.println("Média: " + alunoES.getMedia());
    }
}



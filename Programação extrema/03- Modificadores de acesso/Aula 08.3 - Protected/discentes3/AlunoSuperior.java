package discentes3;

public class AlunoSuperior extends Aluno {
    
    public double getMedia(){
        return (teste + prova)/2;
    }

    public double getTeste(){
        return teste;
    }

    public void setTeste(double teste){
        this.teste = teste;
    }

    public double getProva(){
        return prova;
    }

    public void setProva(double prova){
        this.prova = prova;
    }

}
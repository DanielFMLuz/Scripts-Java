package discentes2;

public class AlunoSuperior extends Aluno {
    
    public double getMedia(){
        return (getTeste() + getProva())/2;
    }


}
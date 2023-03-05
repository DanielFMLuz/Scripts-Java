public class ExcecaoCustomizada2 extends Exception{
    String mensagem;
    
    ExcecaoCustomizada2(String str){
        mensagem = str;
    }

    public String toString(){
        return ("Exceção customizada: " + mensagem);
    }
}

public class ExcecaoCustomizada extends Exception {
    String mensagem;

    ExcecaoCustomizada(){
        super("Opção inválida.");
    }
}

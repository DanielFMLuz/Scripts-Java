public class Principal {
    public static void main(String[] args) {
        try{
            throw new ExcecaoCustomizada("Minha exceção");
        }
        catch (ExcecaoCustomizada excecaoCustomizada){
            System.out.println("Ocorreu uma exceção.");
            System.out.println(excecaoCustomizada.getMessage());
        }
    }
}

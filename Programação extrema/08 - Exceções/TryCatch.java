public class TryCatch {
    public static void main(String[] args) {
         try {
            int resultado =  10/0;
            System.out.println(resultado);
        } catch (Exception e){
            System.out.print("Causa: :" + e.getMessage());
        }
    }
}

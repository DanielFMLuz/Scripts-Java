public class AulaExemplo04 {
    public static void main(String[] args) {
        int numero = 1;
        while(numero <=5){
            System.out.println(numero);
            numero++;
        }
        //-------------------------------------------------------------------------------------
        
        do {
            System.out.println(numero);
            numero++;
        } while(numero <= 5);
        //--------------------------------------------------------------------------------------

        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}
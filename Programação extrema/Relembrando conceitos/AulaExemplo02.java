public class AulaExemplo02 {
    public static void main (String[] args){
        System.out.println(9+2);
        System.out.println(9-2);
        System.out.println(9*2);
        System.out.println(9/2); // divisão de inteiros é um número inteiro
        System.out.println(9.0/2);
        
        byte    x = 3;
        short   y = 4;
        int     z = 5;
        long    k = 6;
        float   u = 2;
        double  w = 3.0;
        boolean t = true;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k); // divisão de inteiros é um número inteiro
        System.out.println(u);
        System.out.println(w);
        System.out.println(t);
    

    //------------------------------------------------------------------------------------------
    
        int num1, num2;
        num1 = 6;
        num2 = 6;
        
        System.out.println(num1++); //pós fixado
        System.out.println(++num2); //pré fixado

        num1 +=2;
        System.out.println(num1);
        num1 -=2;
        System.out.println(num1);
        //o mesmo funciona para todos operadores *=, /=, %=.
    //-------------------------------------------------------------------------------------------

        int valor1, valor2;

        valor1 = 10;
        valor2 = 5;
        System.out.println(valor1 >= valor2);
        System.out.println(valor1 == valor2); //compara se é igual.
        System.out.println(valor1 != valor2); //diferente (nega a informação)
    //-------------------------------------------------------------------------------------------- 
    }
    
}

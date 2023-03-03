public class Principal {
    public static void main(String[] args) {
        
        String nome = "Daniel";
        String nomeGuerra = "Daniel";
        String sobrenome = new String ("Daniel");

        if(nome==nomeGuerra)
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");
        
        if(nome==sobrenome)
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");
        
        System.out.println(nome.length());
        System.out.println(sobrenome.length());
    }
}

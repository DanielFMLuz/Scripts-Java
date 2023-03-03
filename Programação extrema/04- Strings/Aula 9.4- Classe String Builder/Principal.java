public class Principal{
    public static void main(String[] args) {
        
        String nome = "Daniel";
        String sobrenome = "Luz";
        String nomecompleto = nome + sobrenome;
        String nomeBuffer;
        
        System.out.println(nomecompleto);

        StringBuilder buffer = new StringBuilder();

        buffer.append(nome);
        buffer.append(sobrenome);

        nomeBuffer = buffer.toString();
        
        System.out.println(nomeBuffer);
    }
}

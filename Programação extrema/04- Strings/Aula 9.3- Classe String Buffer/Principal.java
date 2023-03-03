public class Principal{
    public static void main(String[] args) {
        
        String nome = "Daniel";
        String sobrenome = "Luz";
        String nomecompleto = nome + sobrenome;
        String nomeBuffer;
        
        System.out.println(nomecompleto);

        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobrenome);

        nomeBuffer = buffer.toString();
        
        System.out.println(nomeBuffer);
    }
}

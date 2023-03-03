import java.util.ArrayList;
import java.util.Collections;

public class PrincipalProdutos {
    public static void main(String[] args) {
        
        ArrayList<Produto> s = new ArrayList<Produto>();
        
        s.add(new Produto(123, "Blusa", 520));
        s.add(new Produto(234, "Meia", 213));
        s.add(new Produto(345, "Casaco", 101));
        s.add(new Produto(456, "Boné", 59));
        s.add(new Produto(567, "Camisa", 10));

        for(Produto shop : s){
            System.out.println(shop.quantidadeDeEstoque + " " + shop.nomeProduto + " " + shop.codigoProduto);
        }
        
        System.out.println();

        System.out.println("Lista depois de ordenação");

        Collections.sort(s, new EstoqueComparator());

        for (Produto shop: s){
            System.out.println(shop.quantidadeDeEstoque + " " + shop.nomeProduto + " " + shop.codigoProduto);
        }
    }
}
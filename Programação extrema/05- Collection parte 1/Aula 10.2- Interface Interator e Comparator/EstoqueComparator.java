import java.util.Comparator;

public class EstoqueComparator implements Comparator<Produto> {
    public int compare (Produto produto1, Produto produto2)
    {
        if (produto1.quantidadeDeEstoque == produto2.quantidadeDeEstoque)
            return 0;
        else if (produto1.quantidadeDeEstoque > produto2.quantidadeDeEstoque)
            return 1;
        else
            return -1;
    }
}

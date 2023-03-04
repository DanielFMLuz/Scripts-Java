import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exemplo3 {
    public static void main(String[] args) {
        
        Set<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.add(4);
        numerosLinkedHashSet.add(7);
        numerosLinkedHashSet.add(9);
        numerosLinkedHashSet.add(3);

        Iterator<Integer> iterator = numerosLinkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }   
    }
}

package InterfaceIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ex12 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();  // Cria uma lista de números inteiros
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();  // Obtém um iterador para a lista
        while (iterator.hasNext()) {  // Verifica se há mais elementos na lista
            System.out.println(iterator.next());  // Exibe o próximo elemento e avança o iterador
        }
    }
}

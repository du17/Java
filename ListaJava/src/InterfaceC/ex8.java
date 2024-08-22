package InterfaceC;
import java.util.ArrayList;
import java.util.Collection;


public class ex8 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();  // Cria uma coleção de inteiros usando ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Total de elementos: " + numbers.size());  // Exibe o número total de elementos: 5
    }
}

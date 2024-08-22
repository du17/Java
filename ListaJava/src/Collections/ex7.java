package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex7 {
    public static void main(String[] args) {
    List<String> items = new ArrayList<>();
    items.add("Banana");
    items.add("Apple");
    items.add("Orange");

    Collections.sort(items, Collections.reverseOrder());  // Ordena a lista em ordem decrescente
    System.out.println(items);  // Exibe a lista ordenada: [Orange, Banana, Apple]
}
}

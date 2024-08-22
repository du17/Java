package InterfaceSHSLHS;
import java.util.LinkedHashSet;
import java.util.Set;

public class ex10 {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();  // Cria um conjunto de Strings com ordem de inserção preservada
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Tenta adicionar "Apple" novamente (duplicado)

        System.out.println(fruits);  // Exibe os elementos do conjunto na ordem de inserção: [Apple, Banana, Orange]
    }
}

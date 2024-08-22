package InterfaceLCAL;
import java.util.ArrayList;
import java.util.List;

public class ex9 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();  // Cria uma lista de Strings
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Cor no segundo índice: " + colors.get(1));  // Exibe a cor no segundo índice: Green
    }
}

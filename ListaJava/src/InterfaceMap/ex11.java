package InterfaceMap;
import java.util.HashMap;
import java.util.Map;

public class ex11 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();  // Cria um mapa de Strings (nomes) para Integers (idades)
        ageMap.put("John", 25);
        ageMap.put("Sara", 30);
        ageMap.put("Mike", 35);

        System.out.println("Idade de Sara: " + ageMap.get("Sara"));  // Exibe a idade associada a "Sara": 30
    }
}

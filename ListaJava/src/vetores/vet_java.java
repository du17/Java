//Crie uma coleção que armazene os nomes de três cidades e exiba-os no console.
package vetores;

import java.util.ArrayList;
import java.util.List;

public class vet_java {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>(); 
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");  
        cidades.add("Belo Horizonte"); 

        System.out.println(cidades);

    }
}

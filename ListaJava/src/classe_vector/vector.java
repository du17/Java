//Crie um Vector de inteiros e adicione quatro elementos. Exiba o conteúdo do vetor.

package classe_vector;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();  
        vector.add(5);  
        vector.add(15); 
        vector.add(25); 
        vector.add(35); 

        System.out.println("Vector: " + vector);  // Exibe o vetor: [5, 15, 25, 35]
    }
}

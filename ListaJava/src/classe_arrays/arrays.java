//crie um array de strings, ordene-o e busque por um elemento específico usando Arrays.binarySearch().
package classe_arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] names = {"Carlos", "Ana", "Bruno", "Daniela"}; 
        Arrays.sort(names);  
        System.out.println(Arrays.toString(names));  

        int index = Arrays.binarySearch(names, "Bruno");  
        System.out.println("Index of 'Bruno': " + index); 
    }
}

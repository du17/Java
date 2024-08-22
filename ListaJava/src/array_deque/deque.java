// Implemente uma fila usando ArrayDeque e adicione três elementos. Em seguida, remova e exiba o primeiro elemento inserido.
package array_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();  
        queue.add("First");  
        queue.add("Second");  
        queue.add("Third");  
        System.out.println("Removed: " + queue.remove());  
    }
}

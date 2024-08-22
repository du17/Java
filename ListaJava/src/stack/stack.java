//
package stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();  
        stack.push("First Element"); 
        stack.push("Second Element");  
        stack.push("Third Element");  

        String topElement = stack.pop();  
        System.out.println("Removed from stack: " + topElement);  
    }
}

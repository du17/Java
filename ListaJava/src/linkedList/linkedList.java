//Crie uma LinkedList de strings e adicione três elementos. Adicione um elemento no início da lista e exiba a lista completa.


package linkedList;
import java.util.LinkedList;

public class linkedList{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();  
        list.add("City A"); 
        list.add("City B"); 
        list.add("City C");  

        list.addFirst("City 0"); 

        System.out.println(list);
    }
}

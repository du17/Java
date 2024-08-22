//Implemente uma coleção personalizada que seja iterável, e itere sobre seus elementos usando um loop for-each.

package Interable;

import java.util.Iterator;
import java.util.NoSuchElementException;

class CustomCollection<T> implements Iterable<T> {
    private T[] items;
    private int count = 0;

    @SuppressWarnings("unchecked")
    public CustomCollection(int size) {
        items = (T[]) new Object[size];
    }

    public void add(T item) {
        if (count < items.length) {
            items[count++] = item;  
        } else {
            throw new IllegalStateException("Collection is full");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < count;  
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return items[currentIndex++]; 
            }
        };
    }
}

public class Interable {
    public static void main(String[] args) {
        CustomCollection<String> customCollection = new CustomCollection<>(3);
        customCollection.add("Element 1");
        customCollection.add("Element 2");
        customCollection.add("Element 3");

        for (String element : customCollection) {
            System.out.println(element);  
        }
    }
}

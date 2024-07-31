package String;

import java.lang.String;

public class Palidromo {

    public static boolean ehPalindromo(String s) {
        String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverso = new StringBuilder(original).reverse().toString();
        return original.equals(reverso);
    }
}


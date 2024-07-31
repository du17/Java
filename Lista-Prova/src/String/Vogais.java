package String;

public class Vogais {

    public static int contarVogais(String s) {
        int contador = 0;
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vogais.indexOf(s.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }
}


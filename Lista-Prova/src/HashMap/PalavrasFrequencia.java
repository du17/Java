package HashMap;

import java.util.HashMap;

public class PalavrasFrequencia {

    public static HashMap<String, Integer> contarFrequencia(String texto) {
        HashMap<String, Integer> frequencia = new HashMap<>();
        String[] palavras = texto.split("\\s+");
        for (String palavra : palavras) {
            palavra = palavra.toLowerCase();
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }
        return frequencia;
    }

    /*public static void main(String[] args) {
        String texto = "Java é uma linguagem de programação. Java é também uma ilha da Indonésia.";
        HashMap<String, Integer> frequencia = contarFrequencia(texto);

        for (String palavra : frequencia.keySet()) {
            System.out.println(palavra + ": " + frequencia.get(palavra));
        }
    }*/
}

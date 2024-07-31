package WrapperClasses;

import java.util.List;

public class MediaSoma {

    public static int calcularSoma(List<Integer> lista) {
        int soma = 0;
        for (int i : lista) {
            soma += i;
        }
        return soma;
    }

    public static double calcularMedia(List<Integer> lista) {
        int soma = calcularSoma(lista);
        return (double) soma / lista.size();
    }
}


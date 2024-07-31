package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListaValor {

    public static int encontrarMaiorValor(ArrayList<Integer> numeros) {
        return Collections.max(numeros);
    }

    public static int encontrarMenorValor(ArrayList<Integer> numeros) {
        return Collections.min(numeros);
    }
}

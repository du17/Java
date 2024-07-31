package WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class ConverterLista {

    public static List<Integer> converterLista(List<String> lista) {
        List<Integer> listaInteiros = new ArrayList<>();
        for (String s : lista) {
            listaInteiros.add(Integer.parseInt(s));
        }
        return listaInteiros;
    }
}

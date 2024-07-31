package WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConverterLista list = new ConverterLista();
        MediaSoma listMS = new MediaSoma();
        StringsSoma listSS = new StringsSoma();

        List<String> listaC = List.of("1", "2", "3", "4");
        List<Integer> listaMS = List.of(1, 2, 3, 4, 5);
        String numeros = "12, 89, 45, 78, 4";

        System.out.println(list.converterLista(listaC));


        System.out.println("Soma: " + listMS.calcularSoma(listaMS));
        System.out.println("Média: " + listMS.calcularSoma(listaMS));


        System.out.println("Soma: " + listSS.somarNumeros(numeros));
    }
}

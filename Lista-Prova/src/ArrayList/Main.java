package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa("Comprar leite");
        lista.adicionarTarefa("Estudar Java");
        lista.listarTarefas();
        lista.removerTarefa("Comprar leite");
        lista.listarTarefas();

        OrdemNumeros ON = new OrdemNumeros();
        ArrayList<Integer> numeros1 = new ArrayList<>();
        numeros1.add(5);
        numeros1.add(1);
        numeros1.add(3);
        numeros1.add(2);
        numeros1.add(4);

        System.out.println("Lista antes da ordenação: " + numeros1);
        ON.ordenamNumeros(numeros1);
        System.out.println("Lista após a ordenação: " + numeros1);

        ListaValor LV = new ListaValor();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(5);
        numeros2.add(1);
        numeros2.add(3);
        numeros2.add(2);
        numeros2.add(4);

        System.out.println("Maior valor: " + LV.encontrarMaiorValor(numeros2));
        System.out.println("Menor valor: " + LV.encontrarMenorValor(numeros2));
    }
}

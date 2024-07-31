package ArrayList;

import java.util.ArrayList;

public class ListaTarefa {

    private ArrayList<String> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        tarefas.remove(tarefa);
    }

    public void listarTarefas() {
        System.out.println("Tarefas:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }
    }
}

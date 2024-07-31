package HashMap;

import java.util.HashMap;

public class Inventario {

    private HashMap<String, Integer> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        inventario.put(nome, quantidade);
    }

    public void removerProduto(String nome) {
        inventario.remove(nome);
    }

    public Integer buscarProduto(String nome) {
        return inventario.get(nome);
    }

    public void listarProdutos() {
        System.out.println("Inventário:");
        for (String nome : inventario.keySet()) {
            System.out.println(nome + ": " + inventario.get(nome));
        }
    }
}

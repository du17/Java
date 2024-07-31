package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.adicionarProduto("Maçã", 10);
        inventario.adicionarProduto("Banana", 20);
        inventario.listarProdutos();
        inventario.removerProduto("Maçã");
        inventario.listarProdutos();

        System.out.println("\n");
        PalavrasFrequencia PF = new PalavrasFrequencia();

        String texto = "Java é uma linguagem de programação. Java é também uma ilha da Indonésia.";
        HashMap<String, Integer> frequencia = PF.contarFrequencia(texto);

        for (String palavra : frequencia.keySet()) {
            System.out.println(palavra + ": " + frequencia.get(palavra));
        }

        System.out.println("\n");
        Contatos contatos = new Contatos();
        contatos.adicionarContato("Alice", "123-4567");
        contatos.adicionarContato("Bob", "987-6543");
        contatos.listarContatos();
        System.out.println("Telefone de Alice: " + contatos.buscarContato("Alice") + "\n");
    }
}

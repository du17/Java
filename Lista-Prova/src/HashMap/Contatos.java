package HashMap;

import java.util.HashMap;

public class Contatos {

    private HashMap<String, String> contatos;

    public Contatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public String buscarContato(String nome) {
        return contatos.get(nome);
    }

    public void listarContatos() {
        System.out.println("Contatos:");
        for (String nome : contatos.keySet()) {
            System.out.println(nome + ": " + contatos.get(nome));
        }
    }
}

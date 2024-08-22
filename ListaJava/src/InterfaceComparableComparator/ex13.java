package InterfaceComparableComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex13 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Camiseta", 29.99));
        produtos.add(new Produto("Calça", 49.99));
        produtos.add(new Produto("Tênis", 89.99));

        Collections.sort(produtos);  // Ordena a lista de produtos por preço
        System.out.println("Ordenado por preço:");
        System.out.println(produtos);  // Exibe a lista ordenada por preço

        Collections.sort(produtos, new NomeComparator());  // Ordena a lista de produtos por nome
        System.out.println("Ordenado por nome:");
        System.out.println(produtos);  // Exibe a lista ordenada por nome
    }
}

class Produto implements Comparable<Produto> {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);  // Compara os preços para ordenar os produtos
    }

    @Override
    public String toString() {
        return nome + " - " + preco;
    }
}

class NomeComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.nome.compareTo(p2.nome);  // Compara os nomes para ordenar os produtos
    }
}
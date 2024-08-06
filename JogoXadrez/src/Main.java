//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        Rei rBranco = new Rei(4, 0, "branco");
        Rainha raBranca = new Rainha(3, 0, "branco");

        tabuleiro.adicionarPeca(rBranco);
        tabuleiro.adicionarPeca(raBranca);

        //movimento rei
        System.out.println("Movendo o rei para (4, 1): " + tabuleiro.moverPeca(4, 0, 4, 1));
        System.out.println("Movendo o rei para (5, 2): " + tabuleiro.moverPeca(4, 1, 5, 2));

        //movimento rainha
        System.out.println("Movendo a rainha para (3, 3): " + tabuleiro.moverPeca(3, 0, 3, 3));
        System.out.println("Movendo a rainha para (5, 5): " + tabuleiro.moverPeca(3, 3, 5, 5));
    }
}
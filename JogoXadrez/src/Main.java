import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();

        inicializarTabuleiro(tabuleiro);

        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("Bem-vindo ao Jogo de Xadrez!");
        System.out.println("Digite o comando de movimento no formato: x1 y1 x2 y2");
        System.out.println("Digite 'sair' para terminar o jogo.");

        while (true) {
            tabuleiro.exibirTabuleiro();
            System.out.print("Digite o comando de movimento: ");
            comando = scanner.nextLine();

            if (comando.equalsIgnoreCase("sair")) {
                System.out.println("Jogo encerrado. Até a próxima!");
                break;
            }

            String[] partes = comando.split(" ");
            if (partes.length != 4) {
                System.out.println("Comando inválido! Use o formato: x1 y1 x2 y2");
                continue;
            }

            try {
                int x1 = Integer.parseInt(partes[0]);
                int y1 = Integer.parseInt(partes[1]);
                int x2 = Integer.parseInt(partes[2]);
                int y2 = Integer.parseInt(partes[3]);

                Peca pecaMovida = tabuleiro.getPeca(x1, y1);
                if (pecaMovida != null && tabuleiro.moverPeca(x1, y1, x2, y2)) {
                    System.out.println("Movimento realizado com sucesso! " + pecaMovida + " movida para (" + x2 + ", " + y2 + ")");
                } else {
                    System.out.println("Movimento inválido!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Coordenadas inválidas! Use números inteiros no formato: x1 y1 x2 y2");
            }
        }

        scanner.close();
    }

    private static void inicializarTabuleiro(Tabuleiro tabuleiro) {
        // Adicionando peças brancas
        tabuleiro.adicionarPeca(new Rei(4, 0, "branco"));
        tabuleiro.adicionarPeca(new Rainha(3, 0, "branco"));
        tabuleiro.adicionarPeca(new Bispo(2, 0, "branco"));
        tabuleiro.adicionarPeca(new Bispo(5, 0, "branco"));
        tabuleiro.adicionarPeca(new Cavalo(1, 0, "branco"));
        tabuleiro.adicionarPeca(new Cavalo(6, 0, "branco"));
        tabuleiro.adicionarPeca(new Torre(0, 0, "branco"));
        tabuleiro.adicionarPeca(new Torre(7, 0, "branco"));
        for (int i = 0; i < 8; i++) {
            tabuleiro.adicionarPeca(new Peao(i, 1, "branco"));
        }

        // Adicionando peças pretas
        tabuleiro.adicionarPeca(new Rei(4, 7, "preto"));
        tabuleiro.adicionarPeca(new Rainha(3, 7, "preto"));
        tabuleiro.adicionarPeca(new Bispo(2, 7, "preto"));
        tabuleiro.adicionarPeca(new Bispo(5, 7, "preto"));
        tabuleiro.adicionarPeca(new Cavalo(1, 7, "preto"));
        tabuleiro.adicionarPeca(new Cavalo(6, 7, "preto"));
        tabuleiro.adicionarPeca(new Torre(0, 7, "preto"));
        tabuleiro.adicionarPeca(new Torre(7, 7, "preto"));
        for (int i = 0; i < 8; i++) {
            tabuleiro.adicionarPeca(new Peao(i, 6, "preto"));
        }
    }
}
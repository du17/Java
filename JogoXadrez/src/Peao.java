public class Peao extends Peca {
    private boolean primeiroMovimento;

    public Peao(int x, int y, String cor) {
        super(x, y, cor);
        this.primeiroMovimento = true;
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro tabuleiro) {
        int deltaX = novoX - this.x;
        int deltaY = novoY - this.y;

        // Movimento para frente
        if (this.cor.equals("branco")) {
            if (deltaX == 0 && deltaY == 1 && tabuleiro.getPeca(novoX, novoY) == null) {
                // Movimento para frente de uma casa
                if (!primeiroMovimento) {
                    return true;
                }
            }
            if (deltaX == 0 && deltaY == 2 && this.y == 1 && tabuleiro.getPeca(novoX, novoY) == null &&
                    tabuleiro.getPeca(novoX, this.y + 1) == null) {
                // Movimento duplo na primeira jogada
                return true;
            }
        } else {
            if (deltaX == 0 && deltaY == -1 && tabuleiro.getPeca(novoX, novoY) == null) {
                // Movimento para frente de uma casa
                if (!primeiroMovimento) {
                    return true;
                }
            }
            if (deltaX == 0 && deltaY == -2 && this.y == 6 && tabuleiro.getPeca(novoX, novoY) == null &&
                    tabuleiro.getPeca(novoX, this.y - 1) == null) {
                // Movimento duplo na primeira jogada
                return true;
            }
        }

        // Captura diagonal
        if (Math.abs(deltaX) == 1 && ((this.cor.equals("branco") && deltaY == 1) ||
                (this.cor.equals("preto") && deltaY == -1))) {
            Peca pecaNaNovaPosicao = tabuleiro.getPeca(novoX, novoY);
            if (pecaNaNovaPosicao != null && !pecaNaNovaPosicao.getCor().equals(this.cor)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void setPosicao(int x, int y) {
        super.setPosicao(x, y);
        primeiroMovimento = false;
    }
}

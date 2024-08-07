public class Torre extends Peca {

    public Torre(int x, int y, String cor) {
        super(x, y, cor);
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro T) {
        if ((novoX == this.x || novoY == this.y) && T.posicaoValida(novoX, novoY)) {
            this.x = novoX;
            this.y = novoY;
            return true;
        }

        return false;
    }
}
public class Cavalo extends Peca {

    public Cavalo(int x, int y, String cor) {
        super(x, y, cor);
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro T) {
        int deltaX = Math.abs(novoX - this.x);
        int deltaY = Math.abs(novoY - this.y);

        if (((deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2)) && T.posicaoValida(novoX, novoY)) {
            this.x = novoX;
            this.y = novoY;
            return true;
        }

        return false;
    }
}
public class Bispo extends Peca {

    public Bispo(int x, int y, String cor) {
        super(x, y, cor);
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro T) {
        int deltaX = Math.abs(novoX - this.x);
        int deltaY = Math.abs(novoY - this.y);

        if (deltaX == deltaY && T.posicaoValida(novoX, novoY)) {
            this.x = novoX;
            this.y = novoY;
            return true;
        }

        return false;
    }
}
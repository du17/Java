public class Rei extends Peca{

    public Rei(int x, int y, String cor){
        super(x, y, cor);
    }

    @Override
    public boolean mover(int novoX, int novoY, Tabuleiro T) {
        int deltaY = Math.abs(novoY - this.y);
        int deltaX = Math.abs(novoX - this.x);

        if ((deltaX <= 1 && deltaY <= 1) && T.posicaoValida(novoX, novoY)) {
            return true;
        }
        return false;
    }
}

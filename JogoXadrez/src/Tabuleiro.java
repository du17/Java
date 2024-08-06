public class Tabuleiro {
    private Peca[][] pecas;

    public Tabuleiro() {
        pecas = new Peca[8][8];
    }
    public boolean posicaoValida(int x, int y){
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public boolean adicionarPeca(Peca peca) {
        if (posicaoValida(peca.getX(), peca.getY()) && pecas[peca.getX()][peca.getY()] == null) {
            pecas[peca.getX()][peca.getY()] = peca;
            return true;
        }
        return false;
    }

    public boolean moverPeca(int x, int y, int novoX, int novoY){
        Peca peca = getPeca(x, y);
        if (peca != null && peca.mover(novoX, novoY, this)){
            pecas[novoX][novoY] = peca;
            pecas[x][y] = null;

            return true;
        }
        return false;
    }
    public Peca getPeca(int x, int y){
        if (posicaoValida(x, y)){
            return pecas[x][y];
        }
        return null;
    }

}

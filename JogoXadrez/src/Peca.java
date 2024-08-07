public abstract class Peca {
    //com private nao da pra acessar
    protected int x;
    protected int y;
    protected  String cor;

    public  Peca(int x, int y, String cor){
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public abstract boolean mover(int x, int y, Tabuleiro T);

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String getCor(){
        return cor;
    }

    public void setPosicao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName().substring(0, 2) + "-" + cor.charAt(0);
    }
}

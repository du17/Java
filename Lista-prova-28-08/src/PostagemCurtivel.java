public class PostagemCurtivel extends Postagem implements Curtivel{
    public PostagemCurtivel(String dataCriacao, String conteudo) {
        super(dataCriacao, conteudo);
    }

    @Override
    public void curtir() {
        super.curtir();
    }

    @Override
    public int getCurtidas() {
        return super.getContCurtidas();
    }
}
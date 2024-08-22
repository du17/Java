public class Postagem {
    private String dataCriacao;
    private int contCurtidas;
    private String conteudo;

    public Postagem(String dataCriacao, String conteudo){
        this.dataCriacao = dataCriacao;
        this.conteudo = conteudo;
        this.contCurtidas = 0;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public int getContCurtidas() {
        return contCurtidas;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void curtir(){
        this.contCurtidas++;
    }
}

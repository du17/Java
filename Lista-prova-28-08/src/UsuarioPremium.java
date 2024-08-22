public class UsuarioPremium extends Usuario{
    public UsuarioPremium(String nomeUsuario, String email, String senha){
        super(nomeUsuario, email, senha);
    }

    public void criarPostagemDestaque(String dataCriacao, String conteudo){
        Postagem postagemEmDestaque = new Postagem(dataCriacao, conteudo);
        System.out.println("Postagem em destaque criada: " + postagemEmDestaque.getConteudo());
    }
}

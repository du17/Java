public class UsuarioAdmin extends Usuario{
    public UsuarioAdmin(String nomeUsuario, String email, String senha){
        super(nomeUsuario, email, senha);
    }

    public void deletePostagem(Postagem postagem){
        System.out.println("Postagem deletada : " + postagem.getConteudo());
    }
}

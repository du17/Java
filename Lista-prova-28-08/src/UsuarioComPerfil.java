import java.util.ArrayList;
import java.util.List;

public class UsuarioComPerfil extends Usuario{
    private Perfil perfil;
    private List<Postagem> postagens;

    public UsuarioComPerfil(String nomeUsuario, String senha, String email, Perfil perfil) {
        super(nomeUsuario, senha, email);
        this.perfil = perfil;
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }
}

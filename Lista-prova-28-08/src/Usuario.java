public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;

    public Usuario(String nomeUsuario, String email, String senha){
        this.nomeUsuario = nomeUsuario;
        setSenha(senha);
        this.email = email;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8){
            this.senha = senha;
        }
        else {
            throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres.");
        }
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

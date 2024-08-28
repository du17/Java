public class Perfil {
    private String biografia;
    private String fotoPerfil;

    public Perfil(String biografia, String fotoPerfil) {
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}

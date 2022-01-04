package br.com.desafio.dominio;

public class Login extends Conteudo {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", email='" + getEmail() + '\'' +
                ", senha='" + getSenha() + '\'' +
                '}';
    }
}

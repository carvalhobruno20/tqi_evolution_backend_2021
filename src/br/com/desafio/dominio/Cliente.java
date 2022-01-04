package br.com.desafio.dominio;

public class Cliente extends Conteudo {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", endereco='" + endereco + '\'' +
                ", renda='" + renda + '\'' +
                ", email='" + getEmail() + '\'' +
                ", senha='" + getSenha() + '\'' +
                '}';
    }
}

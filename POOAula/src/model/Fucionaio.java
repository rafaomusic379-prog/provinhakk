package model;

public class Fucionaio  {

    public String nome;
    private String funcao;

    public Fucionaio() {
        super();
    }

    public Fucionaio(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public Fucionaio(String titular) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Fucionaio{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
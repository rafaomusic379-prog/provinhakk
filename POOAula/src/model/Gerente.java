package model;

public class Gerente extends Fucionaio {

    private String nome;
    private String funcao = "Gerente";
    private double salario = 0;

    public Gerente(String nome, String funcao) {
        super(nome, funcao);
        this.nome = nome;
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setarbonus() {

        if (funcao.equals("Gerente")) {
            System.out.println("Cargo verificado: Gerente.");
        } else {
            System.out.println("Você não possui bônus nesse dia");
        }

    }

    public void versalarioenome() {

        System.out.printf("""
                Nome: %s
                Salário: R$ %.2f
                """, nome, salario);
    }

    public void setandosalario() {

        if (!"gerente".equalsIgnoreCase(funcao)) {
            System.out.println("saia");
        } else {
            salario += 5000;
            System.out.printf("%s seu salario é %d%n", nome, salario);
        }
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
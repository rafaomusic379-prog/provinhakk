package model;

public class Desenvolvedor extends Fucionaio {
    private String nome;
    private double salario = 0;
    private String funcao;
    private String nivel;

    public Desenvolvedor(String nome, String funcao, String nivel) {
        super(nome, funcao);
        this.nome = nome;
        this.funcao = funcao;
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void vermeusalario(){
        System.out.println("seu salario " + salario);
    }

    public void setarbonus() {
        if (nivel.equals("senior")) {
            System.out.printf("Salário antigo de R$ %.2f\n", salario);
            System.out.println("Você irá receber um aumento de 30%");
            salario += 1800;
            System.out.printf("Salário atual R$ %.2f\n", salario);
        } else {
            System.out.println("Você não possui bônus");
        }
    }

    public void setandosalario(double valor) {
        if (nivel.equals("junior")) {
            if (valor <= 0) {
                System.out.println("O valor do salário não pode ser menor ou igual a 0");
            } else if (valor < 3000) {
                System.out.println("Salário de um desenvolvedor júnior não pode ser menor que 3k");
            }
            salario += valor;
            System.out.printf("Salário de %s definido para %.2f\n", nome, salario);

        } else if (nivel.equals("pleno")) {
            if (valor <= 0) {
                System.out.println("O valor do salário não pode ser menor ou igual a 0");
            } else if (valor < 4000) {
                System.out.println("Salário de um desenvolvedor pleno não pode ser menor que 4k");
            }
            salario += valor;
            System.out.printf("Salário de %s definido para %.2f\n", nome, salario);

        } else {
            if (valor <= 0) {
                System.out.println("O valor do salário não pode ser menor ou igual a 0");
            } else if (valor < 6000) {
                System.out.println("Salário de um desenvolvedor sênior não pode ser menor que 6k");
            }
            salario += valor;
            System.out.printf("Salário de %s definido para %.2f\n", nome, salario);
        }
    }
}
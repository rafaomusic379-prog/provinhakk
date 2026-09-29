import model.Desenvolvedor;

import model.Fucionaio;

import model.Gerente;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("vc é dev ou gerente");
        String opcao = scanner.nextLine();

        while (true) {


            if (opcao.equals("dev")) {
                System.out.println("digite seu nome:");
                String nome = scanner.nextLine();
                System.out.println("digite sua funcao:");
                String funcao = scanner.nextLine();
                System.out.println("digite seu nivel:");
                String nivel = scanner.nextLine();
                Desenvolvedor desenvolvedor = new Desenvolvedor(nome, funcao, nivel);

                System.out.println("1: ver salario, 2:setar salario, 3: possivel bonus, 4: sair");
                int opcaodev = scanner.nextInt();
                if (opcaodev == 1) {
                    desenvolvedor.vermeusalario();
                } else if (opcaodev == 2) {
                    System.out.println("digite valor do saldo");
                    int salariovalor = scanner.nextInt();
                    desenvolvedor.setandosalario(salariovalor);
                } else if (opcaodev == 3) {
                    desenvolvedor.setarbonus();
                } else {
                    System.out.println("fim do codigo");
                }

            } else {
                System.out.println("digite seu nome:");
                String nome = scanner.nextLine();
                System.out.println("digite sua funcao:");
                String funcao = scanner.nextLine();


                Gerente gerente = new Gerente(nome, funcao);

                System.out.println("1: ganhar salario, 2: ver salario e nome, 3: bonus,4 sair");
                int opcaogerente = scanner.nextInt();
                if (opcaogerente == 1) {
                    gerente.setandosalario();
                } else if (opcaogerente == 2) {
                    gerente.versalarioenome();

                } else if (opcaogerente == 3) {
                    gerente.setarbonus();
                } else {
                    System.out.println("acabou");
                }


            }
        }


    }
}

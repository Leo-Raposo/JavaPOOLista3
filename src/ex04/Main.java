package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario("Maria", "Analista", 3000.00, "TI");

        System.out.println("Detalhes do Funcionário antes da promoção:");
        funcionario1.exibirDetalhes();

        System.out.println("\nDigite o novo cargo do funcionário:");
        String novoCargo = sc.nextLine();
        funcionario1.setCargo(novoCargo);

        System.out.println("Digite o novo salário do funcionário:");
        double novoSalario = sc.nextDouble();
        funcionario1.setSalario(novoSalario);

        System.out.println("\nApós promoção:");
        funcionario1.exibirDetalhes();

        sc.close();
    }
}

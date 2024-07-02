package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto("Notebook", 2500.00, 10);

        produto.exibirDetalhes();

        System.out.print("Digite a quantidade para atualizar o estoque (pode ser negativo): ");
        int quantidade = sc.nextInt();
        produto.atualizarEstoque(quantidade);

        produto.exibirDetalhes();

        sc.close();
    }
}

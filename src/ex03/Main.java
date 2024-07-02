package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Deseja adicionar um novo filme? (s/n)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Diretor: ");
            String diretor = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Gênero: ");
            String genero = scanner.nextLine();

            Filme filme = new Filme(titulo, diretor, ano, genero);
            listaDeFilmes.add(filme);
        }

        System.out.println("\nLista de Filmes Cadastrados:");
        for (Filme filme : listaDeFilmes) {
            filme.mostrarDetalhes();
            System.out.println();
        }

        scanner.close();
    }
}


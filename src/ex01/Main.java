package ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 25, 1.75, 70.0);

        System.out.println("Informações iniciais:");
        pessoa.mostrarInformacoes();

        pessoa.envelhecer(5);
        pessoa.engordar(3);
        pessoa.emagrecer(2);

        System.out.println("\nInformações após modificações:");
        pessoa.mostrarInformacoes();
    }
}


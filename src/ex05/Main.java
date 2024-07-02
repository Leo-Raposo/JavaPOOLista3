package ex05;

public class Main {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Rua das Flores, 123", 3, 120.5, 350000);

        minhaCasa.exibirDetalhes();

        double valorImposto = minhaCasa.calcularValorImposto();
        System.out.println("Valor do Imposto: R$ " + valorImposto);
    }
}


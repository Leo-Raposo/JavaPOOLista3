package ex05;

public class Casa {
    private String endereco;
    private int numeroDeQuartos;
    private double area;
    private double valor;

    public Casa(String endereco, int numeroDeQuartos, double area, double valor) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.area = area;
        this.valor = valor;
    }

    public void exibirDetalhes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Quartos: " + numeroDeQuartos);
        System.out.println("Área: " + area + " m²");
        System.out.println("Valor: R$ " + valor);
    }

    public double calcularValorImposto() {
        return valor * 0.01;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}


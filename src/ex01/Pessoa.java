package ex01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void envelhecer(int anos) {
        this.idade += anos;
    }

    public void engordar(double quilos) {
        this.peso += quilos;
    }

    public void emagrecer(double quilos) {
        if (this.peso - quilos >= 0) {
            this.peso -= quilos;
        } else {
            System.out.println("Não é possível emagrecer mais do que o peso atual.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, 1.75, 70.0);

        pessoa.mostrarInformacoes();

        pessoa.envelhecer(5);
        pessoa.engordar(3);
        pessoa.emagrecer(2);

        pessoa.mostrarInformacoes();
    }
}


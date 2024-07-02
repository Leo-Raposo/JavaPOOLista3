package ex03;

public class Filme {
    private String titulo;
    private String diretor;
    private int ano;
    private String genero;

    public Filme(String titulo, String diretor, int ano, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + ano);
        System.out.println("Gênero: " + genero);
    }
}


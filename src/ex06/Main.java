package ex06;

// Main.java
public class Main {
    public static void main(String[] args) {
        Celular meuCelular = new Celular("Samsung", "Galaxy S21", 128);

        meuCelular.instalarAplicativo("WhatsApp");
        meuCelular.instalarAplicativo("Instagram");
        meuCelular.instalarAplicativo("Facebook");

        meuCelular.exibirInformacoes();
    }
}


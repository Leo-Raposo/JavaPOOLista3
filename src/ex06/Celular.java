package ex06;

import java.util.ArrayList;
import java.util.List;

public class Celular {
    private String marca;
    private String modelo;
    private int armazenamento;
    private List<String> aplicativosInstalados;

    public Celular(String marca, String modelo, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.aplicativosInstalados = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public List<String> getAplicativosInstalados() {
        return aplicativosInstalados;
    }

    public void instalarAplicativo(String aplicativo) {
        aplicativosInstalados.add(aplicativo);
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("Aplicativos Instalados: " + aplicativosInstalados);
    }
}


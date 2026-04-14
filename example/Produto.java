package org.example;

public class Produto {

    private String nome;
    private double preco;

    public double calcularDesconto(double percentual) {
        double desconto = preco * percentual;
        return preco - desconto;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " - Preço: " + preco);
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirGarantia() {
    }
}
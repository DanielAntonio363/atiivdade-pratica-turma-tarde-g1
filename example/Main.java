package org.example;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("TV", 1500);
        p1.exibirInfo();

        Produto p2 = new Produto("Xbox", 2000);
        p2.exibirGarantia();
    }
}
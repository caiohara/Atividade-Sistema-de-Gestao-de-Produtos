package com.company;

public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Roupa("Camiseta", 100));
        estoque.adicionarProduto(new Calcado("Tênis", 500));

        estoque.exibirPrecosComDesconto(10);
    }
}

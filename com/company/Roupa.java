package com.company;

public class Roupa extends Produto{
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto (double porcentagem) {
        return preco - (preco * (porcentagem/100));
    }
}

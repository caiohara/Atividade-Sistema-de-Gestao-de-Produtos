package com.company;

public class Calcado extends Produto{
    public Calcado(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * (porcentagem / 100)) - 20;
    }
}

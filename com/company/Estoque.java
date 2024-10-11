package com.company;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + ": R$ " + produto.calcularDesconto(porcentagem));
        }
    }
}

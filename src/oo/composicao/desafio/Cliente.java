package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;

    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    public double obterValorTotalCompras() {
        double totalCompra = 0;
        for (Compra compra : compras) {
            totalCompra += compra.obterValorTotal();
        }
        return totalCompra;

    }
}


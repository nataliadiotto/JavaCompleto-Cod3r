package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void addItem(Item item) {
        this.itens.add(item);
    }

    double obterValorTotal() {
        double totalItem = 0;
        for (Item item : itens) {
            totalItem += (double) item.quantidade * item.produto.preco;
        }
        return totalItem;
    }

}

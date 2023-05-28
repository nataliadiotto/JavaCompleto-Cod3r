package oo.composicao.desafio;

public class Item {
     final int quantidade;

     Produto produto = new Produto();

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}

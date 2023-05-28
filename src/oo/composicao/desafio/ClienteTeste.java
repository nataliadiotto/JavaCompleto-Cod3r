package oo.composicao.desafio;

import java.util.Locale;
import java.util.Scanner;

public class ClienteTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        Cliente cliente1 = new Cliente(nomeCliente);

        System.out.println("------- COMPRA 1 -------");
        System.out.print("Digite o nome do produto 1: ");
        String nomeProduto = sc.next();
        System.out.print("Digite o valor: ");
        double valorProduto = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int qtdProduto = sc.nextInt();
        System.out.println();

        Produto produto1 = new Produto(nomeProduto, valorProduto);
        Item item1 = new Item(produto1, qtdProduto);

        System.out.print("Digite o nome do produto 2: ");
        nomeProduto = sc.next();
        System.out.print("Digite o valor: ");
        valorProduto = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        qtdProduto = sc.nextInt();

        Produto produto2 = new Produto(nomeProduto, valorProduto);
        Item item2 = new Item(produto2, qtdProduto);

        Compra compra1 = new Compra();
        compra1.addItem(item1);
        compra1.addItem(item2);
        cliente1.adicionarCompra(compra1);

        System.out.println();
        System.out.println("------- COMPRA 2 -------");
        System.out.print("Digite o nome do produto 1: ");
        nomeProduto = sc.next();
        System.out.print("Digite o valor: ");
        valorProduto = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        qtdProduto = sc.nextInt();
        System.out.println();

        Produto produto3 = new Produto(nomeProduto, valorProduto);
        Item item3 = new Item(produto3, qtdProduto);

        System.out.print("Digite o nome do produto 2: ");
        nomeProduto = sc.next();
        System.out.print("Digite o valor: ");
        valorProduto = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        qtdProduto = sc.nextInt();

        Produto produto4 = new Produto(nomeProduto, valorProduto);
        Item item4 = new Item(produto4, qtdProduto);

        Compra compra2 = new Compra();
        compra2.addItem(item3);
        compra2.addItem(item4);
        cliente1.adicionarCompra(compra1);

        System.out.println();
        System.out.println("Valor total da(s) compra(s): " + cliente1.obterValorTotalCompras());

        sc.close();
    }
}

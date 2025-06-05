package model;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Caio");
        Pedido pedido = new Pedido();
        pedido.adicionarObservador(cliente);

        System.out.println("Bem-vindo ao sistema de pedidos online!");
        while (true) {
            System.out.println("Digite o tipo de produto (lanche/bebida) ou 'sair':");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) break;

            try {
                Produto produto = ProdutoFactory.criarProduto(entrada);
                pedido.adicionarProduto(produto);
                System.out.println(produto.getTipo() + " adicionado. R$" + produto.getPreco());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        pedido.setStatus("Recebido");
        pedido.setStatus("Em preparo");
        pedido.setStatus("Enviado");

        System.out.println("Total do pedido: R$" + pedido.calcularTotal());

        DatabaseConnection db = DatabaseConnection.getInstancia();
        db.salvarPedido(pedido);

        scanner.close();
    }
}


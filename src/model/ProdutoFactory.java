package model;

public class ProdutoFactory {
    public static Produto criarProduto(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "lanche" -> new Lanche();
            case "bebida" -> new Bebida();
            default -> throw new IllegalArgumentException("Tipo de produto inválido: " + tipo);
        };
    }
}


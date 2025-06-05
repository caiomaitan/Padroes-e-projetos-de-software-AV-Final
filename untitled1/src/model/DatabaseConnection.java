package model;

public class DatabaseConnection {
    private static DatabaseConnection instancia;

    private DatabaseConnection() {
        System.out.println("Conexão criada com o banco de dados (simulada).");
    }

    public static DatabaseConnection getInstancia() {
        if (instancia == null) {
            instancia = new DatabaseConnection();
        }
        return instancia;
    }

    public void salvarPedido(Pedido pedido) {
        System.out.println("Pedido salvo no banco (simulado). Total: R$" + pedido.calcularTotal());
    }
}


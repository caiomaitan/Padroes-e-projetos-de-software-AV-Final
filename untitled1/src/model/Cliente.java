package model;

public class Cliente implements Observador {
    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String status) {
        System.out.println("Cliente " + nome + " foi notificado: Pedido agora está '" + status + "'");
    }
}


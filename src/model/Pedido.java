package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Produto> produtos = new ArrayList<>();
    private final List<Observador> observadores = new ArrayList<>();
    private String status;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void setStatus(String status) {
        this.status = status;
        notificar();
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    private void notificar() {
        for (Observador obs : observadores) {
            obs.atualizar(status);
        }
    }
}

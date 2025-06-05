package model;

public class Lanche extends Produto {
    @Override
    public String getTipo() {
        return "Lanche";
    }

    @Override
    public double getPreco() {
        return 15.0;
    }
}


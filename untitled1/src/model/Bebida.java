package model;

public class Bebida extends Produto {
    @Override
    public String getTipo() {
        return "Bebida";
    }

    @Override
    public double getPreco() {
        return 7.0;
    }
}


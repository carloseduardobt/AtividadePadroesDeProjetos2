package questao3;

public class Cha implements Bebida {
    private static final double PRECO = 5.00;

    @Override
    public String getDescricao() { return "Chá"; }

    @Override
    public double getPreco() { return PRECO; }
}

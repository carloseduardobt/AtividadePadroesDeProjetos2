package questao3;

public class Calda extends ComplementoDecorator {
    private static final double PRECO = 2.50;

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() { return bebida.getDescricao() + " + Calda"; }

    @Override
    public double getPreco() { return bebida.getPreco() + PRECO; }
}

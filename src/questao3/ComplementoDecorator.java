package questao3;

public abstract class ComplementoDecorator implements Bebida {
    protected final Bebida bebida;

    protected ComplementoDecorator(Bebida bebida) {
        if (bebida == null) {
            throw new IllegalArgumentException("Bebida é obrigatória");
        }
        this.bebida = bebida;
    }
}

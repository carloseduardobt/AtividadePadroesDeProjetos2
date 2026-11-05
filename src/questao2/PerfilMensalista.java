package questao2;

public class PerfilMensalista implements PerfilCobranca {
    private static final double VALOR_FIXO = 250.00;

    @Override
    public String getNome() { return "Mensalista"; }

    @Override
    public double calcular(int minutosPermanencia) {
        return VALOR_FIXO;
    }
}

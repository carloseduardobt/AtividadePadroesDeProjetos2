package questao2;

public class PerfilRotativo implements PerfilCobranca {
    private static final double VALOR_POR_HORA = 8.00;

    @Override
    public String getNome() { return "Rotativo"; }

    @Override
    public double calcular(int minutosPermanencia) {
        return PerfilCobranca.horasIniciadas(minutosPermanencia) * VALOR_POR_HORA;
    }
}

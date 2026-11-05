package questao2;

public class PerfilConveniado implements PerfilCobranca {
    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_POR_HORA = 8.00;
    private static final double DESCONTO_PERCENTUAL = 30.0;

    @Override
    public String getNome() { return "Conveniado"; }

    @Override
    public double calcular(int minutosPermanencia) {
        int minutosCobraveis = Math.max(0, minutosPermanencia - MINUTOS_GRATUITOS);
        double valorCheio = PerfilCobranca.horasIniciadas(minutosCobraveis) * VALOR_POR_HORA;
        return valorCheio * (1 - DESCONTO_PERCENTUAL / 100.0);
    }
}

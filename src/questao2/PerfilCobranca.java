package questao2;

public interface PerfilCobranca {
    int MINUTOS_POR_HORA = 60;

    String getNome();

    double calcular(int minutosPermanencia);

    static int horasIniciadas(int minutos) {
        return (minutos + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA;
    }
}

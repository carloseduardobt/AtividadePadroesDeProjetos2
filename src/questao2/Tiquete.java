package questao2;

public class Tiquete {
    private final String placa;
    private final int minutosPermanencia;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutosPermanencia, PerfilCobranca perfil) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa é obrigatória");
        }
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("Tempo de permanência não pode ser negativo");
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        setPerfil(perfil);
    }

    public void setPerfil(PerfilCobranca perfil) {
        if (perfil == null) {
            throw new IllegalArgumentException("Perfil de cobrança é obrigatório");
        }
        this.perfil = perfil;
    }

    public String getPlaca() { return placa; }

    public int getMinutosPermanencia() { return minutosPermanencia; }

    public PerfilCobranca getPerfil() { return perfil; }

    public double calcularValor() {
        return perfil.calcular(minutosPermanencia);
    }
}

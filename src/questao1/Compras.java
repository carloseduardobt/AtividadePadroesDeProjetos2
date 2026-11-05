package questao1;

public class Compras implements Observador {
    private static final int LIMITE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < LIMITE_MINIMO) {
            System.out.println("[Compras] ALERTA: estoque baixo de " + nomeProduto
                    + " (" + novaQuantidade + " un.). Repor!");
        }
    }
}

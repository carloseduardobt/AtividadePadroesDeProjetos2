package questao1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Auditoria implements Observador {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = "Estoque de " + nomeProduto + " alterado para " + novaQuantidade;
        registros.add(registro);
        System.out.println("[Auditoria] " + registro);
    }

    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}

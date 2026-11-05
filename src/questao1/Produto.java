package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<Observador> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do produto é obrigatório");
        }
        validar(quantidade);
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }

    public int getQuantidade() { return quantidade; }

    public void adicionarObservador(Observador observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        validar(novaQuantidade);
        if (novaQuantidade == quantidade) {
            return;
        }
        quantidade = novaQuantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : new ArrayList<>(observadores)) {
            o.atualizar(nome, quantidade);
        }
    }

    private static void validar(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
    }
}

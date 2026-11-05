package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("--- Estoque cai para 6 (só a Auditoria registra)");
        notebook.setQuantidade(6);

        System.out.println("--- Estoque cai para 4 (Compras alerta)");
        notebook.setQuantidade(4);

        System.out.println("--- Mesma quantidade (ninguém é avisado)");
        notebook.setQuantidade(4);

        System.out.println("--- Estoque zera");
        notebook.setQuantidade(0);

        System.out.println("--- Reposição para 8 (Vendas alerta)");
        notebook.setQuantidade(8);

        System.out.println("--- Compras é removida e o estoque cai para 2");
        notebook.removerObservador(compras);
        notebook.setQuantidade(2);

        System.out.println("--- Outro produto, só com a Auditoria inscrita");
        Produto mouse = new Produto("Mouse", 3);
        mouse.adicionarObservador(auditoria);
        mouse.setQuantidade(1);

        System.out.println("--- Registros da Auditoria: " + auditoria.getRegistros().size());
    }
}

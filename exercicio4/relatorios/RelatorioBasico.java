package exercicio4.relatorios;

public class RelatorioBasico implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Relatório básico: lista de pedidos.");
    }
}

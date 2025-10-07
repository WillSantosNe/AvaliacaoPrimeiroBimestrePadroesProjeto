package exercicio4.relatorios;

public class EstatisticasDecorator extends RelatorioDecorator {
    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar(); // Primeiro executa o comportamento do objeto envolvido
        System.out.println("Adicionando estatísticas de faturamento.");
    }
}

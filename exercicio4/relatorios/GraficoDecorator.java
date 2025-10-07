package exercicio4.relatorios;

public class GraficoDecorator extends RelatorioDecorator {
    public GraficoDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Adicionando gráficos ao relatório.");
    }
}

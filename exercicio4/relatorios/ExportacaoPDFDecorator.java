package exercicio4.relatorios;

public class ExportacaoPDFDecorator extends RelatorioDecorator {
    public ExportacaoPDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Exportando relatório em PDF.");
    }
}

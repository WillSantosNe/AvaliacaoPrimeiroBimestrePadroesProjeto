package exercicio4.app;

import exercicio4.relatorios.EstatisticasDecorator;
import exercicio4.relatorios.ExportacaoPDFDecorator;
import exercicio4.relatorios.GraficoDecorator;
import exercicio4.relatorios.Relatorio;
import exercicio4.relatorios.RelatorioBasico;

public class Main {
    public static void main(String[] args) {
        // 1. Começa com o objeto base
        Relatorio relatorio = new RelatorioBasico();
        System.out.println("--- Gerando Relatório Básico ---");
        relatorio.gerar();
        System.out.println("\n");

        // 2. Decora o objeto base com novas funcionalidades
        Relatorio relatorioCompleto = new RelatorioBasico();
        relatorioCompleto = new EstatisticasDecorator(relatorioCompleto);
        relatorioCompleto = new GraficoDecorator(relatorioCompleto);
        relatorioCompleto = new ExportacaoPDFDecorator(relatorioCompleto);
        
        System.out.println("--- Gerando Relatório Completo ---");
        relatorioCompleto.gerar();
    }
}

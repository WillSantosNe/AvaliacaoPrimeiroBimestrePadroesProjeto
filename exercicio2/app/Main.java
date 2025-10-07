package exercicio2.app;

import exercicio2.meios.ProcessadorPagamento;
import exercicio2.meios.ProcessadorPagamentoFactory;

public class Main {
    public static void main(String[] args) {
        String tipoPagamento = "pix";
        double valor = 150.0;
        ProcessadorPagamento processador = ProcessadorPagamentoFactory.criar(tipoPagamento);
        
        processador.processar(valor);
    }
}

package exercicio2.meios;

public class PagamentoCartaoCredito implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento com cartão de crédito: R$ " + valor);
    }
}

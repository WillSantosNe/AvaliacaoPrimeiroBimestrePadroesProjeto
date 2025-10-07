package exercicio2.meios;

public class PagamentoBoleto implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando boleto para pagamento: R$ " + valor);
    }
}

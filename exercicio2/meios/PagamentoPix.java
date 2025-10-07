package exercicio2.meios;

public class PagamentoPix implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Pix: R$ " + valor);
    }
}

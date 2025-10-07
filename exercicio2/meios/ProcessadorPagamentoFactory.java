package exercicio2.meios;

public class ProcessadorPagamentoFactory {
    public static ProcessadorPagamento criar(String tipoPagamento) {
        // Usa toLowerCase() para tornar a comparação flexível (ex: "pix" ou "PIX")
        switch (tipoPagamento.toLowerCase()) {
            case "pix":
                return new PagamentoPix();
            case "boleto":
                return new PagamentoBoleto();
            case "cartao":
            case "crédito":
                return new PagamentoCartaoCredito();
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipoPagamento);
        }
    }
}

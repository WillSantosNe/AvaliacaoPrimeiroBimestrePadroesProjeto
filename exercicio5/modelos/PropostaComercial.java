package exercicio5.modelos;

public class PropostaComercial extends Documento {

    public PropostaComercial() {
        // Simula a carga de uma estrutura complexa inicial
        System.out.println("Estrutura da proposta comercial criada (operação custosa).");
        setFonte("Calibri");
        setCor("Azul Corporativo");
    }

    @Override
    public void exibir() {
        System.out.println("--- Proposta Comercial ---");
        System.out.println("Fonte: " + getFonte());
        System.out.println("Cor: " + getCor());
        System.out.println("Logo: " + getLogo());
        System.out.println("------------------------");
    }
}

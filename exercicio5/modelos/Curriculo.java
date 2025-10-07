package exercicio5.modelos;

public class Curriculo extends Documento {

    public Curriculo() {
        // Simula a carga de uma estrutura complexa inicial
        System.out.println("Estrutura do currículo criada (operação custosa).");
        setFonte("Arial");
        setCor("Preto e Branco");
    }

    @Override
    public void exibir() {
        System.out.println("--- Currículo ---");
        System.out.println("Fonte: " + getFonte());
        System.out.println("Cor: " + getCor());
        System.out.println("Logo: " + getLogo());
        System.out.println("-----------------");
    }
}

package exercicio5.app;

import exercicio5.modelos.Curriculo;
import exercicio5.modelos.Documento;
import exercicio5.modelos.PropostaComercial;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Criando os modelos mestre ===");
        Documento modeloCurriculo = new Curriculo();
        Documento modeloProposta = new PropostaComercial();
        System.out.println("\n");
        
        System.out.println("=== Gerando documento para Cliente A ===");
        Curriculo curriculoClienteA = (Curriculo) modeloCurriculo.clone();
        curriculoClienteA.setLogo("Logo Cliente A");
        curriculoClienteA.setCor("Verde e Branco");
        
        System.out.println("=== Gerando documento para Cliente B ===");
        Curriculo curriculoClienteB = (Curriculo) modeloCurriculo.clone();
        curriculoClienteB.setLogo("Logo Cliente B");

        System.out.println("\n=== Documentos Finalizados ===");
        modeloCurriculo.exibir();   // O modelo original permanece intacto
        curriculoClienteA.exibir(); // Cópia personalizada
        curriculoClienteB.exibir(); // Outra cópia personalizada
        
        modeloProposta.exibir();    // O outro modelo também está disponível
    }
}

package exercicio3.app;

import exercicio3.noticias.*;
public class Main {
    public static void main(String[] args) {
        // 1. Criando os Tópicos (Subjects)
        Topico politica = new TopicoConcreto("Política");
        Topico esportes = new TopicoConcreto("Esportes");
        Topico tecnologia = new TopicoConcreto("Tecnologia");

        // 2. Criando os Leitores (Observers)
        Leitor william = new LeitorConcreto("William");
        Leitor maria = new LeitorConcreto("Maria");
        Leitor joao = new LeitorConcreto("João");

        // 3. Inscrevendo os leitores nos tópicos de interesse
        politica.registrarLeitor(william);
        politica.registrarLeitor(maria);
        
        esportes.registrarLeitor(maria);
        
        tecnologia.registrarLeitor(william);
        tecnologia.registrarLeitor(joao);

        // 4. Publicando notícias (o que dispara as notificações)
        System.out.println("--- Publicando Notícias ---");
        politica.publicarNoticia("Nova reforma tributária é aprovada.");
        esportes.publicarNoticia("Brasil vence Copa do Mundo.");
        tecnologia.publicarNoticia("Novo smartphone com IA é lançado.");
    }
}

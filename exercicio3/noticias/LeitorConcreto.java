package exercicio3.noticias;

public class LeitorConcreto implements Leitor {
    private String nome;

    public LeitorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String topico, String noticia) {
        System.out.println("[" + nome + "] Nova notícia em " + topico + ": " + noticia);
    }
}

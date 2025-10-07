package exercicio3.noticias;

import java.util.ArrayList;
import java.util.List;

public class TopicoConcreto implements Topico {
    private String nome;
    private List<Leitor> leitores = new ArrayList<>();

    public TopicoConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void registrarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    @Override
    public void removerLeitor(Leitor leitor) {
        leitores.remove(leitor);
    }

    @Override
    public void publicarNoticia(String noticia) {
        // Notifica todos os leitores inscritos
        for (Leitor leitor : leitores) {
            leitor.receberNotificacao(nome, noticia);
        }
    }
}

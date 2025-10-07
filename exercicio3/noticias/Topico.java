package exercicio3.noticias;

public interface Topico {
    void registrarLeitor(Leitor leitor);
    void removerLeitor(Leitor leitor);
    void publicarNoticia(String noticia);
}

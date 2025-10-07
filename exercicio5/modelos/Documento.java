package exercicio5.modelos;

// Implementa Cloneable para habilitar a clonagem de objetos
public abstract class Documento implements Cloneable {

    private String cor;
    private String fonte;
    private String logo;

    public abstract void exibir();

    // Getters e Setters para personalização
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public String getFonte() { return fonte; }
    public void setFonte(String fonte) { this.fonte = fonte; }
    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

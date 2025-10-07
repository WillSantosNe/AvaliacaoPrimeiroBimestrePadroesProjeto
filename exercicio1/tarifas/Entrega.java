package exercicio1.tarifas;

public class Entrega {
    private double distanciaKm;
    private double pesoKg;

    public Entrega(double distanciaKm, double pesoKg) {
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }
}

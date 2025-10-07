package exercicio1.tarifas;

public class CalculoMaritimo implements EstrategiaCalculoTarifa {
    @Override
    public double calcularTarifa(Entrega entrega) {
        // Exemplo: combinação de peso e distância
        return entrega.getPesoKg() * 5.0 + entrega.getDistanciaKm() * 0.2;
    }
}

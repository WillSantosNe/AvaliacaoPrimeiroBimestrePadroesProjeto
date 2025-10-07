package exercicio1.tarifas;

public class CalculoTerrestre implements EstrategiaCalculoTarifa {
    @Override
    public double calcularTarifa(Entrega entrega) {
        // Exemplo: 50 centavos por km
        return entrega.getDistanciaKm() * 0.5;
    }
}

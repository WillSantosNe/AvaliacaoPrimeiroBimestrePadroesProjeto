package exercicio1.tarifas;

public class CalculoAereo implements EstrategiaCalculoTarifa {
    @Override
    public double calcularTarifa(Entrega entrega) {
        // Exemplo: 10 reais por kg
        return entrega.getPesoKg() * 10.0;
    }
}

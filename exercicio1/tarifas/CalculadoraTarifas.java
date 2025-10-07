package exercicio1.tarifas;

public class CalculadoraTarifas {
    private EstrategiaCalculoTarifa estrategia;

    public void setEstrategia(EstrategiaCalculoTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(Entrega entrega) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de cálculo não definida.");
        }
        return estrategia.calcularTarifa(entrega);
    }
}

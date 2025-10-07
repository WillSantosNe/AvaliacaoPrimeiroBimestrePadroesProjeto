package exercicio1.app;

import exercicio1.tarifas.CalculadoraTarifas;
import exercicio1.tarifas.CalculoAereo;
import exercicio1.tarifas.CalculoMaritimo;
import exercicio1.tarifas.CalculoTerrestre;
import exercicio1.tarifas.Entrega;

public class Main {
    public static void main(String[] args) {
        // Exemplo de entrega: 100 km de distância e 20 kg de peso
        Entrega entrega = new Entrega(100, 20);

        CalculadoraTarifas calculadora = new CalculadoraTarifas();

        // Calcular com estratégia terrestre
        calculadora.setEstrategia(new CalculoTerrestre());
        System.out.println("Tarifa terrestre: R$ " + calculadora.calcular(entrega));

        // Calcular com estratégia aérea
        calculadora.setEstrategia(new CalculoAereo());
        System.out.println("Tarifa aérea: R$ " + calculadora.calcular(entrega));

        // Calcular com estratégia marítima
        calculadora.setEstrategia(new CalculoMaritimo());
        System.out.println("Tarifa marítima: R$ " + calculadora.calcular(entrega));
    }
}

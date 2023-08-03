package POO.entities;

public class CurrencyConverter {

    public static final double IOF = 6.0;

    public static double amountReais(double dollarPrice, double dollars) {
        double grossValue = dollars * dollarPrice;
        return (grossValue) * IOF / 100.0 + grossValue;
    }
}

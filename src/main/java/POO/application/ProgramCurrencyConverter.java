package POO.application;

import POO.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amountDollars = scanner.nextDouble();

        System.out.println("Amount to be paid in reais = " + String.format("%.2f",
                CurrencyConverter.amountReais(dollar, amountDollars)));
    }
}

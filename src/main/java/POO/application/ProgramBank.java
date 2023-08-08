package POO.application;

import POO.entities.Bank;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();

        System.out.print("Is there an initial deposit? (y/n)? ");
        switch (scanner.next().charAt(0)) {
            case 'y' -> {
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = scanner.nextDouble();

                Bank bankClient = new Bank(number, name, initialDeposit);

                updateData(bankClient);
            }
            case 'n' -> {
                Bank bankClient = new Bank(number, name);

                updateData(bankClient);
            }
            default -> System.out.println("This option doesn't exists!");
        }
    }

    public static void updateData(@NotNull Bank bankClient) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAccount data:\n" + bankClient + "\n");

        System.out.print("Enter a deposit value: ");
        bankClient.depositValue(scanner.nextDouble());

        System.out.println("Updated account data:\n" + bankClient + "\n");

        System.out.print("Enter a withdraw value: ");
        bankClient.withdrawValue(scanner.nextDouble());

        System.out.println("Updated account data:\n" + bankClient);
    }
}

package POO.application;

import POO.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.printf("%n%s%n", employee);

        System.out.print("\nWhich percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.printf("%nUpdated data: %s", employee);

    }
}

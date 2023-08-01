package POO.application;

import POO.Exercises.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f", rectangle.area());
        System.out.printf("%nPERIMETER = %.2f", rectangle.perimeter());
        System.out.printf("%nDIAGONAL = %.2f", rectangle.diagonal());
    }
}

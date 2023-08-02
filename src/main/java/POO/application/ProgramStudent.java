package POO.application;

import POO.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.name = scanner.nextLine();
        student.firstGrade = scanner.nextDouble();
        student.secondGrade = scanner.nextDouble();
        student.thirdGrade = scanner.nextDouble();

        System.out.println(student.getFinalGrade());
    }
}

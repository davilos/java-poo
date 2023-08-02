package POO.entities;

public class Student {

    public String name;

    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public String getFinalGrade() {
        double finalGrade = firstGrade + secondGrade + thirdGrade;

        if (finalGrade >= 60.00) {
            return "FINAL GRADE = " + String.format("%.2f", finalGrade) + "\nPASS";
        } else {
            return "FINAL GRADE = " + String.format("%.2f", finalGrade) + "\nFAILED" + "\nMISSING " +
                    (60.00 - finalGrade) + " POINTS";
        }
    }
}

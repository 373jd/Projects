import java.util.Scanner;

public class Tests {

    private int count;
    private double average;

    public Tests() {
        count = 0;
        average = 0;
    }

    public void getAverage() {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double score;

        System.out.print("Enter a test score (-1 to quit): ");
        score = input.nextDouble();

        while (score != -1) {

            sum = sum + score;
            count = count + 1;

            System.out.print("Enter a test score (-1 to quit): ");
            score = input.nextDouble();
        }

        average = sum / count;
    }

    public String toString() {

        return String.format(
            "The average of the %d scores entered is %.2f.",
            count, average
        );
    }
}

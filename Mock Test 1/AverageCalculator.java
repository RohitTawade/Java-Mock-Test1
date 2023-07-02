import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, count = 0;
        double sum = 0;

        do {
            // Getting the input from user
            System.out.print("Enter a number (-1 to stop): ");
            number = scanner.nextInt();

            // check number is equal to -1 or not 
            if (number != -1) {
                sum += number;
                count++;
            }
        } while (number != -1);

        // check count is not equal to zero or not 
        if (count != 0) {
            double average = sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
        scanner.close();
    }
}

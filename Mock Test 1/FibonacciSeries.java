import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Print the Fibonacci series
        System.out.println("Fibonacci series up to " + number + ":");
        fibonacciSeries(number);
        scanner.close();
    }

    public static void fibonacciSeries(int n) {
        // Initialize the first two numbers
        int a = 0, b = 1;

        // Print the first two numbers
        System.out.print(a + " " + b + " ");

        // Generate and print the Fibonacci series
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        
    }
    
}

import java.util.Scanner;

public class LargestTheeNumbers {
    public static void main(String[] args) {
        

        Scanner scanner=new Scanner(System.in);

        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();

        if(number1>number2) {
            if(number2>number3) {
                System.out.println("Number 1 is large: "+number2);
            }
            else
            {
                System.out.println("Number 2 is large: "+number1);
            }
        }
        else {
            if(number2>number3) {
                System.out.println("Number 2 is large: "+number2);
            }
            else {
                    System.out.println("Number 3 is large: "+number3);
            }
        }
         scanner.close();
    }
}

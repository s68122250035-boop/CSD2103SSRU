import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = sc.nextInt();

        int max = number1;

        if (number2 > max) {
            max = number2;
        }

        if (number3 > max) {
            max = number3;
        }

        System.out.println("Maximum number = " + max);

        sc.close();
    }
}

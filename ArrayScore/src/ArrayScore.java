import java.util.Scanner;

public class ArrayScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int sum = 0;
        double average;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
            sum += score[i];
        }

        average = (double) sum / 5;

        System.out.println("Total score = " + sum);
        System.out.println("Average score = " + average);

        sc.close();
    }
}

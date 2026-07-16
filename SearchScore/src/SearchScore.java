import java.util.Scanner;

public class SearchScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];

        System.out.println("กรอกคะแนนนักศึกษา 10 คน");

        for (int i = 0; i < score.length; i++) {
            System.out.print("คะแนนคนที่ " + (i + 1) + " : ");
            score[i] = sc.nextInt();
        }

        System.out.print("กรอกคะแนนที่ต้องการค้นหา : ");
        int find = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < score.length; i++) {
            if (score[i] == find) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}

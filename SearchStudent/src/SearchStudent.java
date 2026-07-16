import java.util.Scanner;

public class SearchStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] students = {"Somchai", "Somsri", "Anan", "Nok", "Jane"};

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(searchName)) {
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

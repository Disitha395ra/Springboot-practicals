import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();

        int left = n / 2;

        // Print first half in reverse order
        for (int i = left; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Print second half in reverse order
        for (int j = n; j >= left + 1; j--) {
            System.out.print(j + " ");
        }
    }
}

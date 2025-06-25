import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < count; i++) {
            int num = 2 * i + 1;
            System.out.print(num);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}

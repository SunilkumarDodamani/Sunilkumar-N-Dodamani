import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        String[] inputStr = scanner.nextLine().split(" ");

        int[] input = new int[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int number : input) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        System.out.println(countMap);
    }
}

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((Math.abs(a-b) + 9) / 10);
            testCases--;
        }

    }
}

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (count <= n) {
            if (count % 2 == 0) {
                System.out.print("I hate ");
            } else {
                System.out.print("I love ");
            }
            count++;
            if (count == n) {
                System.out.print("it");
                break;
            } else {
                System.out.print("that ");
            }
        }
    }
}

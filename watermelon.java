import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slices = sc.nextInt();
        if (slices % 2 == 0 && slices > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

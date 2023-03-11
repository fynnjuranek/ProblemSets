import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if (numb % 10 != 0) {
                numb--;
            } else {
                numb /= 10;
            }
        }
        System.out.println(numb);

    }
}

import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actions = sc.nextInt();
        int x = 0;
        while (actions > 0) {
            String act = sc.next();
            if (act.contains("++")) {
                x++;
            } else {
                x--;
            }
            actions--;
        }
        System.out.println(x);
    }
}

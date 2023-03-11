import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cords = sc.nextInt();
        int count = 0;
        while (cords != 0) {
            if (cords - 5 >= 0) {
                cords -= 5;
                count += 1;
                continue;
            }
            if (cords - 4 >= 0) {
                cords -= 4;
                count += 1;
                continue;
            }
            if (cords - 3 >= 0) {
                cords -= 3;
                count += 1;
                continue;
            }
            if (cords - 2 >= 0) {
                cords -= 2;
                count += 1;
                continue;
            }
            if (cords - 1 >= 0) {
                cords -= 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}

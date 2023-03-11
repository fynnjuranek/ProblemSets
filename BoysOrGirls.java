import java.util.HashMap;
import java.util.Scanner;

public class BoysOrGirls {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] name = sc.nextLine().toCharArray();
        HashMap<Integer, Character> seen = new HashMap<>();
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (!seen.containsValue(name[i])) {
                seen.put(i, name[i]);
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}

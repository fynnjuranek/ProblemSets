import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "";
        String cap = s.toUpperCase();
        char[] sen = s.toCharArray();
        sen[0] = cap.charAt(0);
        for (int i = 0; i < sen.length; i++) {
            result += sen[i];
        }
        System.out.println(result);
    }

}

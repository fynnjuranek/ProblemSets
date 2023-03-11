import java.util.Scanner;

public class QueueAtSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kids = sc.nextInt();
        int swaps = sc.nextInt();
        char[] queue = sc.next().toCharArray();
        String result = "";
        while (swaps > 0) {
            for (int i = 0; i < queue.length-1; i++) {
                if (queue[i] == 'B' && queue[i+1] == 'G') {
                    char tmp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = tmp;
                    i++;
                }
            }
            swaps--;
        }
        for (int j = 0; j < queue.length; j++) {
            result += queue[j];
        }
        System.out.println(result);
    }
}

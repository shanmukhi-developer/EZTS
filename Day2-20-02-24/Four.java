import java.util.*;

public class Four {
    public static int lucky(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 4) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(lucky(n));
        }
    }
}
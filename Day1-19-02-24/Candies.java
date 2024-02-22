import java.util.*;

public class Candies {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            if (n > c) {
                int k = n - c;
                if (k % 4 == 0) {
                    System.out.println(k / 4);
                } else {
                    System.out.println((k / 4) + 1);
                }
            }

        }
    }
}
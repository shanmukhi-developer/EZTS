import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int rev = 0;
            while (n > 0) {
                int last = n % 10;
                rev = (rev * 10) + last;
                n /= 10;
                System.out.println(rev);
            }
        } else if (n == 0) {
            System.out.println(n);
        } else {
            int rev = 0;
            n = n * -1;
            while (n < 0) {
                int last = n % 10;
                rev = (rev * 10) + last;
                n /= 10;

            }
            System.out.println(-1 * rev);
        }
    }

}
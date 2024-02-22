import java.util.*;

public class Append {
    public static void reverse1(int n) {
        n = (n * 10) + 3;
        while (n != 0) {
            int rev = 0;
            int ans = n % 10;
            rev = (rev * 10) + ans;
            n /= 10;
        }
        n = (n * 10) + 3;

        while (n != 0) {
            int rev = 0;
            int ans = n % 10;
            rev = (rev * 10) + ans;
            n /= 10;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse1(n));
    }
}
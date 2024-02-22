import java.util.*;

public class Movie {
    public static int minutes(int x, int y) {
        int first = y / 2;
        int second = x - first;
        return second;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(minutes(x, y));
        }
    }
}
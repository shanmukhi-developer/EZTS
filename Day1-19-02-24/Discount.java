import java.util.*;

public class Discount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int price = 100 - d;
            System.out.println(price);
        }
    }
}
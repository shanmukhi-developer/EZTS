import java.util.*;

public class Sugarcane {
    public static double profit(int n) {
        double total = n * 50;
        double cane = total * 0.7;
        return total - cane;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(profit(n));
        }
    }
}
import java.util.*;

public class Temperate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (x > 98) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
import java.util.*;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        n = n % 2 == 0 ? n / 2 : (n / 2) + 1;
        if (p > n) {
            p = p - n;
            System.out.println(2 * p);
        } else {

            System.out.println((2 * p) - 1);
        }
        sc.close();
    }
}

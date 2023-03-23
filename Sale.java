import java.util.*;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] <= 0) {
                sum += (int) Math.abs(a[i]);
                m--;
                if (m == 0) {
                    break;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

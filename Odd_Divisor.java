import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("Yes");
                continue;
            }
            if (arr[i] <= 2) {
                System.out.println("no");
                continue;
            } else {
                long m = arr[i];
                while (m != 2) {
                    if (m % 2 == 1) {
                        flag = true;
                        break;
                    }
                    m /= 2;
                }
                System.out.println(flag ? "yes" : "no");
                flag = false;
            }
        }
        sc.close();
    }
}

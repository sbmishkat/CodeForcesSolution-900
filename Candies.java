import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int k = 2;; k++) {
                if (arr[i] % (int)(Math.pow(2, k) - 1) == 0) {
                    System.out.println(arr[i] / (int)(Math.pow(2, k) - 1));
                    break;
                }
            }
        }

        sc.close();
    }
}

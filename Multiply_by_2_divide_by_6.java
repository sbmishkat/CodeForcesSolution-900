import java.util.Scanner;

public class Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0, count2 = 0, n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            while (arr[i] % 2 == 0) {
                arr[i] /= 2;
                count1++;
            }
            while (arr[i] % 3 == 0) {
                arr[i] /= 3;
                count2++;
            }
            if (arr[i] == 1 && count1 <= count2) {
                System.out.println((count2 - count1) + count2);
            } else {
                System.out.println(-1);
            }
            count1 = 0;
            count2 = 0;
        }

        sc.close();
    }
}
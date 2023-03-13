import java.util.*;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1, max = 1, n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 1;
            }

        }
        System.out.println(max);
        sc.close();
    }
}

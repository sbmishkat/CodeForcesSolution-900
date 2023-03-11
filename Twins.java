import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, sumTake = 0, sumLeft = 0, n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sumLeft += arr[i];
        }
        sumLeft /= 2;
        Arrays.sort(arr);
        for (int i = n - 1; i > 0; i--) {
            sumTake += arr[i];
            if (sumTake > sumLeft) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count + 1);
        sc.close();
    }
}
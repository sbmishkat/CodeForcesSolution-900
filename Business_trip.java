import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Business_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, k = sc.nextInt();
        Integer[] month = new Integer[12];
        for (int i = 0; i < 12; i++) {
            month[i] = sc.nextInt();
        }
        Arrays.sort(month, Collections.reverseOrder());
        if (k == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        for (int i = 0; i < 12; i++) {
            sum += month[i];
            if (k > sum) {
                count++;
            } else {
                break;
            }
            if (count == 12) {
                count = -2;
            }
        }
        System.out.println(++count);
        sc.close();
    }
}
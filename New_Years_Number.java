import java.util.Scanner;

public class New_Years_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2020 <= arr[i] / 2021) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }

}

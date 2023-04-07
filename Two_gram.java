import java.util.Arrays;
import java.util.Scanner;

public class Two_gram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, max = 0, c1 = 0, n = Integer.parseInt(sc.nextLine());
        String word = sc.nextLine();
        char[] wc = word.toCharArray();
        char[] a = new char[2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (wc[i] == wc[j] && wc[i + 1] == wc[j + 1]) {
                    count++;
                    if (count > max) {
                        max = count;
                        a[0] = wc[i];
                        a[1] = wc[i + 1];
                    }
                }
            }
            count = 0;
        }
        System.out.println(a[0] +""+ a[1]);
        sc.close();
    }

}
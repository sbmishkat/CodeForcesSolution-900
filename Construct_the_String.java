import java.util.Scanner;

public class Construct_the_String {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            char[] string = new char[b];
            for (int i = 0; i < b; i++) {
                string[i] = letters.charAt(i);
            }
            int k = 0;
            while (n != 0) {
                System.out.print(string[k]);
                k++;
                if (k == b) {
                    k = 0;
                }
                n--;
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
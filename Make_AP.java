import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((2 * b) - c > 0 && ((2 * b) - c) % a == 0) {
                System.out.println("YES");
            } else if ((a + c) % (2 * b) == 0) {
                System.out.println("yes");
            } else if (2 * b - a > 0 && (2 * b - a) % c == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            t--;
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Kana_and_Dragon_Quest_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int x = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (x - (n * 10) <= 0) {
                System.out.println("YES");
                t--;
                continue;
            }
            for (int i = 0; i < m; i++) {
                x = (x / 2) + 10;
            }
            x = x - (n * 10);
            System.out.println(x > 0 ? "NO" : "YES");
            t--;
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Vasya_and_Socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = 1; i * b <= a; i++) {
            a++;
        }
        System.out.println(a);
        sc.close();
    }
}

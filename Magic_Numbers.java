import java.util.Scanner;

public class Magic_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        boolean flag = c1(n) && o14(n) && c444(n);
        System.out.println(flag ? "YES" : "NO");
        sc.close();
    }

    public static boolean c1(String n) {
        return n.charAt(0) == '1';
    }

    public static boolean o14(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '1' && n.charAt(i) != '4') {
                return false;
            }
        }
        return true;
    }

    public static boolean c444(String n) {
        for (int i = 0; i <= n.length() - 3; i++) {
            if (n.charAt(i) == '4' && n.charAt(i + 1) == '4' && n.charAt(i + 2) == '4') {
                return false;
            }
        }
        return true;
    }

}
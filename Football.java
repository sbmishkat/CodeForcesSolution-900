import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
            } else {
                if (count >= 6) {
                    break;
                }
                count = 0;
            }
        }
        System.out.println(count >= 6 ? "YES" : "NO");
        sc.close();
    }
}
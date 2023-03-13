import java.util.*;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n=Math.min(x,y);
            System.out.println(n % 2 == 0 ? "Malvika" : "Akshat");
        sc.close();
    }
}

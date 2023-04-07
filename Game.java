import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0, count2 = 0, count = 0, t = Integer.parseInt(sc.nextLine());
        while (t != 0) {
            String n = sc.nextLine();
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '1') {
                    count1++;
                } else {
                    count2++;
                }
            }
            count = Math.min(count1, count2);
            if (count % 2 == 1) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
            count1 = 0;
            count2 = 0;
            t--;
        }
        sc.close();
    }
}
import java.util.Scanner;

public class HQ9plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'H' || word.charAt(i) == 'Q' || word.charAt(i) == '9') {
                System.out.println("YES");
                sc.close();
                return;
            }

        }
        System.out.println("NO");
        sc.close();
    }
}

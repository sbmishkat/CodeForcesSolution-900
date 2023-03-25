import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = "qwertyuiopasdfghjkl;zxcvbnm,./";
        char shift = sc.nextLine().charAt(0);
        String cword = sc.nextLine();
        if (shift == 'R') {
            for (int i = 0; i < cword.length(); i++) {
                for (int j = 0; j < key.length(); j++) {
                    if (cword.charAt(i) == key.charAt(j)) {
                        System.out.print(key.charAt(j - 1));
                    }
                }
            }
        } else {
            for (int i = 0; i < cword.length(); i++) {
                for (int j = 0; j < key.length(); j++) {
                    if (cword.charAt(i) == key.charAt(j)) {
                        System.out.print(key.charAt(j + 1));
                    }
                }
            }
        }
        sc.close();
    }
}
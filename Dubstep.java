import java.util.*;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.replace("WUB", " ");
        System.out.println(word);
        sc.close();
    }
}

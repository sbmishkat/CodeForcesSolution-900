import java.util.*;

public class IlyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) {
            a = Math.abs(a);
            int last = a % 10, blast = (a % 100)/10;
            if (last < blast) {
                a = ((a / 100) * 10) + last;
            } else {
                a = a / 10;
            }
            System.out.println(0-a);
        } else {
            System.out.println(a);
        }
        sc.close();
    }
}

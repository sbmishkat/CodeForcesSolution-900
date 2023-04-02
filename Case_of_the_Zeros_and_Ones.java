import java.util.Scanner;

public class Case_of_the_Zeros_and_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = 0, zero = 0, n = Integer.parseInt(sc.nextLine());
        String num = sc.nextLine();
        for (char i : num.toCharArray()) {
            if (i == '1') {
                one++;
            }
            if (i == '0') {
                zero++;
            }
        }
        if (one >= zero) {
            System.out.println(one - zero);
        } else {
            System.out.println(zero - one);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Vasya_and_Socks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(),sum=a;
        while(a>=b){
            sum=sum+(a/b);
            a=(a/b)+(a%b);
        }
        System.out.println(sum);
        sc.close();
    }
}

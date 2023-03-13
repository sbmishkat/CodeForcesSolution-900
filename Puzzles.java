import java.util.*;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=1001,n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < m-(n-1); i++) {
            if(arr[i+(n-1)]-arr[i]<min){
                min=arr[i+(n-1)]-arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}

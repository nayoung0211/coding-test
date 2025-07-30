import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int total = n*d*d;
        int x =0;

        for(int i = 1; i < n; i++){
            int d1 = sc.nextInt();
            x += d*d1;
        }

        System.out.println(total-x);
    }
}

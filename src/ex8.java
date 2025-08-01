import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int total = 0;
        for(int i = 0; i < 7; i++) {
            total += n;
            n = (n*x/100);
        }
        System.out.println(total);
    }
}

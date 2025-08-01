import java.util.Scanner;

public class c117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a+b*m;

        int close = 0;

        for(int i=0;i<n;i++){
            int sales = sc.nextInt();
            int profits = sales*c-total;

            if(profits<0){
                close++;
            }
        }
        System.out.println(close);


    }

}

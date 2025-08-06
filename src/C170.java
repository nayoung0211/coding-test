import java.util.Scanner;

public class C170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] prices = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
            total = total+prices[i]/100;
        }
        if(total >= m){
            System.out.println("0");
        }else if(total < m){
            int result = (m-total)*100;
            System.out.println(result);
        }
    }
}

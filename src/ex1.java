import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();


        int sum = 0;
        int maxEligible = -1;

        for(int i = 0; i < a; i++) {
            int price = sc.nextInt();
            sum += price;
            if(price >=b &&price > maxEligible) {
                maxEligible = price;
            }
        }
        if(maxEligible != -1) {
            sum -= maxEligible/2;
        }
        System.out.println(sum);
    }
}
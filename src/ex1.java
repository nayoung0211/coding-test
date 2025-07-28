import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(sc.nextLine());

        int sum = 0;
        int maxEligible = -1;

        for(int i = 0; i < a; i++) {
            int price = Integer.parseInt(st.nextToken());
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
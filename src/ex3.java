import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int c : coins) {
            count += price / c;
            price %= c;
        }

        // println은 자동으로 개행(\n)을 붙여줍니다.
        System.out.println(count);


    }
}
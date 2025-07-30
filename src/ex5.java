import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < n; i++){
            int distance = sc.nextInt();
            if(distance <= m){
                sum += distance;
            }
        }
        System.out.println(sum);



    }
}

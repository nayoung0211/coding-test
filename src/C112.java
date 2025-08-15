import java.util.Scanner;

public class C112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            int s = sc.nextInt(); // 출발 시각
            int f = sc.nextInt(); // 비행 시간
            int t = sc.nextInt(); // 도착 시각

            int dayLength = s + f + (24 - t); // 정확한 하루 시간 계산

            minTime = Math.min(minTime, dayLength);
            maxTime = Math.max(maxTime, dayLength);
        }

        System.out.println(minTime);
        System.out.println(maxTime);
    }
}

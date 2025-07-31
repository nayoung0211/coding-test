import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();  // 당신의 초기 레벨

        for (int i = 0; i < N; i++) {
            int enemy = sc.nextInt();

            if (L > enemy) {
                // 승리
                L += enemy / 2;
            } else if (L < enemy) {
                // 패배
                L /= 2;
            }
            // 같으면 무승부 (아무 변화 없음)
        }
        System.out.println(L);
    }
}

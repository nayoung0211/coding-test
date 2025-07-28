import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());  // 당신의 초기 레벨

        for (int i = 0; i < N; i++) {
            int enemy = Integer.parseInt(br.readLine());

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

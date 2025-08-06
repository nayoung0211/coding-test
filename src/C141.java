import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // 개행 문자 처리

        Map<String, Integer> voteCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            voteCount.put(name, voteCount.getOrDefault(name, 0) + 1);
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println(winner);
        sc.close();
    }
}

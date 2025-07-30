import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();// 광고로 판정할 단어
        int N = sc.nextInt();// 메일 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String title = sc.nextLine();// 공백 포함 전체 제목 한 줄 읽기

            if (title.contains(S)) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        System.out.print(sb.toString());
    }
}

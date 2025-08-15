import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<String> flowers = new HashSet<>();
        for (int i = 0; i < N; i++) {
            flowers.add(sc.next());
        }

        System.out.println(flowers.size());

    }

}

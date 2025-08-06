import java.util.Scanner;

public class C143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = s.replaceAll("-{2,}", "-");
        System.out.println(result);

    }
}

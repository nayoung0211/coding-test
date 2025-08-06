import java.util.Scanner;

public class B154 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        boolean [] row = new boolean[r];
        boolean [] col = new boolean[c];

        for(int i = 0; i < r; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < c; j++) {
                if(line.charAt(j) == '#') {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(row[i] || col[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}

import java.util.Scanner;

public class C114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String [] words = new String[N];

        for(int i = 0; i < N; i++) {
            words[i] = sc.next();
        }

        boolean isValid = true;
        for(int i = 0; i < N-1; i++) {
            String current = words[i];
            String next = words[i+1];

            char first = current.charAt(current.length()-1);
            char last = next.charAt(0);
            if(first != last) {
                System.out.println(first+" "+last);
                isValid = false;
                break;
            }

        }
        if(isValid) {
            System.out.println("Yes");
        }




    }

}

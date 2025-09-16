import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        for (int t = 0; t < N; t++) {
            int m = sc.nextInt();
            long f = 1;

            for (int i = 1; i <= m; i++) {
                f=f*i;
            }
                    System.out.println(f);

        }

    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int even = 0, odd = 0, pos = 0, neg = 0;

        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();

            if (m > 0) {
                pos++;
            } else if (m < 0) {
                neg++;
            }

            if (m % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();
        int DigitN = (int)(N % 10);
        int DigitM = (int)(M % 10);
        int sum = DigitN + DigitM;
        System.out.println(sum);

    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();

        if (N == (int) N) {
            System.out.println("int " + (int) N);
        } else {
            int integer = (int) N;
            double decimal = N - integerPart;
            System.out.println("float " + integer + " " + decimal);
        }
    }
}

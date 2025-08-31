import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();
        long numerator = n * k;

        if (numerator % a == 0) {
            long result = numerator / a;
            if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        } else { 
            System.out.println("double");
        }
    }
}

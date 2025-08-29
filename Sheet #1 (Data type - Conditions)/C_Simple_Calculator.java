import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long sum = x + y;
        long mul = x * y;
        long sub = x - y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " * " + y + " = " + mul);
        System.out.println(x + " - " + y + " = " + sub);

        sc.close();
    }
}

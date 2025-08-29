import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double s = (double) A / B;
        System.out.println("Floor " + A + " / " + B + " = " + (int)Math.floor(s));
        System.out.println("Ceil " + A + " / " + B + " = " + (int)Math.ceil(s));
        System.out.println("Round " + A + " / " + B + " = " + (int)Math.round(s));
    }
}

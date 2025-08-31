import java.util.Scanner;
public class JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long lastTwo = 1;
        lastTwo = (lastTwo * (A % 100)) % 100;
        lastTwo = (lastTwo * (B % 100)) % 100;
        lastTwo = (lastTwo * (C % 100)) % 100;
        lastTwo = (lastTwo * (D % 100)) % 100;

        System.out.printf("%02d\n", lastTwo);
    }}

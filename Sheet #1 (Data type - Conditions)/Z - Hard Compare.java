import java.util.Scanner;
public class JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        double logQ = B * Math.log(A);
        double logW = D * Math.log(C);

        if (logQ > logW) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();
        sc.next(); 
        int C = sc.nextInt();
        if (S.equals("+")) {
            if (A + B == C) {
                System.out.println("Yes");
            } else {
                System.out.println(A+B);
            }
        } else if (S.equals("-")) {
            if (A - B == C) {
                System.out.println("Yes");
            } else {
                System.out.println(A-B);
            }
        } else if (S.equals("*")) {
            if (A * B == C) {
                System.out.println("Yes");
            } else {
                System.out.println(A*B);
            }
        }

    }}

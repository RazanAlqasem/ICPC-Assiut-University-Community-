sol 1:

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int g = 1; 
        for (int i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                g = i; 
            }
        }
        
        System.out.println(g);
    }
}
-----------------------------
sol2 :

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        System.out.println(A);
    }
}

sol 1 :
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0; 
        int b = 1; 
 
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                System.out.print(a + " ");
            } 
            else if (i == 2) {
                System.out.print(b + " ");
            }
            else {
                int c = a + b; 
                System.out.print(c + " ");
                a = b; 
                b = c;
            }
        }
    }
}

sol 2 :
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fib = new int[N];

        if (N >= 1) fib[0] = 0;
        if (N >= 2) fib[1] = 1; 

    
        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}

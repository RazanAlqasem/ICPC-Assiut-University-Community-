import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean Prime = true;

        if (n == 1) {
            Prime = false; 
        } else {
         
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}



        

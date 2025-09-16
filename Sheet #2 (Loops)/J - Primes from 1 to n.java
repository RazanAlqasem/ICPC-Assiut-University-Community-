import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int a=1;a<=n ; a++) {
               boolean Prime = true;
               
         if (a == 1) {
          Prime = false; 
            } else {
         
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    Prime = false;
                    break;
                }
            }
        
              if (Prime) {
                System.out.print(a + " ");
        }}
    }
} }

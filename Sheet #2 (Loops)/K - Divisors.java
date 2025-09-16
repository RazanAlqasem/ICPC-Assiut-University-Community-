import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int a = 1; a <= n; a++) {   
             if (n % a ==0) {
                System.out.println(a);
            }
            }

           
    }
}

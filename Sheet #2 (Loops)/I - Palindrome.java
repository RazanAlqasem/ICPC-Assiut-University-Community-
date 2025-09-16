import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int temp = n;           
        int rev = 0;            

        while (temp > 0) {
            int digit = temp % 10;     
            rev = rev * 10 + digit;     
            temp = temp / 10;          
        }

        System.out.println(rev);

        if (n == rev) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int l = a / 10; 
        int m = a % 10; 
        if ((m != 0 && l % m == 0) || (l != 0 && m % l == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

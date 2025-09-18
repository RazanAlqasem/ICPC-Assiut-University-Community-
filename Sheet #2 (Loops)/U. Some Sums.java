import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int sum2 = 0; 

        for (int i = 1; i <= N; i++) {
            int n = i;
            int sum1 = 0;
            while (n > 0) {
                int l=  n % 10; 
                sum1 = sum1+l;
                 n= n/ 10;          
            }
            if (sum1 >= A && sum1 <= B) {
                sum2 = sum2+i; 
            }
        }
        System.out.println(sum2); 
    }
}

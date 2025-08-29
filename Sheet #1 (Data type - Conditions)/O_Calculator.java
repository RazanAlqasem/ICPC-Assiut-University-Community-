import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.next(); 
        char op = '+';
        int index = 0;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                op = c;
                index = i;
                break;
            }
        }

        int A = Integer.parseInt(expr.substring(0, index));
        int B = Integer.parseInt(expr.substring(index + 1));

        int result = 0;
        if (op == '+') result = A + B;
        else if (op == '-') result = A - B;
        else if (op == '*') result = A * B;
        else if (op == '/') result = A / B;

        System.out.println(result);
    }
}

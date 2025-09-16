import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        boolean f =false ;
        while (true){
            int m= sc.nextInt();
             if (m==1999){
                System.out.println("Correct");
                break;
                           }
             else 
                 System.out.println("Wrong");
     }
	}
}

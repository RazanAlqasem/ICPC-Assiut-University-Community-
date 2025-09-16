import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean f = false ;
        for (int i=1;i<=N; i++){
           if (i%2==0 ) {
            System.out.println(i);
          f= true ; }
        }
        if (f==false){
        System.out.println("-1");
        }
	}
}



        

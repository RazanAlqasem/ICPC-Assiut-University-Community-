import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       int N= sc.nextInt();
       int m= sc.nextInt();
       int max =m;

    for(int i =0;i<N-1 ; i++)  {
     int z = sc.nextInt();
             if (max < z){
                max =z;
          }}
     System.out.println(max);


	}
}

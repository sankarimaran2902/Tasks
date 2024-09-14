package Patterns;
import java.util.Scanner;
public class Number_Decreasing_Pyramid {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n Value:");
        int n=scan.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println( );
        }
    }
}

package Patterns;
import java.util.Scanner;
public class Number_Changing_Pyramid
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
        System.out.println("Enter n value for rows:");
        int n=scan.nextInt();
        //num-print changing numbers
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println( );
        }
    }
}

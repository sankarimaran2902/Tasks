package Patterns;
import java.util.Scanner;
public class Palindrome_Triangle
{
    public static void main(String[] args)
    {
        //to get input from user using Scanner class
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=scan.nextInt();
        //Outer loop to handle number of rows in traingle
        //Runs from i=1 to n
        for(int i=1;i<=n;i++)
        {
            //Print spaces before number in each row.Runs from j=1 to 2*(n-i)
            //It gives the centered pattern for triangle.
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            //Prints First part of number in row.starts at i and decrement j untill '1' comes
            //i=3,the numbers 3 2 1 (Descending part)
            for(int j=i;j>=1;j--)
            {
                System.out.print(j +" ");
            }
            //Prints second part of numbers in row .starts at 2 and increment j untill i
            //i=3,print 2 3
            for(int j=2;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println( );
        }
    }
}

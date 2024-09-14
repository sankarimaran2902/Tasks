package Patterns;

public class Number_Increasing_Pyramid
{
    //'n'-Number of rows we want and for loop runs
    public static void pyramid(int n)
    {
        //i-print rows in each iteration(if we print 'i' in output it gives same values in pyramid.)
        for(int i=1;i<=n;i++)
        {
            //j-print columns and increasing numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args)
    {
           int n=5;
           pyramid(n);
    }
}

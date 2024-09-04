package Patterns;
public class SquareHollowPattern
{
    //patterns method is declared with argument of 'n' -How many times loop want to run
    public static void patterns(int n)
    {
        //(Outer loop) -Checks the condition 'true' and moves to inner loop(One time execution of 'i'=>inner loop fully executed)
        //i=rows(Ex:i=0;0<6"True"
        //i=1;1<6"true" it will again moves to inner loop
        for(int i=0;i<n;i=i+1)
        {
            //(Inner loop) fully executed for each iteration
            //j=column(Ex:for one iteration of i loop it checks j=0,1,2,3,4,5,6 checks the condition and executes
            //Terminate only for condition is false again move to outer loop
            for(int j=0;j<n;j=j+1)
            {
                //If any one condition true it will print *
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }
                //It will print space when the (if condition) is false
                else
                {
                 System.out.print(" ");
                }
            }
            //After completion of one iteration of outer loop print Blank line
            System.out.println( );
        }
    }
    //Main method
    public static void main(String[] args)
    {
        //initialise 'n' value
        int n=6;
        //calls the method
        patterns(n);
    }
}

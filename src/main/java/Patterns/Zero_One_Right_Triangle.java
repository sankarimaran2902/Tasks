package Patterns;
import java.util.Scanner;
public class Zero_One_Right_Triangle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n Value for rows:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");

                for (int k = 1; k <= i; k++) {

                    if ((i + j) % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            }

            System.out.println( );
        }
    }
}

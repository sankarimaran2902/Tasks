package Patterns;
public class Odd_numberPalindrome {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
      /*  for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }                                   To print '*' in traingle form of 1,2 3,4,5.( *
            for (int j = 1; j <= i; j++) {                                                  * *
                System.out.print(" *");                                                    * * *
            }                                                                             * * * *
            System.out.println();                                                        * * * * *)
        }*/
    }
}


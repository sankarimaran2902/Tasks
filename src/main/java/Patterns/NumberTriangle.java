package Patterns;

public class NumberTriangle
{
      public static void pattern(int n) {
          for (int i = 1; i <= n; i++) {
              for (int j = 1; j <= n - i; j++) {
                  System.out.print(" ");
              }
              for (int k = 1; k <= i; k++) {
                  System.out.print(i + " ");
              }
              System.out.println();
          }
      }
      public static void main(String[] args)
      {
          int n=6;
          pattern(n);
      }
}

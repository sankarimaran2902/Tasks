package Patterns;

public class NumberTriangle
{
    //Method Declaration for pattern execution with 'n' argument passed
    //'n'-how many rows you want
      public static void pattern(int n) {
          //Outer loop-If the condition is true it will moves to inner loop1
          for (int i = 1; i <= n; i++) {
              //Inner loop1-Will print the Spaces for (n-i)concept
              //for i=1,(n-1) o/p:    space 1 space
              //if i=2,(n-2) o/p :space 2 space 2 space
              for (int j = 1; j <= n - i; j++) {
                  System.out.print(" ");
              }
              //Inner loop2-will print the i values
              //o/p: 1
              //o/p:2 2
              //Avoid using same variables to avoid the errors and use i,j,k if required
              for (int k = 1; k <= i; k++) {
                  System.out.print(i + " ");
              }
              //When enter into next iteration of (outer loop), before print an Empty line
              System.out.println();
          }
      }
      //Main method
      public static void main(String[] args)
      {
          //initialise n
          int n=6;
          //call the method pattern to access in main method
          pattern(n);
      }
}

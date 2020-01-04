import java.util.Scanner;
class AddNumbers
{
   public static void main(String args[])
   {
      int x, y, z;

      System.out.println("Enter two integers to calculate their sum");
      Scanner in = new Scanner(System.in);
     
      x = 65;
      y = 35;
      z = x + y;
     
      System.out.println("Sum of the integers = " + z);
   }
}

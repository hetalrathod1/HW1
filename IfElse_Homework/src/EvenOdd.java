import java.util.Scanner;

public class EvenOdd
{
    public static void main (String args[])
    {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer number = ");
     int a = scanner.nextInt();
     System.out.println("Enter second integer number = ");
     int b = scanner.nextInt();

     String ans = (a%2 == 0) ? "even" : "odd";
     System.out.println(a+" is "+ans);

      ans = (b%2 == 0) ? "even" : "odd";
      System.out.println(b+" is "+ans);


    }
}

import java.util.Scanner;

public class SwapNumber
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a =scan.nextInt();
        System.out.println("Enter b = ");
        int b = scan.nextInt();
        System.out.println("a="+a);
        System.out.println("b="+b);
       // store value of a & b
        int c = a;
        //swap value
        a=b;
        b=c;



        System.out.println("a="+a);
        System.out.println("b="+b);


    }
}

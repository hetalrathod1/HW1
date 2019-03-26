import java.util.Scanner;

public class Calculator
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number = ");
        int a=scanner.nextInt();
        System.out.println("enter second number = ");
        int b=scanner.nextInt();
        System.out.println("enter symbol = ");
        char ch =scanner.next().charAt(0);
        if (ch =='+')
            System.out.println(a+b);
        else if (ch == '/')
            System.out.println(a/b);
        else if (ch == '*')
            System.out.println(a*b);
        else if (ch == '-')
            System.out.println(a-b);
        else
        {
            System.out.println("invalid");
        }
    }
}

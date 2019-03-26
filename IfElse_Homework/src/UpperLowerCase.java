import java.util.Scanner;

public class UpperLowerCase
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter alphabet in uppercase: ");
        String a =scanner.next();
        String b =a.toLowerCase();
        System.out.println("print in lower case : "+b);
// enter in lower case n print in uppercase
        String c=a.toUpperCase();
        System.out.println("print in upercase "+c);

    }
}

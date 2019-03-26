import java.util.Scanner;

public class Num_Alpha_symbol
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value");
        char character =scanner.next().charAt(0);
       // ASCII value ranges-

        //    For capital alphabets 65 – 90
        //For small alphabets 97 – 122
        //For digits 48 – 57
        //All other cases are Special Characters.
        if ((character>=65 && character<=90)||(character>=97 && character<=122))
        {
            System.out.println("this value is  alphabet");
        }
        else if ((character>=48 && character<=57))
        {
            System.out.println("this value is digit");
        }
        else
        {
            System.out.println("special character" );
        }
    }
}

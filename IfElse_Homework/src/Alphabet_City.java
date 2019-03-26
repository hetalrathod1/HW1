import java.util.Scanner;

public class Alphabet_City
{
    public static void main (String args[])
    {

        char alphabet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet =");
         alphabet = scanner.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'A' )
        {
            System.out.println("City = "+"Ahmedabad");
        }
       else if (alphabet == 'b' || alphabet == 'B' )
        {
            System.out.println("City = "+"Bombay");
        }
       else if (alphabet == 'c' || alphabet == 'C' )
        {
            System.out.println("City = "+"Calcutta");
        }
       else if (alphabet == 'd' || alphabet == 'D' )
        {
            System.out.println("City = "+"Delhi");
        }
       else if (alphabet == 'e' || alphabet == 'E' )
        {
            System.out.println("City = "+"England");
        }
       else if (alphabet == 'f' || alphabet == 'F' )
    {
        System.out.println("City = "+"France");
    }
        else
        {
            System.out.println("invalid");
        }

    }
}

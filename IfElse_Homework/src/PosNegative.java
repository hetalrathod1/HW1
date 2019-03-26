import java.util.Scanner;

public class PosNegative
{

        public static void main(String args[])
        {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter   number");
            int a = scanner.nextInt();
            if(a>0)
            {
                System.out.println("number is positive");
            }
            else if (a<0)
            {
                System.out.println("number is negative");
            }
            else if (a==0)
            {
                System.out.println("number is zero");
            }
        }
    }



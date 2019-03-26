import java.util.Scanner;

public class Day_Week
{
    public static void main(String args [])
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Day no is : ");
        int daynumber = scanner.nextInt();
        if (daynumber==1)
        {
            System.out.println("monday");
        }
        else if (daynumber==2)
        {
            System.out.println("tuesday");
        }
        else if (daynumber==3)
        {
            System.out.println("wednesday");
        }
        else if (daynumber==4)
        {
            System.out.println("thursday");
        }
        else if (daynumber==5)
        {
            System.out.println("friday");
        }
        else if (daynumber==6)
        {
            System.out.println("saturday");
        }
        else if (daynumber==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}

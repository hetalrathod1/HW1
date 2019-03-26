import java.util.Scanner;

public class Age_Vote
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age = ");
        int age =scanner.nextInt();
        if (age>=18)
            System.out.println("person is elligible to vote");
        else
        {
            System.out.println("person is not elligible to vote");
        }
    }
}

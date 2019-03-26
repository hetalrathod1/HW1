import java.util.Scanner;

public class PassingMarks
{
    public static void main (String args[]) {
        int rollno;
        int total;
        int result;
        double percentage;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter roll no =");
        rollno=scanner.nextInt();
        System.out.println("Enter student name = ");
        name = scanner.next();
        System.out.println("Enter maths marks = ");
        int maths =scanner.nextInt();
        System.out.println("Enter science marks = ");
        int science = scanner.nextInt();
        System.out.println("Enter physics marks = ");
        int physics = scanner.nextInt();
        total = maths+science+physics;

        System.out.println("Total marks = "+total);

        percentage =(total/3);
        System.out.println("percentage = "+percentage);


        if (maths >= 35 && physics >= 35 && physics >= 35) {
            System.out.println("hetal is pass");
        } else {
            System.out.println("hetal is fail");


        }
    }

}

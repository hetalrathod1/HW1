import java.util.Scanner;

public class SalraySlip
{
    public static void main(String args [])
    {
        int employeeid;
        String name;
        int basicsalary;
        int grosssalary;
        int HRA;
        int DA;
        int TA;
        int PF;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter eployeeid = ");
        employeeid = scanner.nextInt();
        System.out.println("Employee name = ");
        name = scanner.next();
        System.out.println("Basic Salary = ");
        basicsalary = scanner.nextInt();
        HRA = (basicsalary*10)/100;
        System.out.println("HRA = "+HRA);
        DA = (basicsalary*8)/100;
        System.out.println("DA = "+DA);
        TA = (basicsalary*9)/100;
        System.out.println("TA = "+TA);
        PF = (basicsalary*20)/100;
        System.out.println("PF = "+PF);
        grosssalary =basicsalary + HRA + TA + DA -PF;
        System.out.println("Grosssalary = "+grosssalary);


    }


}

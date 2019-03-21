public class Marksheet
{

    static int total;
    static double perc;

    static void TotalMarks(int maths,int science,int english)
    {
        total=maths+science+english;
        System.out.println(total);
    }
    static void Percentage(int maths,int science,int english)
    {
        total=maths+science+english;
        perc=(total/3)*100;

        System.out.println(perc);
    }
    public static void main (String args[])
    {
        TotalMarks(35,65,75);
        Percentage(65,55,75);

    }
}


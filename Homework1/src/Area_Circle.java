public class Area_Circle
{
    //pi =pi value 3.14
    static double pi = 3.14;
    static double a;
    //r =radius
    static int r = 10;
   // no argument no return
    static void calc1()
    {
        a=pi*r*r;
        System.out.println(a);
    }
    // with argument no return
    static void calc(double pi, int r)
    {
        a=pi*r*r;
        System.out.println(a);
    }
    public static void main (String args[])
    {

        System.out.println(pi*r*r);
     // no argument no return value
        calc1();
        // with argument
        calc(3.14,10);
    }
}

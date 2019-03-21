public class Hypotenuse_Value {
    static int a = 3;
    static int b = 4;
    static int val = ((a * a) + (b * b));

    // no argument no return
    static void Hypo_Value() {
        val = ((a * a) + (b * b));
        System.out.println(val);
    }
    // with argument no return
    static void Hypo_Value1(int a,int b)
    {
        val=((a*a)+(b*b));
        System.out.println(val);
    }
//main method
    public static void main (String args[])
    {
       //ans without argument
        Hypo_Value();
        // ans with argument
        Hypo_Value1(4,2);
    }

}
public class Calculater
{
//inside the class - outside the method with static keyword
    static int a = 20; //static/class variable
    static int b = 25;
    static int c = 3;

//no return type no argument user define method
    static void add()
    {

        System.out.println(a + b);

    }
    static void sub()
    {
        System.out.println(a-b);
    }
    //no return type with argument
    static void multi(int a,int b)
    {
        System.out.println(a*b);
    }
    static void div(int a,int b)
    {
        System.out.println(a/b);
    }
    // one argument n one static
    static void div1(int a)
    {
        System.out.println(a/c);
    }

    // main method
    public static void main(String[] args)
    {
        add();
        sub();
        multi(10,2);
        div1(6);
        div(8,4);
        }
}


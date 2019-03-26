import java.util.Scanner;

public class SalesCommission {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saled id = ");
        int id = scanner.nextInt();
        System.out.println("seller name = ");
        String name = scanner.next();
        System.out.println("sales amount = ");
        int sales = scanner.nextInt();
        System.out.println("salary basic = ");
        int salary = scanner.nextInt();

        if (sales >= 50000) {
            System.out.println(sales * 35 / 100);
        } else if (sales >= 30000 && sales<50000 ) {
            System.out.println(sales * 20 / 100);
        } else if (sales >= 20000 && sales<30000) {
            System.out.println(sales * 10 / 100);
        } else if (sales >= 10000 && sales<20000) {
            System.out.println(sales * 5 / 100);
        } else if (sales < 10000) {
            System.out.println(sales * 2 / 100);
        }
    }
}

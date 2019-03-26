import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter alphabet :");
        char alphabet = scanner.next().charAt(0);
        if ((alphabet == 'a') || (alphabet == 'e') || (alphabet == 'i') || (alphabet == 'o') || (alphabet == 'u') || (alphabet == 'A') || (alphabet == 'E') || (alphabet == 'I') || (alphabet == 'O') || (alphabet == 'U'))

        {
            System.out.println(" alphabet is Vowel");
        }
        else if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
            System.out.println("alphabet is consonant");
        } else {
            System.out.println("invalid");
        }

    }
}

import java.util.Scanner;

public class e1b {

    public static void main(String[] args) {
        String sName;
        char ch;
        System.out.println("Enter a character");
        Scanner sin = new Scanner(System.in);
        sName = sin.next();
        ch = sName.charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(sName + " is a letter.");
        }
        if (Character.isDigit(ch)) {
            System.out.println(sName + " is a number.");
        }
    }
}
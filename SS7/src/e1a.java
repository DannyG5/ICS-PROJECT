import java.util.Scanner;

    public class e1a {

    public static void main(String[] args) {
        String sName;
        char ch;
        System.out.println("Enter a letter");
        Scanner sin = new Scanner(System.in);
        sName = sin.next();
        ch = sName.charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(sName + " is an uppercase character.");
        }
    }
}

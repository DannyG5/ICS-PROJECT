//a ) Have the user input their first name. The program will check to make sure none of the characters inputted are numeric.
// Then, the program will correct the user if their name is not capitalised properly: first letter caps, and the rest in lower case.
// You should create two different methods for this: isGood() - to check if the name is good, and then fixIt() in order to fix the name:
// fixIt should ensure the first letter is capitalized and the rest of the name is in lower case.
import java.util.Scanner;

public class e2a {

    public static void main(String[] args) {
        String sName;
        char ch;
        System.out.println("Enter your name");
        Scanner sin = new Scanner(System.in);
        sName = sin.next();
        ch = sName.charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println("your name cant have digits in it");
        }
    }
}

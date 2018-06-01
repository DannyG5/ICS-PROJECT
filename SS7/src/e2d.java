import java.util.Scanner;

public class e2d {

    public static void main(String[] args) {
        String sName;
        System.out.println("Enter your name");
        Scanner sin = new Scanner(System.in);
        sName = sin.next();
        String reverse = new StringBuffer(sName).reverse().toString();
        System.out.println(reverse);
    }
}

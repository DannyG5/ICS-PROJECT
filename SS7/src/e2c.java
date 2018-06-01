
import java.util.Scanner;

public class e2c {
    public static void main(String[] args) {
        String sName;
        char ch = 'e';
        int nCount = 0;
        System.out.println("Enter a word");
        Scanner sin = new Scanner(System.in);
        sName = sin.next();
        System.out.println("Length of the word:" + sName.length());
        for (int i = 0; i < sName.length(); i++) {
            if (sName.charAt(i) == ch) {
                nCount++;
            }
        }
        for (int i = 0; i < sName.length(); i++) {
            if (sName.charAt(i) == 'e') {
                System.out.println("There is an e at"+i);

            }
        }
        System.out.println("Number of e's:" + nCount);
    }
}
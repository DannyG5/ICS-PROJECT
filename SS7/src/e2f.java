import java.util.Scanner;

public class e2f {

    public static void main(String[] args) {
        String sName;
        char ch = 'e';
        int nCount = 0;
        System.out.println("Enter a word");
        Scanner sin = new Scanner(System.in);
        sName = sin.next();
        for (int i = 0; i < sName.length(); i++) {
            if (sName.charAt(i) == 'e') {
                System.out.println("There is an e at"+i);

            }
        }

    }
}

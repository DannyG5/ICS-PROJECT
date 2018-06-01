import java.util.Scanner;
public class e2e {

    public static void main(String[] args) {
        int nCount=0;
        String sLine = "How it going";
        Scanner sParse = new Scanner(sLine);
        for(int i = 0; sParse.hasNext(); i++){
            System.out.println(sParse.next());
            nCount++;
        }
        System.out.println("Number of words:" + nCount);
    }

}

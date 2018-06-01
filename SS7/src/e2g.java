public class e2g {

    public static void main(String[] args) {
        int nCh, nTotal = 0;
        String sName = "45123";
        char ch;
        for (int i = 0; i < sName.length(); i++) {
            ch = sName.charAt(i);
            nCh = ch - '0';
            nTotal = nTotal + nCh;
        }
        if (nTotal % 3 == 0) {
            System.out.println(+nTotal + "\t" +"is divisible by 3");
        }
    }
}
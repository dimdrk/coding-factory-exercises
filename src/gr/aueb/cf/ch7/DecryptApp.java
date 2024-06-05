package gr.aueb.cf.ch7;

/**
 * The program decrypts a given string by replacing
 * every character with the previous one of the ASCII code.
 */
public class DecryptApp {

    public static void main(String[] args) {
        StringBuilder decryptedS = new StringBuilder();
        String s = "Buifot!Vojwfstjuz!pg!Fdpopnjdt!boe!Cvtjoftt";

        for (char ch : s.toCharArray()) {
            int temp;
            temp = (int) ch - 1;
            ch = (char) temp;
            decryptedS.append(ch);
        }

        System.out.println("The encrypted string: " + s);
        System.out.println("The decrypted string: " + decryptedS);
    }
}

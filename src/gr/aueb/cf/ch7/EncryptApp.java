package gr.aueb.cf.ch7;

/**
 * The program encrypts a given string by replacing
 * every character with the next one of the ASCII code.
 */
public class EncryptApp {

    public static void main(String[] args) {
        StringBuilder encryptedS = new StringBuilder();
        String s = "Athens University of Economics and Business";

        for (char ch : s.toCharArray()) {
            int temp;
            temp = (int) ch + 1;
            ch = (char) temp;
            encryptedS.append(ch);
        }

        System.out.println("The given string: " + s);
        System.out.println("The encrypted string: " + encryptedS);
    }
}

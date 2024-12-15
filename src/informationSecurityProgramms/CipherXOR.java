package informationSecurityProgramms;

public class CipherXOR {
    static String xorCipher(String str, char key) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            newStr.append((char)(c ^ key));
        }
        return newStr.toString();
    }
    public static void main(String[] args){
        String str = "Soumyadip Dey";
        char key = 'K';
        // Encryption
        String encrypted = xorCipher(str, key);
        System.out.println("Encrypted: " + encrypted);
        // Decryption
        String decrypted = xorCipher(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}

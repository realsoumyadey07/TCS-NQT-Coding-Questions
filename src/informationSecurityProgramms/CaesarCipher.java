package informationSecurityProgramms;

public class CaesarCipher {
    static String encrypt(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                char ch = (char) (((c-'A'+3)%26)+'A');
                newStr.append(ch);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) (((c-'a'+3)%26)+'a');
                newStr.append(ch);
            } else if (c == ' ') { // ' ' space == '%'
                newStr.append('%');
            }
        }
        return newStr.toString();
    }
    static String decrypt(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' - 3 + 26) % 26) + 'A');
                newStr.append(ch);
            } else if (Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' - 3 + 26) % 26) + 'a');
                newStr.append(ch);
            } else if (c == '%') {
                newStr.append(' ');
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args){
        String str = "LQIRUPDWLRQ VHFULWB";
        String encrypted = encrypt(str);
        String decrypted = decrypt(encrypted);
        System.out.println(encrypted);
        System.out.println(decrypted);
    }
}

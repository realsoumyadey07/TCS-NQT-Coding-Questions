package smartHiringCoddingRevision.string;

public class ChangeLetterWithLexicographicAlpha {
    static String changeTheLetters(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                char c = (char) (((ch - 'A' + 1) % 26) + 'A');
                newStr.append(c);
            } else if (Character.isLowerCase(ch)){
                char c = (char) (((ch - 'a' + 1) % 26) + 'a');
                newStr.append(c);
            } else {
                newStr.append(ch);
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args){
        String str = "abcdxyz";
        String newStr = changeTheLetters(str);
        System.out.println(newStr);
    }
}

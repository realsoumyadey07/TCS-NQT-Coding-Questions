package smartHiringCoddingRevision.string;

public class NumberOfWords {
    static int countTheNumberOfWords(String str){
        String[] strArr = str.split(" ");
        return strArr.length;
    }
    public static void main(String[] args){
        String str = "Hi";
        int countOfWords = countTheNumberOfWords(str);
        System.out.println(countOfWords);
    }
}

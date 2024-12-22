package smartHiringCoddingRevision.string;

public class ReverseWordsOfString {
    static String reverseTheWord(String str){
        String[] arr = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            newStr.append(arr[i]+ " ");
        }
        return newStr.toString();
    }
    public static void main(String[] args){
        String str = "this is an amazing program";
        String newStr = reverseTheWord(str);
        System.out.println(newStr);
    }
}

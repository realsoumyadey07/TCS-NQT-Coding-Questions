package smartHiringCoddingRevision.string;

public class FindLargestWord {
    static String findTheLargestWord(String str){
        String[] myArr = str.split(" ");
        String max="";
        for(int i=0;i<myArr.length;i++){
            if(max.length()<myArr[i].length()){
                max = myArr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        String str = "Microsoft is the best company I have ever worked for!";
        String largest = findTheLargestWord(str);
        System.out.println("The largest word is: "+ largest);
    }
}

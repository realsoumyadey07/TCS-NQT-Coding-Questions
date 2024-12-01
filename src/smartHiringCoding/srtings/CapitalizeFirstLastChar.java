package smartHiringCoding.srtings;

public class CapitalizeFirstLastChar {
    public static void capitalizeFirstAndLastChar(String str){
        StringBuilder newStr = new StringBuilder();
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1, arr[i].length()-1)+ Character.toUpperCase(arr[i].charAt(arr[i].length()-1));
        }
        for(String i: arr){
            newStr.append(i+ " ");
        }
        System.out.println(newStr);
    }
    public static void main(String[] args){
        String str = "take you forward";
        capitalizeFirstAndLastChar(str);
    }
}

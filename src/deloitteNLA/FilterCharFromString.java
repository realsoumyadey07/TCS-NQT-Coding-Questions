package deloitteNLA;

public class FilterCharFromString {
    static void filterCharFromString(String target, String reference){
        StringBuilder result = new StringBuilder(target);
        for(int i=0;i<result.length();i++){
            if(reference.contains(String.valueOf(result.charAt(i)))){
                result.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("New string is: "+ result.toString());
    }
    public static void main(String[] args){
        String target = "Programming";
        String reference = "grm";
        filterCharFromString(target, reference);
    }
}

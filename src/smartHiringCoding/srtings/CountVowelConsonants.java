package smartHiringCoding.srtings;


public class CountVowelConsonants {

    public static void countVowelConsonants(String str){
        int vowel = 0, consonant = 0, space = 0;
        str = str.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            char c = str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel++;
            } else if (c>='a' && c<='z') {
                consonant++;
            } else if (c == ' ') {
                space++;
            }
        }
        System.out.println("Vowels are: "+ vowel);
        System.out.println("Consonants are: "+ consonant);
        System.out.println("Spaces are: "+ space);
    }
    public static void main(String[] args){
        String str = "Take you forward is awesome";
        countVowelConsonants(str);
    }
}

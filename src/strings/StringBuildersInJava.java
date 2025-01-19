package strings;

public class StringBuildersInJava {
    public static void main(String[] args){
        String name = "Soumya Dey";
        StringBuilder newStr = new StringBuilder(name);
        newStr.append(" is a good boy!");
        newStr.setCharAt(0, 'G');
        newStr.insert(2, 'u');
        newStr.delete(2, 4);
        System.out.println(newStr.length());
        System.out.println(newStr.charAt(0));
        System.out.println(newStr);
    }
}

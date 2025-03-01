package OOPs;

class OtherObject {
    int x, y;
    public OtherObject(int x, int y){
        this.x = x;
        this.y = y;
    }
    public OtherObject add(OtherObject other){
        return new OtherObject(this.x + other.x, this.y + other.y);
    }
}
public class PracticeOOPs {
    public static void main(String[] args){
        OtherObject A = new OtherObject(1, 2);
        OtherObject B = new OtherObject(3, 4);
        OtherObject C = A.add(B);
        System.out.println(C.x);
        System.out.println(C.y);
    }
}

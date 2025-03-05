package gfg160DaysCoding.numbers;

public class SeriesAP {
    public static int findNthTermOfAP(int a1, int a2, int n){
        int interval = a2 - a1;
        int res = a1;
        for(int i = 1;i<n;i++){
            res += interval;
        }
        return res;
    }
    public static void main(String[] args) {
        int a1 = 2;
        int a2 = 3;
        int n = 4;
        int nthTerm = findNthTermOfAP(a1, a2, n);
        System.out.println(nthTerm);
    }
}

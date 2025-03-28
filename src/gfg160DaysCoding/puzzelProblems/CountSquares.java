package gfg160DaysCoding.puzzelProblems;

public class CountSquares {
    static int countPerfectSquares(int n){
        int count = 0;
        for (int i=1;i*i<n;i++){
            int sq = i*i;
            if(sq<n) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 9;
        int perfectSquares = countPerfectSquares(n);
        System.out.println("Perfect squares are: "+ perfectSquares);
    }
}

package gfg160DaysCoding.numbers;

import java.util.ArrayList;

public class PrintNumberPattern {
    public static ArrayList<Integer> printNumberPattern(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int k = n;
        while (k>0){
            for(int i=n;i>0;i--){
                int l = k;
                while (l>0){
                    list.add(i);
                    System.out.print(i);
                    l--;
                }
            }
            list.add(-1);
            System.out.println();
            k--;
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> list = printNumberPattern(n);
        for(int i: list){
            System.out.print(i+", ");
        }
    }
}

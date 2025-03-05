package gfg160DaysCoding.numbers;

import java.util.ArrayList;

public class MultiplicationTable {
    public static ArrayList<Integer> calMultiplicationTable(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(n*i);
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 9;
        ArrayList<Integer> multiplicationTable = calMultiplicationTable(n);
        for(int i: multiplicationTable){
            System.out.print(i+", ");
        }
    }
}

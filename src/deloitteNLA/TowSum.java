package deloitteNLA;

public class TowSum {
    static int[] towSum(int[] arr, int target){
        int [] res = new int[2];
        outer:
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+ arr[j]==target) {
                    res[0] = i;
                    res[1] = j;
                    break outer;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = towSum(arr, target);
        for(int i: res){
            System.out.print(i+ ", ");
        }
    }
}

package smartHiringCoding.array;

public class EquilibriumElement {
    static int findTheEquilibrium(int[] arr){
        for(int i=0;i<arr.length;i++){
            int left=calculateLeft(arr, i);
            int right=calculateRight(arr, i);
            if(left==right){
                return i;
            }
        }
        return -1;
    }
    static int calculateLeft(int[] arr, int i){
        int left = 0;
        for(int j=0;j<i;j++){
            left+=arr[j];
        }
        return left;
    }
    static int calculateRight(int[] arr, int i){
        int right = 0;
        for(int k=i+1;k<arr.length;k++){
            right+=arr[k];
        }
        return right;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-1,8,4};
        int equilibrium = findTheEquilibrium(arr);
        System.out.println(equilibrium);
    }
}

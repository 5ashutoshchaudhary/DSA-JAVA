package Recursion;
public class IsSorted {
    public static boolean ISorted(int []arr,int i) {
        if (i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return ISorted(arr,i+1);
    }

    public static void main(String[] args) {
        int i = 0;
        int [] arr = {1,2,3};
        boolean result = ISorted(arr,i);
        System.out.print(result);
    }
}

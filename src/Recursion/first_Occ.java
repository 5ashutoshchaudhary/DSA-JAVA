package Recursion;

public class first_Occ {
    public static int FirstOcc(int []arr , int key, int idx){
        if(arr[idx] == key){
            return idx;
        }
        if(idx == arr.length-1){
            return -1;
        }
        return FirstOcc(arr,key,idx+1);
    }

    public static void main(String[] args) {
        int []arr = {9,8,5,621,7};
        int key = 621;
        int idx = 0;
        int result = FirstOcc(arr,key,idx);
        if(result == -1){
            System.out.print("Element not found...");
        }else{
            System.out.print("Element found at Index: " + result);
        }
    }
}


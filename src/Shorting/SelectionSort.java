package Shorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] Num = {8,5,2,3,4};
        for(int i = 0; i<Num.length; i++){
            int minIndex = i;
            for(int j = i + 1; j<Num.length; j++){
                if(Num[j]<Num[minIndex]){
                    minIndex = j;
                }
            }
            int temp = Num[i];
            Num[i] = Num[minIndex];
            Num[minIndex] = temp;
        }
        for(int i = 0; i<Num.length; i++){
            System.out.print(Num[i] + " ");
        }
    }
}

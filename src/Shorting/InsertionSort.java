package Shorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] Num = {8,5,2,3,4};
        for(int i = 1; i<Num.length; i++){
            int curr = Num[i];
            int prev = i - 1;

            while(prev>=0 && curr<Num[prev]){
                Num[prev+1] = Num[prev];
                prev--;
            }
            Num[prev + 1] = curr;
        }
        for(int i = 0; i<Num.length; i++){
            System.out.print(Num[i] + "  ");
        }
    }
}

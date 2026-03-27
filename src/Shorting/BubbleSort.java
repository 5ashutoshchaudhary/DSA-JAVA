package Shorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] Num = {8,5,2,3,4};
        for(int term = 0; term<Num.length-1; term++){
            for(int j = 0; j<Num.length-1-term; j++){
                if(Num[j]>Num[j+1]){
                    int temp = Num[j];
                    Num[j] = Num[j+1];
                    Num[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<Num.length; i++){
            System.out.print(Num[i]+" ");
        }
    }
}

package GreedyAlgorithm;
import java.sql.SQLOutput;
import java.util.*;
public class indianCoin {
    public static void Exchange(Integer []Changes,int BadaNote){
        ArrayList<Integer> Notes = new ArrayList<>();
        Arrays.sort(Changes,Collections.reverseOrder());
        int TotalNotes = 0;
        for(int i = 1; i<Changes.length; i++){
                while(BadaNote>=Changes[i]){
                    TotalNotes++;
                    Notes.add(Changes[i]);
                    BadaNote-=Changes[i];
                }
        }
        System.out.print("Total number of Notes and coins: " + TotalNotes);
        System.out.println();
        System.out.print("The Notes and coins are: ");
        for(int i = 0;i<Notes.size(); i++){
            System.out.print(Notes.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Integer []Changes = {1,2,5,10,20,50,100,500,2000};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount(You want Change Of): ");
        int BadaNote = sc.nextInt();
        Exchange(Changes,BadaNote);
    }
}

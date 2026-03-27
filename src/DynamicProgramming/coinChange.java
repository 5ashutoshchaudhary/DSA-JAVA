package DynamicProgramming;

public class coinChange {
    public static int coins(int i,int[]coins,int amount){
        if(i == coins.length){
            if(amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        int take = 1 + coins(i,coins,amount-coins[i]);
        int skip = coins(i+1,coins,amount);
        if(amount-coins[i]<0) return 0;
        return Math.min(take,skip);
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.print(coins(0,coins,amount));
    }
}

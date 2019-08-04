package dp;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=0;i<=amount;i++)
            dp[i] = amount+1;

        dp[0] = 0;
        for(int i =1; i<= amount;i++){
            for(int j =0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount? -1: dp[amount];
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {2};
        int amount = 3;
        int result = coinChange.coinChange(coins, amount);
        System.out.println(result);
    }

}

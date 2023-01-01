public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] prices={1,7,4,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                profit=profit+(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}

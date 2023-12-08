import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {3,1,4,8,7,2,5};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        // Solution_1
        // Brute force approach
        // Time_Complexity::O(n^2) //space complexity::O(1)

    /*
    //solution
        int profit=0;
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=i;j<prices.length;j++){
                int sell=prices[j];
                if(profit<sell-buy){
                    profit=sell-buy;
                }
            }
        }
        return profit;

     //solution
        int currMaxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            int futureMaxPrice = prices[i];
            for (int j = i; j < prices.length; j++) {
                if (prices[j] >= futureMaxPrice) {
                    futureMaxPrice = prices[j];
                }
            }
            System.out.println(futureMaxPrice);
            int currProfit=futureMaxPrice-prices[i];
            if(currProfit>=currMaxProfit){
                currMaxProfit=currProfit;
            }
        }
        return currMaxProfit;
    */

        // Solution_2
        // Time_Complexity::O(n) //space complexity::O(n)

    /*  int[] maxPrice=new int[prices.length];
        int max=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]>=max){
                max=prices[i];
            }
            maxPrice[i]=max;
        }
        System.out.println(Arrays.toString(maxPrice));
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int profit=maxPrice[i]-prices[i];
            if(profit>=maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
     */


        // Solution_3
        // Time_Complexity::O(n) //space complexity::O(1)
        int minPrice=prices[0];
        int maximumProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=minPrice){
                minPrice=prices[i];
            }

            int currProfit=prices[i]-minPrice;
            if(currProfit>=maximumProfit){
                maximumProfit=currProfit;
            }
        }
        return maximumProfit;
    }
}

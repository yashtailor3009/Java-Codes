public class BuysellStock{

    public static int BuysellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++){
            if(buyPrice < prices[i]){ // profit can be made
                int profit = prices[i] - buyPrice; // calculate present profit
                maxProfit = Math.max(maxProfit, profit); //update max profit
            } else{ // no profit can be made
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(" Max Profit is: "+BuysellStock(prices));
    }
}
// time complexity: O(n)
// space complexity: O(1)
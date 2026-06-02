class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            int current=prices[i];
            if(current<minprice){
                minprice=current;
            }
            else{
                profit=Math.max(profit,current-minprice);
            }
        }
        
        return profit;

        
        
    }
}
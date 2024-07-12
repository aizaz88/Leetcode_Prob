class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        
        int minprices=Integer.MAX_VALUE;
        int maxprofit=0;
        
        for(int price: prices){
            if(price<minprices){
                minprices=price;
            }else if(price-minprices>maxprofit){
                maxprofit=price-minprices;
            }
        }
        return maxprofit;
    }
}
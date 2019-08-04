package array;

public class BestTimeToPurchaseStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if (prices[i]-minPrice>maxProfit)
                maxProfit = prices[i]-minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] array1 = {7,1,5,3,6,4};
        int[] array2 = {7,6,4,3,1};
        int result = BestTimeToPurchaseStock.maxProfit(array1);
        System.out.println(result);
        result = BestTimeToPurchaseStock.maxProfit(array2);
        System.out.println(result);

    }
}

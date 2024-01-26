package gopika;

public class Buy_and_sell_stock_1 {

	public static void main(String args[])
	{
		int[] prices= {7,1,5,3,6,4};
		System.out.println("Best time to buy and sell"+buyandsell(prices));
	}

	private static int buyandsell(int[] prices) {
		
		if(prices==null || prices.length==0)
			return -1;
		
		int profit=0;
		int buying_price=prices[0];
		
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]<buying_price)
			{
				buying_price=prices[i];
				continue;
			}
			profit=Math.min(profit, profit-buying_price);
		}
		return profit;
	}
	
}

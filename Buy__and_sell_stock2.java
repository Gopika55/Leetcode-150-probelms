package gopika;

public class Buy__and_sell_stock2 {

	public static void main(String args[])
	{
		int[] prices= {7,1,5,3,6,4};
		System.out.println("Best time to buy and sell " +buyandsell(prices));
	}

	private static int buyandsell(int[] prices)
	{
		int buy=Integer.MAX_VALUE;
		int profit=0;
		
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]<=buy)
			{
				buy=prices[i];
			}
			else
			{
				profit+=prices[i]-buy;
				buy=prices[i];
			}
		}
		return profit;
	}
}

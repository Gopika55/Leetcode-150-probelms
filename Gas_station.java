package gopika;

public class Gas_station {
	
	public static void main(String args[])
	{
		int[] gas= {2,3,4};
		int[] cost= {3,4,3};
		System.out.println("Starting index" +gasstation(gas,cost));
	}

	private static int gasstation(int[] gas, int[] cost) 
	{
		int total_left=0;
		
		for(int i=0;i<gas.length;i++)
		{
			total_left+=gas[i]-cost[i];
		}
		
		if(total_left<0)
			return -1;
		
		
		int start_index=0;
		int remaining=0;
		
	for(int i=0;i<gas.length;i++)
	{
		
    int currentgas=gas[i]+remaining;
    int currentcost=cost[i];
    		
    remaining=currentgas-currentcost;
    
    if(remaining<0)
    {
    	remaining=0;
    	start_index=i+1;
    
    }
} 
    
	return start_index;
	
	}
}

	
	



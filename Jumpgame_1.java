package gopika;

public class Jumpgame_1 {
	public static void main(String args[])
	{
		int[] nums= {2,3,1,1,4};
		System.out.println("Maximum jump length  "+jumplength(nums));
		
	}

	private static boolean jumplength(int[] nums)
	{
		
		int stepsleft=nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
			stepsleft--;
			
			if(stepsleft<0)
				return false;
			if(i==nums.length-1) return true;
			
			if(stepsleft<nums[i])
			{
				stepsleft=nums[i];
			}
			
			
		}
		return true;
	}

}

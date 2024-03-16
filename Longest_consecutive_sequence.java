package gopika;

import java.util.HashSet;
import java.util.Set;

public class Longest_consecutive_sequence {
	public static void main(String args[])
	{
		int nums[]= {2,3,7,0,5,8,4,6,0,1};
		System.out.println("Longest consecutive sequence length is "+longestconsecutive(nums));
		
		}

	private static int longestconsecutive(int[] nums) 
	{
		
		Set<Integer> sm=new HashSet<>();
		
		for(int n:nums)
		{
			sm.add(n);
		}
		
		int max=0;
		
		for(int i=0;i<nums.length;i++)
		{
			int num=nums[i];
			
			if(sm.contains(num-i)) continue;
			
			int currentlength=0;
			
			while(sm.contains(num))
			{
				currentlength ++;
				num++;
			}
			
			max=Math.max(max, currentlength);
		}
	return max;
	}
	
	
	

}

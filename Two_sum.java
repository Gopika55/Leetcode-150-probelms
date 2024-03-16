package gopika;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {

	public static void main(String[] args)
	{
		int[] nums= {4,6,1,8};
		int target=10;
		System.out.println(Arrays.toString(towsum(nums,target)));	
}

	private static  int[] towsum(int[] nums, int target) {
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
		
		  int req_num=target-nums[i];
			if(hm.containsKey(req_num))
			{
				int[] arr= {hm.get(req_num),i};
				return arr;
			}
			
			
				hm.put(nums[i],i);
			}
		
		return null;
	}

}	

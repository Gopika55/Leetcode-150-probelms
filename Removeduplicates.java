package gopika;

public class Removeduplicates {
 
	public static void main(String args[])
	{
		int nums[]= {1,1,3};
		System.out.println("Remove duplicates are" +removeduplicate1(nums));
	}

	public static int removeduplicate1(int[] nums) 
	{
		
		if(nums.length==0)
		
			return 0;
		
		int i=0;
		
		for(int j=1;j<nums.length;j++)
		{
			if(nums[j]!=nums[i]);
			
			{
				i++;
				nums[i]=nums[j];
			}
			
		}
		return i+1;
	}
}

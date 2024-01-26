package gopika;

public class Removeduplicate2 {

	public static void main(String args[])
	{
		int nums[]= {1,1,1,2,2,3};
		System.out.println("Remove Duplicates length is = "+removeduplicates(nums));
	}

	private static int removeduplicates(int[] nums)
	{
		int i=0;
		
		for(int n:nums)
		{
			if(i<2 || n!=nums[i-2])
			{
				nums[i++]=n;
			}
			
			
		}
		return i;
	}
}

package gopika;

public class Removeelement {

	public static void main(String args[])
	{
		int[] nums= {3,2,2,3,7,8,9};
		int val=3;
		System.out.println("Remove element return length "+removeelement(nums,val));
	}
	
	public static int removeelement(int[] nums,int val)
	{
		int count=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
	}
}

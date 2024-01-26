package gopika;

public class Trapping_rainwater {

	public static void main(String args[])
	{
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("total count " +traprainwater(height));
	}

	private static int traprainwater(int[] height) 
	{
		int[] left=new int[height.length];
		int[] right=new int[height.length];
		
		int max=-1;
		
		for(int i=0;i<height.length;i++)
		{
			if(height[i]>=max)
			{
				max=height[i];
			}
			
			left[i]=max;
		}
		
		max=-1;
		
		for(int i=height.length-1;i>=0;i--)
		{
			if(height[i]>=max)
			{
				max=height[i];
				
			}
			right[i]=max;
		}
		
		
		
		int total=0;
		
		for(int i=0;i<height.length;i++)
		{
			total +=Math.min(left[i],right[i])-height[i];
		}
		
		return total;
	}
}

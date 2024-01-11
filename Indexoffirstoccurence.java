package gopika;

public class Indexoffirstoccurence {

	public static void main(String[] args)
	{
		 String haystack = "leetcode";
	     String needle = "code";
		 System.out.println("Index of First Occurence is " +firstoccurence(haystack,needle));
	}

	 static int firstoccurence(String haystack, String needle) 
	 {
	
		for(int i=0;i<haystack.length();i++)
		{
			if(haystack.charAt(i)==needle.charAt(0))
			{
				int j=0;
				int k=i;
						
			   while(j<needle.length()&& k<haystack.length()&& needle.charAt(j)==haystack.charAt(k))
			   {
				   j++;
				   k++;
				   
				   if(j==needle.length())
				   {
					   return i;
				   }
			   }
			
			}
	
		}
		return -1;
	}
}

package gopika;

public class Lengthoflastword {

	public static void main(String[] args)
	{
		String s="  fly me to the moon ";
		System.out.println("Length of the last word is "+lastword(s));
		
	}

	 static int lastword(String s)
	 {

		 String str=s.trim();
		 
		 int count=0;
		 
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 if(str.charAt(i)!=' ')
			 {
				 count++;
			 }
			 else
			 {
				 break;
			 }
		 }
		 
		 return count;
		
	}
	
}

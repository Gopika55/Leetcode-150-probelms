package gopika;

public class Reverseword {

	public static void main(String[] args)
	{
		String str="  The sky is blue  ";
		System.out.println("Reverse word is ="+reverseword(str));
		
	}

	 static String reverseword(String str)
	 {
		
		String[] words=str.split(" +");
		StringBuilder sb=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--)
		{
			sb.append(words[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
		
	}
	
}

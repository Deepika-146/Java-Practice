package Day9;

public class Palindrome {
	public static void main(String[] args) {
		String s="welew";
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);	
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}

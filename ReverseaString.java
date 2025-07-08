package Day9;

public class ReverseaString {
	public static void main(String[] args) {
		String s="Welcome";
		//approach 1
		System.out.println(""+s.charAt(6)+s.charAt(5)+s.charAt(4)+s.charAt(3)+s.charAt(2)+s.charAt(1)+s.charAt(0));
		//Approach 2
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		//Approach 3 - use char array - convert the string into array
		char a[]=s.toCharArray();
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
		//Approach 4-
		StringBuffer s1=new StringBuffer("Welcome");
		System.out.println(s1.reverse());
		//Approach 5
		StringBuilder s2=new StringBuilder("Welcome");
		System.out.println(s2.reverse());
	}

}

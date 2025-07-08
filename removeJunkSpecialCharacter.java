package Day9;

public class removeJunkSpecialCharacter {
public static void main(String[] args) {
	String s="wel@come1";
	String withoutjunk="";
	for(int i=0; i<=s.length()-1; i++)
	{
		char ch=s.charAt(i);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'))
				{
			withoutjunk=withoutjunk+ch;
				}
	}
	System.out.println(withoutjunk);
}
}

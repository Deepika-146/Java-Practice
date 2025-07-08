package Day9;

public class removespace {

	public static void main(String[] args) {
		String s="Hello World";
		String nospace=s.replace(" ","");
		System.out.println(nospace);
		String a="";
		for(int i=0;i<=s.length()-1;i++) {
		   char ch=s.charAt(i);
		   
		   if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
			   a=a+ch;
			   
		   }
		}System.out.println(a);

	}

}

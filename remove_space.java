package Day9;

public class remove_space {
public static void main(String[] args) {
	String s="Java is a Programming Language";
	String a=s.replace(" ","");
	System.out.println(a);
	String b="";
	for(int i=0; i<=s.length()-1; i++) {
		char c=s.charAt(i);
		if(c!=' ') {
			 b=b+c;
		}
	}
	System.out.println(b);
}
}

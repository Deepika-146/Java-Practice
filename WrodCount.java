package Day9;

public class WrodCount {
	public static void main(String[] args) {
		String sentence="Java is a Programming Language";
		String wordcount[]=sentence.split(" ");
		int count=wordcount.length;
		String s="ab@c";
		String split[]=s.split("@");
		int c=split.length;
		System.out.println(count+" "+ c);
		/*int count=0;
		boolean inword=false;
		for(int i=0; i<=sentence.length()-1; i++)
		{
			char ch=sentence.charAt(i);
			if (ch !=' ' && !inword){
				inword=true;
				count++;	
			}
			else if(ch==' ') {
				inword =false;
			}
		} System.out.println(count);*/
		
	}

}

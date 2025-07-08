package Day9;


	public class occurance {

		public static void main(String[] args) {
			String a="apple";
			String s=a.replace("a","");
			int count=a.length()-s.length();
			/*char s='p';
			int count=0;
			for(int i=0;i<=a.length()-1;i++) {
				if(s==a.charAt(i)) {
					count++;
				}
			}*/
			System.out.println("no of occurence"+"="+count);
			// TODO Auto-generated method stub

		}

	}


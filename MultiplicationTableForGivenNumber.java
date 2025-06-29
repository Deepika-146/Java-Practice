package Practice;

public class MultiplicationTableForGivenNumber {

	public static void main(String[] args) {
		//int num=4;
		//int multiplier=2;
		//int result;
		/*while (num<=10)
		{
			result=num*multiplier;
			System.out.println(num+"*"+ multiplier +" "+"="+result);
			num++;
		}*/
		/*do
		{
			result=num*multiplier;
			System.out.println(num+"*"+multiplier+"="+result);
			num++;
		}
		while(num<=10);*/
		for (int num=2, multiplier=2; num<=10; num++)
		{
		int result = num*multiplier;
		System.out.println(num+"*"+multiplier+"="+result);
		}
	}

}

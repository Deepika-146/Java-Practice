package Practice;

public class GradeOfStudent {
public static void main(String[] args)
{
	int mark=101;
	/*if (mark>60&&mark<=100)
	{
		if (mark>=90&&mark<=100)
		{
			System.out.println('A');
		}
		else if (mark>=80&&mark<=89)
		{
			System.out.println('B');
			}
		else if(mark>=70 && mark<=79) {
			System.out.println('C');
		}
		else if(mark>=60&&mark<=69){
			System.out.println('D');
		}
		else {
			System.out.println("Fail");
		}
	}
	else {
		System.out.println("invaild");
	}*/
	if(mark>=0&&mark<=100)
	{
	int result=mark/10;
	switch (result)
	{
	case 10:
	case 9: System.out.println('A'); break;
	case 8: System.out.println('B');break;
	case 7: System.out.println('C');break;
	case 6:System.out.println('D'); break;
	default:System.out.println("Fail");
	}
	}
	else
	{
		System.out.println("Invalid Mark");
}
}
}

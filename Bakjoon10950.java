import java.util.Scanner;
class Bakjoon10950 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		for (int i=0; i<count; i++)
		{
			int number1=scanner.nextInt();
			int number2=scanner.nextInt();
			int result= number1+number2;
			System.out.println(result);
		}
	}
}

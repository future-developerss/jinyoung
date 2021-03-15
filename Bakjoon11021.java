import java.util.Scanner;
class  Bakjoon11021
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		for (int i=1;i<count+1 ;i++ )
		{
			int a= scanner.nextInt();
			int b= scanner.nextInt();
			int result= a+b;
			System.out.println("Case #"+i+": "+result);
		}
	}
}

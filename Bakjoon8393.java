import java.util.Scanner;
class  Bakjoon8393
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		int total=0;
		for (int i=1; i<count+1; i++)
		{
			total+=i;
		}
		System.out.println(total);
	}
}

import java.util.Scanner;
class  Bakjoon14681
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int x_position=scanner.nextInt();
		int y_position=scanner.nextInt();

		if ((x_position>0) && (y_position>0))
		{
			System.out.println(1);
		}
		else if ((x_position<0) && (y_position>0))
		{
			System.out.println(2);
		}
		else if ((x_position<0) && (y_position<0))
		{
			System.out.println(3);
		}
		else{
			System.out.println(4);
		}
	}
}

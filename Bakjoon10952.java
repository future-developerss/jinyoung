import java.util.Scanner;

class Bakjoon10952 
{
	public static void main(String[] args) 
	{	Scanner scanner=new Scanner(System.in);
		while(true){
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int result=a+b;
			if (a==0 & b==0)
			{
				break;
			}else{
			System.out.println(result);
			}
		}
	}
}
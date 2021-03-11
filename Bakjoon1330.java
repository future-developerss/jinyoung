import java.util.Scanner;
class  Bakjoon1330
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();

		if (a>b){
			System.out.println(">");
		}
		else if (a<b)
		{
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
	}
}

import java.util.Scanner;

class Bakjoon10951 
{
	public static void main(String[] args) 
	{	Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()){ //hasNextInt()�޼ҵ�� ���� �����Ͱ� �ִ��� ������ �����ϴ� �޼ҵ��̴�.
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int result=a+b;
			System.out.println(result);
		}
	}
}
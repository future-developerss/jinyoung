import java.util.Scanner;

class  Bakjoon2588
{
	public static void main(String[] args) 
	{
		Scanner calculate= new Scanner(System.in); //����ڷκ��� ���� ������ �ϳ��� ��ü�� �����.
		System.out.println("���ڸ� �ڿ��� �ΰ��� �Է��ϼ���");
		int number=calculate.nextInt();
		String calculate1=calculate.next(); //���ڸ� �ڿ����� �� �ڸ������� ������ ���� ������� �Է��� ���� �ι�° ���ڸ� �ڿ��� �ϳ��� ���ڿ��� �޾Ҵ�.
		int one=Integer.parseInt(calculate1.substring(2)); //Integer.parseInt()�� �������� ���������� �ٲ��ִ� ����ȯ �Լ��̴�.
		int ten=Integer.parseInt(calculate1.substring(1,2)); // substring�� ���ڿ��� �����ִ� ������ �ϴ� �Լ��̴�.
		int hundred=Integer.parseInt(calculate1.substring(0,1));
		int result1=number*one;
		int result2=number*ten;
		int result3=number*hundred;
		int result=result1+10*result2+result3*100;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result);
	}
}
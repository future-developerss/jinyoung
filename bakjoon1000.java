import java.util.Scanner; //class scanner�� ����ڷκ��� �Է¹��� ��, ���Ŀ� ���������� ����ϴ� class�̴�


class  bakjoon1000
{
	public static void main(String[] args) 
	{
		Scanner plus=new Scanner(System.in); //����ڷκ��� ���� �������� ���� �ϳ��� ��ü�� ����� ����Ʈ ������ �д´�.
		System.out.println("A�� B�� �Է��ϼ���");
		int A=plus.nextInt(); //nextInt()�� scanner class ���� method�� �Էµ� ���� ���� ���������� ���ڿ��� ���������� ����
		int B=plus.nextInt();
		int result=A+B;
		System.out.println("A+B= "+ result);
	}
}

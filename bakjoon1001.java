import java.util.Scanner; //class scanner�� ����ڷκ��� �Է¹��� ��, ���Ŀ� ���������� ����ϴ� class�̴�


class  bakjoon1001
{
	public static void main(String[] args) 
	{
		Scanner sub=new Scanner(System.in); //����ڷκ��� ���� �������� ���� �ϳ��� ��ü�� ����� ����Ʈ ������ �д´�.
		System.out.println("A�� B�� �Է��ϼ���");
		int A=sub.nextInt(); //nextInt()�� scanner class ���� method�� �Էµ� ���� ���� ���������� ���ڿ��� ���������� ����
		int B=sub.nextInt();
		int result=A-B;
		System.out.println("A-B= "+ result);
	}
}

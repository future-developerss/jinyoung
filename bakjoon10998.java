import java.util.Scanner; //class scanner�� ����ڷκ��� �Է¹��� ��, ���Ŀ� ���������� ����ϴ� class�̴�


class  bakjoon10998
{
	public static void main(String[] args) 
	{
		Scanner multiple=new Scanner(System.in); //����ڷκ��� ���� �������� ���� �ϳ��� ��ü�� ����� ����Ʈ ������ �д´�.
		System.out.println("A�� B�� �Է��ϼ���");
		int A=multiple.nextInt(); //nextInt()�� scanner class ���� method�� �Էµ� ���� ���� ���������� ���ڿ��� ���������� ����
		int B=multiple.nextInt();
		int result=A*B;
		System.out.println("A*B= "+ result);
	}
}

import java.util.Scanner; 


class  bakjoon2675_second
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt(); //���ڿ��� �Է¹��� �� Ƚ���� ����
		for (int a=0;a<num ;a++ )
		{
			int count=scanner.nextInt(); //�ݺ��� Ƚ���Է¹���
			String test=scanner.next(); //�ݺ������ ���ڿ�����
			for (int i=0;i<test.length() ;i++ )
			{
				for (int j=0;j<count ;j++ )
				{
					System.out.print(test.charAt(i)); //charAt�� ���ڿ��� �ѱ��ھ� �ε�����ȣ �������� �����ִ� ������ �ϴ� �Լ�
				}
			}
			System.out.println();	//print�� ���ٷ� ���, println�� ����Ʈ�� �ٹٲޱ��� ������ �ϴ� ���̰� ������ �ѹ��� ������
		}
	}
}

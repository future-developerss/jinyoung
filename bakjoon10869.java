import java.util.Scanner; //class scanner�� ����ڷκ��� �Է¹��� ��, ���Ŀ� ���������� ����ϴ� class�̴�


class  bakjoon10869
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in); //����ڷκ��� ���� �������� ���� �ϳ��� ��ü�� ����� ����Ʈ ������ �д´�.
		System.out.println("A�� B�� �Է��ϼ���");
		int A=scanner.nextInt(); 
		int B=scanner.nextInt();
		int plus=A+B;
		int sub=A-B;
		int multiple=A*B;
		double divide= (double)A/(double)B; //�Ҽ��� �Ʒ����� ���������� ���ǰ� �ϱ� ���� int->double �Ǽ������� ����ȯ��Ű�� ���� �߰��Ͽ���.
		int rest=A%B; //�������� ������ %��
		System.out.println("A+B= "+ plus);
		System.out.println("A-B= "+ sub);
		System.out.println("A*B= "+ multiple);
		System.out.println("A/B= "+ divide);
		System.out.println("A%B= "+ rest);
	}
}

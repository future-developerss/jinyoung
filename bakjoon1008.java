import java.util.Scanner; //class scanner�� ����ڷκ��� �Է¹��� ��, ���Ŀ� ���������� ����ϴ� class�̴�


class  bakjoon1008
{
	public static void main(String[] args) 
	{
		Scanner divide=new Scanner(System.in); //����ڷκ��� ���� �������� ���� �ϳ��� ��ü�� ����� ����Ʈ ������ �д´�.
		System.out.println("A�� B�� �Է��ϼ���");
		double A=divide.nextDouble(); //nextDouble()�� scanner class ���� method�� �Էµ� ���� ���� ���������� ���ڿ��� �Ǽ� �� ���������� ����
		double B=divide.nextDouble(); //int������ ������ ��� �������� ��� ����� �Ҽ��� �Ʒ����� ǥ������ �����Ƿ� A,B,result�� �ڷ����� double�� �����Ͽ���.
		double result=A/B;
		System.out.println("A/B= "+ result);
	}
}

import java.util.Scanner;

class  Bakjoon10430
{
	public static void main(String[] args) 
	{
		Scanner rest= new Scanner(System.in); //사용자로부터 받은 변수를 하나의 객체로 만든다.
		System.out.println("A,B,C를 입력하세요");
		int A=rest.nextInt();
		int B=rest.nextInt();
		int C=rest.nextInt();
		int result1=(A+B)%C;
		int result2=((A%C) + (B%C))%C;
		int result3=(A*B)%C;
		int result4=((A%C) * (B%C))%C;
		System.out.println("(A+B)%C= "+ result1);
		System.out.println("((A%C) + (B%C))%C= "+ result2);
		System.out.println("(A×B)%C= "+ result3);
		System.out.println("((A%C) × (B%C))%C= "+ result4);
	}
}
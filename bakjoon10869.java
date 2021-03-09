import java.util.Scanner; //class scanner는 사용자로부터 입력받은 후, 이후에 변수값으로 사용하는 class이다


class  bakjoon10869
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in); //사용자로부터 받은 변수들의 값을 하나의 객체로 만들어 바이트 단위로 읽는다.
		System.out.println("A와 B를 입력하세요");
		int A=scanner.nextInt(); 
		int B=scanner.nextInt();
		int plus=A+B;
		int sub=A-B;
		int multiple=A*B;
		double divide= (double)A/(double)B; //소수점 아래까지 정상적으로 계산되게 하기 위해 int->double 실수형으로 형변환시키는 연산 추가하였다.
		int rest=A%B; //나머지의 연산은 %로
		System.out.println("A+B= "+ plus);
		System.out.println("A-B= "+ sub);
		System.out.println("A*B= "+ multiple);
		System.out.println("A/B= "+ divide);
		System.out.println("A%B= "+ rest);
	}
}

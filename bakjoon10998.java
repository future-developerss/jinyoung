import java.util.Scanner; //class scanner는 사용자로부터 입력받은 후, 이후에 변수값으로 사용하는 class이다


class  bakjoon10998
{
	public static void main(String[] args) 
	{
		Scanner multiple=new Scanner(System.in); //사용자로부터 받은 변수들의 값을 하나의 객체로 만들어 바이트 단위로 읽는다.
		System.out.println("A와 B를 입력하세요");
		int A=multiple.nextInt(); //nextInt()는 scanner class 속의 method로 입력된 것중 공백 이전까지의 문자열을 정수형으로 받음
		int B=multiple.nextInt();
		int result=A*B;
		System.out.println("A*B= "+ result);
	}
}

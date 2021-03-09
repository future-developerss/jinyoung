import java.util.Scanner; //class scanner는 사용자로부터 입력받은 후, 이후에 변수값으로 사용하는 class이다


class  bakjoon1008
{
	public static void main(String[] args) 
	{
		Scanner divide=new Scanner(System.in); //사용자로부터 받은 변수들의 값을 하나의 객체로 만들어 바이트 단위로 읽는다.
		System.out.println("A와 B를 입력하세요");
		double A=divide.nextDouble(); //nextDouble()는 scanner class 속의 method로 입력된 것중 공백 이전까지의 문자열을 실수 중 더블형으로 받음
		double B=divide.nextDouble(); //int형으로 결정할 경우 나누기의 계산 결과가 소수점 아래까지 표현되지 않으므로 A,B,result의 자료형을 double로 지정하였다.
		double result=A/B;
		System.out.println("A/B= "+ result);
	}
}

import java.util.Scanner;

class  Bakjoon2588
{
	public static void main(String[] args) 
	{
		Scanner calculate= new Scanner(System.in); //사용자로부터 받은 변수를 하나의 객체로 만든다.
		System.out.println("세자리 자연수 두개를 입력하세요");
		int number=calculate.nextInt();
		String calculate1=calculate.next(); //세자리 자연수를 각 자리수별로 나누기 위해 사용자의 입력을 받은 두번째 세자리 자연수 하나를 문자열로 받았다.
		int one=Integer.parseInt(calculate1.substring(2)); //Integer.parseInt()는 문자형을 정수형으로 바꿔주는 형변환 함수이다.
		int ten=Integer.parseInt(calculate1.substring(1,2)); // substring은 문자열을 끊어주는 역할을 하는 함수이다.
		int hundred=Integer.parseInt(calculate1.substring(0,1));
		int result1=number*one;
		int result2=number*ten;
		int result3=number*hundred;
		int result=result1+10*result2+result3*100;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result);
	}
}
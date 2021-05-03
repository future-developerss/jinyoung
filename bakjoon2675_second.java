import java.util.Scanner; 


class  bakjoon2675_second
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt(); //문자열을 입력받을 총 횟수를 결정
		for (int a=0;a<num ;a++ )
		{
			int count=scanner.nextInt(); //반복할 횟수입력받음
			String test=scanner.next(); //반복대상의 문자열받음
			for (int i=0;i<test.length() ;i++ )
			{
				for (int j=0;j<count ;j++ )
				{
					System.out.print(test.charAt(i)); //charAt은 문자열을 한글자씩 인덱스번호 기준으로 끊어주는 역할을 하는 함수
				}
			}
			System.out.println();	//print는 한줄로 출력, println은 프린트후 줄바꿈까지 역할을 하는 차이가 있음을 한번더 연습함
		}
	}
}

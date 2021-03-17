import java.util.Scanner;

class Bakjoon10951 
{
	public static void main(String[] args) 
	{	Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()){ //hasNextInt()메소드는 읽을 데이터가 있는지 없는지 구분하는 메소드이다.
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int result=a+b;
			System.out.println(result);
		}
	}
}
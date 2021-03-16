import java.util.Scanner;
class  Bakjoon2438
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		for (int i=0; i<count; i++){
			for(int j=0;j<(i+1);j++){
				System.out.print('*');	
			}
			System.out.print("\n");
		}
	}
}

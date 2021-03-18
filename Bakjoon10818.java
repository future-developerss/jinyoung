import java.util.Scanner;

public class Bakjoon10818 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int intArray[]=new int[number]; 
		for(int i=0;i<intArray.length;i++)
			intArray[i]=scanner.nextInt();

		scanner.close();
		//가장 작은수 배열정리
		for(int i=1; i<intArray.length;i++){
				if (intArray[0]>intArray[i])
				{
					int temp1=intArray[0];
					intArray[0]=intArray[i];
					intArray[i]=temp1;
				}
			}
		//큰수 배열 정리
		for (int j=1;j<intArray.length ; j++)
		{
			if (intArray[j-1]>intArray[j])
			{
				int temp=intArray[j-1];
				intArray[j-1]=intArray[j];
				intArray[j]=temp;
			}
		}
	
		System.out.println(intArray[0]+" "+intArray[number-1]);
	}
}
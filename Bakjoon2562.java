import java.util.Scanner;

public class Bakjoon2562
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[]=new int[9]; 
		for(int i=0;i<intArray.length;i++)
			intArray[i]=scanner.nextInt();

		scanner.close();
		int max=intArray[0];
		int index=1;

		for (int j=1; j<intArray.length; j++)
		{
			if (intArray[j]>max)
			{
				max=intArray[j];
				index=j+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
import java.util.Scanner;

class  Bakjoon1193
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int question=scanner.nextInt();
		scanner.close();

		int i=1;
		int count=1;
		while (question>=count)
		{
			count+=i;
			i++;
		}
		count=count-i;
		i=i-1;
		int num=question-count;
		if (i%2==0)
			System.out.println(num+"/"+(i-num+1));
		else
			System.out.println((i-num+1)+"/"+num);
	}
}
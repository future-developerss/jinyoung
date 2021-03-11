import java.util.Scanner;
class  Bakjoon2884
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int hour=scanner.nextInt();
		int minute=scanner.nextInt();
		
		if (minute>44)
		{
			minute=minute-45;
			System.out.println(hour+" "+minute);
		}
		else if (hour==0)
		{
			hour=23;
			minute=minute+15;
			System.out.println(hour+" "+minute);
		}
		else{
			hour=hour-1;
			minute=minute+15;
			System.out.println(hour+" "+minute);
		}
	}
}

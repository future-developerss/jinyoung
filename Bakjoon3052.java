import java.util.Scanner;

class Bakjoon3052 
{
	public static void main(String[] args) 
	{
		int samecnt = 0;
        int result = 0;
		Scanner scanner=new Scanner(System.in);
		int[] array=new int[10];
		for (int i=0;i<10 ;i++ )
		{
			array[i]=scanner.nextInt()%42;
		}
        for (int i = 0; i < 10; i++) {
            samecnt = 0;
            for (int j = i + 1; j < 10; j++) {
                if (array[i] == array[j]) {
                    samecnt++;
                }
            }
 
            if (samecnt == 0) {
                result++;
            }
        }
		System.out.println(result);
	}
}

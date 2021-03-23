import java.util.Scanner;

class Bakjoon1546
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		double[] array=new double[number];
		double[] score=new double[number];
		for (int i=0;i<number ;i++ )
		{
			array[i]=scanner.nextInt();
		}

		double max=0;
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (array[i] >= array[j]) {
                    max=array[i];
                }
				else{
					max=array[j];
				}
            }
        }
		double total=0;
		for (int k=0; k<number;k++ )
		{
			score[k]=(array[k]/max)*100;
			total+=score[k];
		}
		double result=total/number;
		System.out.println(result);
	}
}

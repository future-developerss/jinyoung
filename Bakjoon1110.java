
import java.util.Scanner;

public class Bakjoon1110 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		int count = 0;
		int copy = number;
		while (true) {
			number = ((number % 10) * 10) + (((number / 10) + (number % 10)) % 10);
			count++;
			if (copy == number) {
				break;
			}
		}
		System.out.println(count);
	}
}
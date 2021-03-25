import java.util.Scanner;
 
public class Bakjoon11720 {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		String a = in.next();
		in.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0'; //charAt()는 해당 문자의 아스키코드 값을 반환하므로 뒤에 반드시 -48 또는 -'0'을 해주어야 원래 숫자 그대로 사용할 수 있음
		}
		System.out.print(sum);
	}
}
import java.util.Scanner;
 
public class Bakjoon11720 {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		String a = in.next();
		in.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0'; //charAt()�� �ش� ������ �ƽ�Ű�ڵ� ���� ��ȯ�ϹǷ� �ڿ� �ݵ�� -48 �Ǵ� -'0'�� ���־�� ���� ���� �״�� ����� �� ����
		}
		System.out.print(sum);
	}
}
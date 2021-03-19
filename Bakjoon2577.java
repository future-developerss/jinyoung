import java.util.Scanner;

public class Bakjoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a * b * c;		// �Է� ���� ���
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};	// 0~9 ���ڸ� ���� �迭 ����, �ʱ�ȭ
		
		for(int i = 0; i < array.length; i++) {		// �迭�� ũ�⸸ŭ �ݺ�
			int count = 0;				// ��ġ�ϴ� ���ڸ� ���� ������ ����
			int temp = result;			// �Է� ���ڸ� ���� (����)
			
			/* �Է� ���ڸ� �� �ڸ��� �� */
			while(temp != 0) {			
				if(temp % 10 == array[i]) {	// �� �ڸ� ������ ��
					count++;					
				}
				temp /= 10;
			}
			System.out.println(count);
		}
	}
}
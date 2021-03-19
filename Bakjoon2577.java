import java.util.Scanner;

public class Bakjoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a * b * c;		// 입력 숫자 계산
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};	// 0~9 숫자를 담은 배열 선언, 초기화
		
		for(int i = 0; i < array.length; i++) {		// 배열의 크기만큼 반복
			int count = 0;				// 일치하는 숫자를 세어 저장할 변수
			int temp = result;			// 입력 숫자를 복사 (계산용)
			
			/* 입력 숫자를 한 자리씩 비교 */
			while(temp != 0) {			
				if(temp % 10 == array[i]) {	// 끝 자리 수부터 비교
					count++;					
				}
				temp /= 10;
			}
			System.out.println(count);
		}
	}
}
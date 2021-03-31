import java.util.Scanner;
 
public class Bakjoon1157 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = in.next();
 
		for (int i = 0; i < s.length(); i++){
 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				arr[s.charAt(i) - 'A']++;	
			}
    
			else {	// 소문자 범위
				arr[s.charAt(i) - 'a']++;
			}
		}
 
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
	}
 
}
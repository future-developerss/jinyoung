import java.util.Scanner;
 
public class Bakjoon2908 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B); //a>b에서 a가 크면 a를 b가 더 크면 b를 출력
	
	}
}
import java.util.Scanner;
public class Bakjoon10809 {
       public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             String input = scanner.next();
             
             for (char c = 'a' ; c <= 'z' ; c++)
                    System.out.print(input.indexOf(c) + " ");
       }
}
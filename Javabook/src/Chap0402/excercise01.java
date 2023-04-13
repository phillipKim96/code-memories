package Chap0402;
import java.util.Scanner;

public class excercise01 {

	public static void main(String[] args) {
		System.out.println("첫 번째 숫자를 입력하세요:");
		
		Scanner s = new Scanner(System.in); // Scanner s로 사용자에게 정수를 입력받음
		int x = s.nextInt(); 
		
		System.out.println("두 번째 숫자를 입력하세요:");

		Scanner t = new Scanner(System.in); // Scanner s로 사용자에게 정수를 입력받음
		int y = s.nextInt(); 
		
		System.out.println("두수의 합:");
		System.out.println(x+y);
		
	}
}

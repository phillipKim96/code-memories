package Chap0402;
import java.util.Scanner;
public class excercise07 {

	public static void main(String[] args) {
		
		System.out.println("첫 번째 숫자를 입력하세요:");		
		Scanner s = new Scanner(System.in);
		int a = s . nextInt();
		
		System.out.println("사측연산 기호를 입력하시오:");		
		Scanner t = new Scanner(System.in);
		String op =  t .nextLine();
		
		System.out.println("두 번째 숫자를 입력하세요:");		
		Scanner n = new Scanner(System.in);
		int c = s . nextInt();
		
		
		switch(op) 
		{
		case "+":
			System.out.print(a+op+c + "=");
			System.out.print(a+c);
			break;
		
		case "-":
			System.out.print(a+op+c + "=");
			System.out.print(a-c);
			break;

			
		case "*":
			System.out.print(a+op+c + "=");
			System.out.print(a*c);
			break;

		case "/":
			System.out.print(a+op+c + "=");
			System.out.print(a/c);
			break;

		}			
	}
}

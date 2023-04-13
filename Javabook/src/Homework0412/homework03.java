package Homework0412;
import java.util.Scanner;

public class homework03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int a=s.nextInt();
		
		switch(a%2)
		{
		case 10:

		if(a%2==0)
			System.out.println("짝수입니다.");
				break;
		default:
				
		if(a%2==1)
			System.out.println("홀수입니다.");
				break;
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}
}



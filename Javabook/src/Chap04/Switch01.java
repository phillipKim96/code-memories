package Chap04;
import java.util.Scanner;
public class Switch01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요."); 
		
		Scanner s = new Scanner(System.in); // Scanner s 를 사용하여 사용자에게 점수를 입력받음
		int num = s.nextInt();
		
		switch(num/10) //사용자에게 입력받은 값을 10으로 나눈다 
		{
			case 10: // 사용자의 점수를 10으로 나눈 값이 10 경우 와
			case 9: // 9인 경우 
				System.out.println("A학점"); // A학점을 출력한다
				break; //그리고 switch문을 빠져나온다
			case 8:  // 같은 원리로 작동한다.
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break;
		}
		
	}

}

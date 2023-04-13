package Chap04;
import java.util.Scanner;
public class Loop03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt();
		int sum = 0;
		
		do {
			sum +=x; //계속해서 더해줌
			x--; // 입력받은 숫자에서 계속해서 -를 진행해서 10보다 작아질 때 까지 진행
		}
		while (x>=10); //10보다 작아질 때 까지 진행
		System.out.println("합계:"+sum); // do 안에 내용을 다 진행하고 while문에 false이면 탈출
	}
	

}

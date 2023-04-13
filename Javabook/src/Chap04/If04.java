package Chap04;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(); // 사용자에게 정수를 x에 입력 받음
		int y = s.nextInt(); // 사용자에게 정수를 y에 입력 받음
		int z = s.nextInt(); // 사용자에게 정수를 z에 입력 받음
		
		if(x>y) // 1차 비교
		{
		if(x>z) {System.out.println(x + "는 가장 큰 정수입니다.");} //2차 비교까지 맞을 시 해당 내용 출력
		else {System.out.println(x + "는 가장 큰 정수가 아닙니다.");} // 2차 비교가 맞지 않을 시 출력
		}
		else {System.out.println(x + "는 가장 큰 정수가 아닙니다."); // 1차 비교가 맞지 않을 시 출력
		}
 }
}

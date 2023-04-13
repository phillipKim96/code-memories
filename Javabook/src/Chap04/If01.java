package Chap04;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이를 입력하세요.");
		
		Scanner s = new Scanner(System.in); //scanner s로 사용자에게 age 입력값을 입력받음
		int age = s.nextInt(); 
		
		if(age>=18) {
			System.out.println("당신의 나이는 18세 이상입니다."); //입력받은 age 값이 18보다 크거나 같은지 확인
			System.out.println("당신은 투표할 자격이 있습니다."); //크다면 이 문장 출력
		}
		
		System.out.println("이 문장이 if문 외부에 있습니다."); // 작다면 if문을 빠져나와 이 문장 출력
	}
}

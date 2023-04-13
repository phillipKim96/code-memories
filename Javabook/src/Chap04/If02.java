package Chap04;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // Scanner s로 사용자에게 정수를 입력받음
		int num = s.nextInt(); // 
		
		if(num%2==0) {System.out.println(num + "은 짝수입니다.");} // 나머기 값이 0 인 경우를 짝수로 판단 true
		else{System.out.println(num + "은 홀수입니다.");} // 나머지 값이 있는 경우 else로 받아서 해당 문장 출력
		System.out.println("이 문장은 if문 외부에 있습니다."); // else면 if문 밖으로 나가게 됨으로 이 문장도 같이 출력 
	}
}

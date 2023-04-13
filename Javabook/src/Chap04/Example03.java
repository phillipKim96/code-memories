package Chap04;

public class Example03 {

	public static void main(String[] args) {
		int num = 20;
		
		if(num == 10) {System.out.println("숫자가 10입니다.");} // true인 경우
		else if(num == 15) {System.out.println("숫자가 15입니다.");} // num이 이 숫자인 경우 출력 그렇지 않으면 다음으로 
		else if(num == 20) {System.out.println("숫자가 20입니다.");} // num이 이 숫자인 경우 출력 / 그렇지 않으면 밑으로
		else {System.out.println("숫자가 존재하지 않습니다.");}	// 위 else if 구문에 전부 해당하지 않는 경우 출력
	}
}

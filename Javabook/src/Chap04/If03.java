package Chap04;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		
		if(grade >=90) {System.out.println("A학점");} // 사용자의 입력 숫자가 90 이상인 경우 A출력
		else if(grade >=80) {System.out.println("B학점");} // 사용자의 입력 숫자가 80 이상인 경우 B출력 
		else if(grade >=70) {System.out.println("C학점");} // 사용자의 입력 숫자가 70 이상인 경우 C출력
		else if(grade >=60) {System.out.println("D학점");} // 사용자의 입력 숫자가 60 이상인 경우 D출력
		else if(grade >=50) {System.out.println("F학점");} // 사용자의 입력 숫자가 50 이상인 경우 F출력
 }
}
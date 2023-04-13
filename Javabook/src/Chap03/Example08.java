package Chap03;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("당신의 이름을 입력하세요."); 
		String name = input.nextLine(); // 한 행의 문자열을 받음 
		System.out.println("당신의 이름:" + name); //받은 문자열 출력
	}

}

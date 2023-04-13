package Chap03;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("정숫값 입력하기"); //값 받아오기
		int n = s1.nextInt(); // s1에 int값 받아올 예정
		
		System.out.println("실숫값 입력하기");
		double db = s1.nextDouble(); // s1에 double 값을 받아올 예정
		System.out.println("정숫값"+n);
		System.out.println("실숫값:"+db);

	}

}

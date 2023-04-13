package Chap0402;

import java.util.Scanner;

public class excercise06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("길이:");
		int len = s.nextInt(); // 길이를 입력받음

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2+1; j++) {
				System.out.print("*"); // 별을 찍는 포문 
			}
			System.out.println();
		}
	}

}

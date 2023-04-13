package Chap04;

import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("길이:");

		int len = s.nextInt();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * len) - 1 - (i * 2); j++) {
				System.out.print("*"); // 별을 찍는 포문 
			}
			System.out.println(" ");
		}
	}

}

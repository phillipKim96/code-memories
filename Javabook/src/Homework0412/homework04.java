package Homework0412;

import java.util.Scanner;

public class homework04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while (choice == 1) // 숫자가 1이면 while문이 반복
			{
			int a;

			System.out.println("숫자를 입력하시오");
			a = s.nextInt();

			if (a % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			}

	}

}
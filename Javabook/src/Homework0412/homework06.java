package Homework0412;

import java.util.Scanner;

public class homework06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("길이:");
		int i = 1;
		int j = 1;
		int len = s.nextInt();

		while (i <= len) {
			while (j < i + 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}
	}
}

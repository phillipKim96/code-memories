package Homework0412;

import java.util.Scanner;

public class homework05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("길이:");
		int i;
		int len = s.nextInt();

			for(i=0; i<len; i++) {
			for (int j = 0; j < (2 *i) + 1; j++) 
				System.out.print("*"); // 별을 찍는 포문 
				System.out.println(" ");
			}
		
		}
	}



package Chap0402;

import java.util.Scanner;

public class exvercise02 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int sum = 0;
		
		System.out.println("첫 번째 숫자를 입력하세요:");		
		Scanner s = new Scanner(System.in);
		int a = s . nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요:");		
		Scanner t = new Scanner(System.in);
		int b = s . nextInt();
		
		
		for(i=a;a<b+1;a++)
		{
			if(a%3==0) 
			{
				System.out.print(a+" ");
				sum = a+sum;
			}
		}
		System.out.println("입력받은 두 숫자 중 3의 배수의 합:" + sum);

 }
	}		

		
	



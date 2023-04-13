package Homework0412;
import java.util.Scanner;

public class homework02 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num >= 90)
		{
			System.out.println("A학점"); 
		}
			else if(num >=80 )
			{
				System.out.println("B학점");
			}
				else if(num >=70 )
				{
					System.out.println("C학점");		
				}
					else if(num >=60 )
					{
					System.out.println("D학점");		
					}
					else
					{
						System.out.println("F학점");
					}
			
		}
		
		
	}



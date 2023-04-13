package Homework0412;
import java.util.Scanner;
public class homework08 {

	public static void main(String[] args) {
		System.out.println("1:검샘 2:등록 3:삭제 4:변경");
		
		Scanner s = new Scanner(System.in);
		int select = s.nextInt();
		
		switch(select) 
		{
		case 1:
			System.out.println("검색합니다.");
			break;
		case 2:
			System.out.println("등록합니다.");
			break;
		case 3:
			System.out.println("삭제합니다.");
			break;
		case 4:
			System.out.println("변경합니다.");
			break;
		default:
			System.out.println("아무것도 하지 않습니다.");
			break;
		}
	}
}

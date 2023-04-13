package Chap04;

public class Example06 {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("매우우수");
			break; // break를 걸어줘서 switch 밖으로 내보내야함
		case 'B':
			System.out.println("우수");
			break;
		case 'C':
			System.out.println("좋음");
			break;
		case 'D':
			System.out.println("좀 더 열심히");
			break;
		case 'F':
			System.out.println("미흡");
			break;
		default: // 꼭 써주지 않아도 됌
			System.out.println("잘못된 등급");

		}
	}

}

package Homework0411;

public class homework08 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int) d; // score에서 int를 정수형으로 받아서 .0이 사라짐

		System.out.println("score=" + score); // int로 캐스팅 했기에 결과값85
		System.out.println("d=" + d); // 캐스팅 하지 않은 상태의 d는 여전히 double형
	}

}

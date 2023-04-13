package Homework0411;

public class homework09 {

	public static void main(String[] args) {
		float f = 9.123456789f;
		double d = 9.123456789;
		double d2 = (double) f;

		System.out.println("f=" + f);// 실수형이기 때문에 뒤에 f 생략 + 4바이트이기 때문에 소수점 6번째 자리 까지
		System.out.println("d=" + d); // 8바이트이기때문에 전체 다 출력 가능
		System.out.println("d2=" + d2); // 캐스팅으로 float > doube로 형변환을 해주고 츨력할 수 있는 만큼 출력 후 쓰레기값 출력

	}

}

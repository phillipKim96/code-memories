package Chap03;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x++); // x값 10 출력 but 실질적으로 11
		System.out.println(++x); // x값 11에 +1을 먼저 해줌
		System.out.println(x--); // x값은 12이지만 but 실질적으로 11
		System.out.println(--x); // x값은 11이지만 -1을 먼저 해주기 때문에 값은 10

	}

}

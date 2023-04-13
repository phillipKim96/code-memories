package Homework0411;

public class homework07 {

	public static void main(String[] args) {
		String s = "12345";
		int i = Integer.parseInt(s);
		System.out.printf("문자를 숫자로 %d(%d)\n", i, i + 10);
		// i = s의 int형 즉 숫자 12345 / i + 10은 i가 int로 캐스팅이 된 상태이기 때문에 정수형이다 그렇기 때문에
		// 12345+10=12355
		String a;
		a = String.format("%d", i);
		System.out.printf("숫자를 문자로 %s(%s)\n", a, a + "abcde");
		// a라는 string에 i 값을 넣었음(숫자를 문자로 바꿨음) 즉 문자로 받아들여져서 숫자끼리 더해지는 것이 아닌 문자 그대로 출력
	}

}

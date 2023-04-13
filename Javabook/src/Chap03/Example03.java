package Chap03;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x < 10 && x < 20); // &&연산자 두 값이 다 true 여야만함
		System.out.println(x < 10 || x < 20); // or연산자 둘 중 하나만 true여도 true
		System.out.println(!(x < 10 && x < 20)); // not연산자를 활용하여 false값을 true로 변환

	}

}

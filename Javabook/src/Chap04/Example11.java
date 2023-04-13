package Chap04;

public class Example11 {

	public static void main(String[] args) {
		for(int n = 1; n <= 5; n++) { //5번 반복될 예정
			System.out.println("*");
			if(n==2) { //그러나 n이 2이면 브레이크문 작동할기 때문에 별을 찍을 예정
				break;
			}
		}
	}
}
